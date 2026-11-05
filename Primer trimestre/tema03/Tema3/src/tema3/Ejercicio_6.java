
import java.util.Scanner;

public class Ejercicio_6 {



    public static void main(String[] args) {
        System.out.print("Introduce la primera nota: ");
        double nota1 = leerNota();

        System.out.print("Introduce la segunda nota: ");
        double nota2 = leerNota();

        System.out.print("Introduce la tercera nota: ");
        double nota3 = leerNota();

        double media = calcularMedia(nota1, nota2, nota3);
        double maxima = obtenerNotaMaxima(nota1, nota2, nota3);
        boolean aprobado = estaAprobado(media);

        // Mostrar los resultados
        mostrarResultados(media, maxima, aprobado);

    }

    // Método para leer una nota por teclado y devolverla
    public static double leerNota() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextDouble();
    }

    // Método para calcular y devolver la media de las tres notas
    public static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    // Método para calcular y devolver la nota más alta
    public static double obtenerNotaMaxima(double nota1, double nota2, double nota3) {
        double maxima = nota1;

        if (nota2 > maxima) {
            maxima = nota2;
        }

        if (nota3 > maxima) {
            maxima = nota3;
        }

        return maxima;
    }

    // Método que devuelve true si la media es mayor o igual a 5
    public static boolean estaAprobado(double media) {
        return media >= 5;
    }

    // Método que no devuelve nada (void) y solo imprime el informe final
    public static void mostrarResultados(double media, double maxima, boolean aprobado) {
        System.out.println("\n--- INFORME ACADÉMICO ---");
        System.out.println("Media: " + media);
        System.out.println("Nota máxima: " + maxima);

        if (aprobado) {
            System.out.println("Resultado: APROBADO");
        } else {
            System.out.println("Resultado: SUSPENSO");
        }
    }
}