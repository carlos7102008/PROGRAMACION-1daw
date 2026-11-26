package examen_4;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class LARULE {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MarcoVentana marco = new MarcoVentana();
            marco.setVisible(true);
        });
    }
}

class MarcoVentana extends JFrame {

    public MarcoVentana() {
        setTitle("Ruleta aleatoria");
        setSize(550, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        add(new PanelPrincipal());
    }
}

class PanelPrincipal extends JPanel {

    private final PanelRuleta panelRuleta;
    private final JButton botonGirar;
    private final JButton botonReiniciar;

    public PanelPrincipal() {
        setLayout(new BorderLayout());

        panelRuleta = new PanelRuleta();
        add(panelRuleta, BorderLayout.CENTER);

        JPanel panelBotones = new JPanel();
        botonGirar = new JButton("Girar ruleta");
        botonReiniciar = new JButton("Reiniciar");

        panelBotones.add(botonGirar);
        panelBotones.add(botonReiniciar);
        add(panelBotones, BorderLayout.SOUTH);

        botonGirar.addActionListener(e -> panelRuleta.girar(botonGirar));
        botonReiniciar.addActionListener(e -> {
            panelRuleta.reiniciar();
            botonGirar.setEnabled(true);
        });
    }
}

class PanelRuleta extends JPanel {

    private final String[] nombresIniciales = {
        "Aya", "Daniel", "Carlos", "Fran", "Maitane",
        "Jose Antonio", "Alejandro", "Miguel", "Jose Luis",
        "Jose Luis Soria", "Hugo"
    };

    private final Color[] colores = {
        new Color(231, 76, 60), new Color(52, 152, 219),
        new Color(46, 204, 113), new Color(241, 196, 15),
        new Color(155, 89, 182), new Color(230, 126, 34),
        new Color(26, 188, 156), new Color(52, 73, 94),
        new Color(211, 84, 0), new Color(41, 128, 185),
        new Color(192, 57, 43)
    };

    private final ArrayList<String> listaAlumnos = new ArrayList<>();
    private final Random random = new Random();

    private double anguloBolita = 0; // En grados (0 a 360)
    private double velocidad = 0;
    private Timer timer;

    public PanelRuleta() {
        setBackground(Color.WHITE);
        reiniciar();
    }

    public void reiniciar() {
        if (timer != null && timer.isRunning()) {
            timer.stop();
        }
        listaAlumnos.clear();
        listaAlumnos.addAll(Arrays.asList(nombresIniciales));
        anguloBolita = 0;
        velocidad = 0;
        repaint();
    }

    public void girar(JButton botonGirar) {
        if (listaAlumnos.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No quedan alumnos por sortear.");
            return;
        }

        if (listaAlumnos.size() == 1) {
            String ultimo = listaAlumnos.remove(0);
            repaint();
            JOptionPane.showMessageDialog(this, "Ultimo alumno: " + ultimo);
            botonGirar.setEnabled(false);
            return;
        }

        botonGirar.setEnabled(false);

        // Velocidad inicial aleatoria entre 18 y 28 grados por fotograma
        velocidad = 18 + random.nextDouble() * 10;

        timer = new Timer(16, e -> {
            anguloBolita = (anguloBolita + velocidad) % 360;
            velocidad *= 0.985; // Frenado progresivo

            if (velocidad < 0.15) {
                timer.stop();
                velocidad = 0;
                determinarGanador(botonGirar);
            }
            repaint();
        });

        timer.start();
    }

    private void determinarGanador(JButton botonGirar) {
        double anguloSector = 360.0 / listaAlumnos.size();
        double anguloNormalizado = ((anguloBolita % 360) + 360) % 360;
        int indice = (int) (anguloNormalizado / anguloSector);

        if (indice >= listaAlumnos.size()) {
            indice = listaAlumnos.size() - 1;
        }

        String ganador = listaAlumnos.get(indice);
        JOptionPane.showMessageDialog(this, "Alumno seleccionado: " + ganador);

        listaAlumnos.remove(indice);
        repaint();

        if (!listaAlumnos.isEmpty()) {
            botonGirar.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this, "Ya han salido todos los alumnos.");
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int cx = getWidth() / 2;
        int cy = getHeight() / 2;
        int radio = Math.min(getWidth(), getHeight()) / 2 - 40;

        if (listaAlumnos.isEmpty()) {
            g2.setColor(Color.DARK_GRAY);
            g2.setFont(new Font("SansSerif", Font.BOLD, 18));
            g2.drawString("Pulsa Reiniciar para volver a empezar", cx - 160, cy);
            return;
        }

        double anguloSector = 360.0 / listaAlumnos.size();

        // 1. Dibujar los sectores de la ruleta
        for (int i = 0; i < listaAlumnos.size(); i++) {
            int anguloInicio = (int) Math.round(i * anguloSector);
            int anguloExtension = (int) Math.ceil(anguloSector);

            g2.setColor(colores[i % colores.length]);
            g2.fillArc(cx - radio, cy - radio, radio * 2, radio * 2, anguloInicio, anguloExtension);

            g2.setColor(Color.WHITE);
            g2.setStroke(new BasicStroke(2));
            g2.drawArc(cx - radio, cy - radio, radio * 2, radio * 2, anguloInicio, anguloExtension);

            // 2. Dibujar el nombre dentro del sector
            double anguloMedio = i * anguloSector + anguloSector / 2.0;
            Graphics2D gTexto = (Graphics2D) g2.create();
            gTexto.translate(cx, cy);
            gTexto.rotate(-Math.toRadians(anguloMedio));
            gTexto.setColor(Color.WHITE);
            gTexto.setFont(new Font("SansSerif", Font.BOLD, 12));
            gTexto.drawString(listaAlumnos.get(i), (int) (radio * 0.35), 5);
            gTexto.dispose();
        }

        // Borde exterior de la ruleta
        g2.setColor(Color.DARK_GRAY);
        g2.setStroke(new BasicStroke(4));
        g2.drawOval(cx - radio, cy - radio, radio * 2, radio * 2);

        // Circulo central decorativo
        g2.setColor(Color.WHITE);
        g2.fillOval(cx - 25, cy - 25, 50, 50);
        g2.setColor(Color.DARK_GRAY);
        g2.drawOval(cx - 25, cy - 25, 50, 50);

        // 3. Dibujar la bolita
        double rad = Math.toRadians(anguloBolita);
        int radioBolita = radio - 18;
        int bx = cx + (int) (radioBolita * Math.cos(rad));
        int by = cy - (int) (radioBolita * Math.sin(rad));
        int tamanoBolita = 16;

        g2.setColor(Color.WHITE);
        g2.fillOval(bx - tamanoBolita / 2, by - tamanoBolita / 2, tamanoBolita, tamanoBolita);
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(2));
        g2.drawOval(bx - tamanoBolita / 2, by - tamanoBolita / 2, tamanoBolita, tamanoBolita);
    }
}