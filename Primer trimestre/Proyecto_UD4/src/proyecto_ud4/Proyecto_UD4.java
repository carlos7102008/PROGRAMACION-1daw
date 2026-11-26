package proyecto_ud4;

import java.util.Scanner;

/**
 *
 * @author Carlos
 * @author Daniel
 */
public class Proyecto_UD4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nombres = {"Ana", "Carlos", "María", "Pablo", "Lucía", "Diego"};
        double[] notas = {8.5, 4.2, 9.0, 6.3, 3.8, 5.0};

        int opcion = -1;

        while (opcion != 0) {
            mostrarMenu();
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (opcion) {
                case 1 ->
                    mostrarAlumnos(nombres, notas);
                case 2 ->
                    mostrarEstadisticas(notas);
                case 3 -> {
                    System.out.print("Introduce el nombre del alumno a buscar: ");
                    String buscado = sc.nextLine().trim();
                    int indice = buscarAlumno(nombres, buscado);
                    if (indice != -1) {
                        System.out.println("Alumno encontrado: " + nombres[indice] + " - " + notas[indice]);
                    } else {
                        System.out.println("No se ha encontrado ningún alumno con el nombre " + buscado);
                    }
                }
                case 4 ->
                    mostrarAprobados(nombres, notas);
                case 5 -> {
                    System.out.print("Introduce un nombre para analizar: ");
                    String nombre = sc.nextLine().trim();
                    analizarNombre(nombre);
                }
                case 6 ->
                    menuValidacionesRegex(sc);
                case 0 ->
                    System.out.println("Saliendo del gestor de alumnos...");
                default ->
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
            System.out.println();
        }

        sc.close();
    }

    public static void mostrarMenu() {
        System.out.println("===== GESTOR DE ALUMNOS =====");
        System.out.println("1. Mostrar todos los alumnos");
        System.out.println("2. Mostrar estadísticas de notas");
        System.out.println("3. Buscar alumno por nombre");
        System.out.println("4. Mostrar alumnos aprobados");
        System.out.println("5. Analizar un nombre");
        System.out.println("6. Validaciones Regex (Retos de ampliación)");
        System.out.println("0. Salir");
    }

    public static void mostrarAlumnos(String[] nombres, double[] notas) {
        System.out.println("--- LISTADO DE ALUMNOS ---");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println((i + 1) + ". " + nombres[i] + " - " + notas[i]);
        }
    }

    public static void mostrarEstadisticas(double[] notas) {
        if (notas.length == 0) {
            System.out.println("No hay notas registradas");
            return;
        }
        int aprobados = contarAprobados(notas);
        int suspensos = notas.length - aprobados;
        System.out.println("--- ESTADÍSTICAS DE NOTAS ---");
        System.out.println("Nota media: " + calcularMedia(notas));
        System.out.println("Nota máxima: " + calcularMaximo(notas));
        System.out.println("Nota mínima: " + calcularMinimo(notas));
        System.out.println("Número de aprobados: " + aprobados);
        System.out.println("Número de suspensos: " + suspensos);
    }

    public static double calcularMedia(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    public static double calcularMaximo(double[] notas) {
        double max = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > max) {
                max = notas[i];
            }
        }
        return max;
    }

    public static double calcularMinimo(double[] notas) {
        double min = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] < min) {
                min = notas[i];
            }
        }
        return min;
    }

    public static int contarAprobados(double[] notas) {
        int contador = 0;
        for (double nota : notas) {
            if (nota >= 5.0) {
                contador++;
            }
        }
        return contador;
    }

    public static int buscarAlumno(String[] nombres, String nombreBuscado) {
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscado)) {
                return i;
            }
        }
        return -1;
    }

    public static void mostrarAprobados(String[] nombres, double[] notas) {
        System.out.println("--- ALUMNOS APROBADOS ---");
        boolean hayAprobados = false;
        for (int i = 0; i < nombres.length; i++) {
            if (notas[i] >= 5.0) {
                System.out.println(nombres[i] + notas[i]);
                hayAprobados = true;
            }
        }
        if (!hayAprobados) {
            System.out.println("No hay alumnos aprobados.");
        }
    }

    public static void analizarNombre(String texto) {
        if (texto.isEmpty()) {
            System.out.println("Error: el nombre no puede estar vacío.");
            return;
        }
        System.out.println("--- ANÁLISIS DEL NOMBRE ---");
        System.out.println("Número de caracteres: " + texto.length());
        System.out.println("En mayúsculas: " + texto.toUpperCase());
        System.out.println("En minúsculas: " + texto.toLowerCase());
        System.out.println("Primera letra: " + texto.charAt(0));
        System.out.println("Número de vocales: " + contarVocales(texto));
    }

    public static int contarVocales(String texto) {
        int contador = 0;
        String vocales = "aeiouáéíóú";
        String textoMinus = texto.toLowerCase();

        for (int i = 0; i < textoMinus.length(); i++) {
            char c = textoMinus.charAt(i);
            if (vocales.indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }

    public static void menuValidacionesRegex(Scanner sc) {
        System.out.println("--- RETOS DE AMPLIACIÓN (REGEX) ---");
        System.out.println("1. Reto A: Validar código de alumno ( 3 letras y 4 numeros)");
        System.out.println("2. Reto B: Validar nombre de usuario ( Letras y numeros de 5 a 10 caracteres) ");
        System.out.println("3. Reto C: Validar solo dígitos (Regex vs Bucle)");
        System.out.print("Elige un reto: ");
        int subOpcion = sc.nextInt();
        sc.nextLine();

        switch (subOpcion) {
            case 1 -> {
                System.out.println("Introduce el codigo del alumno");
                String codigo = sc.nextLine().trim();

                if (validarCodigoAlumno(codigo)) {
                    System.out.println("El codigo: " + codigo + " es valido ");
                } else {
                    System.out.println("El codigo: " + codigo + " no es valido ");
                }
            }
            case 2 -> {
                System.out.println("Introduce nombre de usuario ¡");
                String usuario = sc.nextLine().trim();

                if (validarUsuario(usuario)) {
                    System.out.println("El usuario: " + usuario + " es valido ");
                } else {
                    System.out.println("El usuario: " + usuario + " no es valido ");
                }
            }
            case 3 -> {
                System.out.print("Introduce una cadena para comprobar si son solo dígitos: ");
                String cadena = sc.nextLine().trim();

                if (esSoloDigitosRegex(cadena)) {
                    System.out.println("Con Regex: " + cadena + " contiene SOLO dígitos.");
                } else {
                    System.out.println("Con Regex: " + cadena + " NO contiene solo dígitos.");
                }
                if (esSoloDigitoManual(cadena)) {
                    System.out.println("Con Bucle: " + cadena +  "contiene SOLO dígitos.");
                } else {
                    System.out.println("Con Bucle: " + cadena + " NO contiene solo dígitos.");
                }
            }
        }

    }

    public static boolean validarCodigoAlumno(String codigo) {
        return codigo.matches("^[A-Z]{3}\\d{4}$");
    }

    public static boolean validarUsuario(String usuario) {
        return usuario.matches("^[A-Za-z0-9]{5,10}$");
    }

    public static boolean esSoloDigitosRegex(String cadena) {
        return cadena.matches("\\d+");
    }

    public static boolean esSoloDigitoManual(String cadena) {

        for (int i = 0; i < cadena.length(); i++) {
            if (!Character.isDigit(cadena.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
