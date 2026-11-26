import java.util.Scanner;

public class Ejercicio_29{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu nombre completo: ");
        String nombre = sc.nextLine();

        // 1. Eliminar espacios iniciales y finales
        nombre = nombre.trim();

        // 2. Mostrar el texto en mayúsculas
        System.out.println(nombre.toUpperCase());

        // 3. Mostrar el texto en minúsculas
        System.out.println(nombre.toLowerCase());

        // 4. Sustituir los espacios por guiones
        System.out.println(nombre.replace(' ', '-'));

    }
}