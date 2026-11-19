import java.util.Scanner;

public class Ejercicio_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        System.out.print("Introduce una palabra: ");
        String palabra = sc.nextLine();

        frase = frase.trim().toLowerCase();
        palabra = palabra.trim().toLowerCase();

        // 1. Si la frase contiene la palabra (
        System.out.println("¿Contiene la palabra?: " + frase.contains(palabra));

        // 2. En qué posición aparece por primera vez 
        int posicion = frase.indexOf(palabra);
        if (posicion != -1) {
            System.out.println("Primera aparición en la posición: " + posicion);
        } else {
            System.out.println("La palabra no aparece en la frase.");
        }

        // 3. Si la frase comienza por esa palabra 
        System.out.println("¿Comienza por la palabra?: " + frase.startsWith(palabra));

        // 4. Si la frase termina por esa palabra 
        System.out.println("¿Termina por la palabra?: " + frase.endsWith(palabra));

    }
}