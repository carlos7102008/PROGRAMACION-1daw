/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Ejercicio_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce tu primer apellido: ");
        String apellido1 = sc.nextLine();

        System.out.print("Introduce tu segundo apellido: ");
        String apellido2 = sc.nextLine();

        String nombreCompleto = nombre + " " + apellido1 + " " + apellido2;

        System.out.println("\nNombre completo: " + nombreCompleto);
        System.out.println("Número total de caracteres: " + nombreCompleto.length());

        System.out.println("En mayúsculas: " + nombreCompleto.toUpperCase());
        System.out.println("En minúsculas: " + nombreCompleto.toLowerCase());

        System.out.println("Original: " + nombreCompleto);

    }
}

