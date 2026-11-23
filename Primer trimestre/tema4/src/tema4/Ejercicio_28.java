import java.util.Scanner;

public class Ejercicio_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        System.out.print("Introduce la posición de inicio: ");
        int inicio = sc.nextInt();

        int fin = frase.length();

        if (inicio >= 0 && fin <= frase.length() && inicio <= fin) {
            String subcadena = frase.substring(inicio, fin);
            System.out.println("Subcadena: " + subcadena);
        } else {
            System.out.println("Error: las posiciones introducidas no son válidas.");
        }

        // Ampliación: extraer la primera palabra
        String fraseLimpia = frase.trim();
        int primerEspacio = fraseLimpia.indexOf(" ");

        if (primerEspacio != -1) {
            String primeraPalabra = fraseLimpia.substring(0, primerEspacio);
            System.out.println("Primera palabra: " + primeraPalabra);
        } else {
            System.out.println("Primera palabra: " + fraseLimpia);
        }

        sc.close();
    }
}