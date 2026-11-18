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
public class Ejercicio_22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        String palabra = sc.next();

        int longitud = palabra.length();
        String primerCaracter = palabra.substring(0, 1);
        String ultimoCaracter = palabra.substring(longitud - 1);

        System.out.println("\nPalabra introducida: " + palabra);
        System.out.println("Longitud: " + longitud);
        System.out.println("Primer carácter: " + primerCaracter);
        System.out.println("Último carácter: " + ultimoCaracter);

        if (longitud > 10) {
            System.out.println("La palabra tiene más de 10 caracteres.");
        } else {
            System.out.println("La palabra tiene 10 caracteres o menos.");
        }

    }
}

