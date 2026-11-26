/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_4;

import java.util.Scanner;

/**
 *
 * @author 15_1DAW
 */
public class Ejercicio_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // apartado A
        int cantidad = 0;
        do {
            System.out.print("¿Cuántas palabras vas a introducir? (máximo 10): ");
            cantidad = sc.nextInt();
        } while (cantidad < 1 || cantidad > 10);

        String[] palabras = new String[cantidad];
        int[] longitudes = new int[cantidad];
        int[] vocales = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Introduce la palabra " + (i + 1) + ": ");
            palabras[i] = sc.next();
            longitudes[i] = palabras[i].length();
            vocales[i] = contarVocales(palabras[i]);
        }

        System.out.println(" Resumen de palabras ");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(palabras[i] + " Longitud: " + longitudes[i] + " \n Vocales: " + vocales[i]);
        }

        //Apartado B, 2
        for (int i = 0; i < cantidad; i++) {
            int contador = vocales[i];
            int anterior = contador;
            if (contador > anterior) {
                //si contador es mayor que el anterior lo almacena 
                int contadormax = contador;
            }
        }
        // Apartado B, 3
        
        
        // Apartado B, 4
        palabraCoincide = palabras.toString().indexOf() && palabra.toString().indexOn();
        System.out.println("Esta palabra empieza y ermina con la misma letra "
                + palabrasCoincide);

        // Apartado C
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Introduce una expresion regular");
            String expresion = sc.next();
            int contadorEx = 0;
            if (palabras[i].matches(expresion)) {
                contadorEx++;
                System.out.println("La palabra contiene esa expresion");

                System.out.println("La palabra contiene un total de " + contadorEx + " expresiones");

            }

        }

        //Apartado D, 2
        for (int i = 0; i < cantidad; i++) {
            if (palabras[i].matches("[a-z]")) {
                System.out.println("La palabra solo tiene letras");

                System.out.println("");

            }

        }
        // Apartado D, 3
        for (int i = 0; i < cantidad; i++) {
            System.out.println("introduce una letra ");
            String letra = sc.next();
            if (palabras[i].equalsIgnoreCase(letra)) {
                System.out.println("La palabra contiene la letra introducida");
                System.out.println("");

            }

        }

    }

    public static int contarVocales(String palabra) {
        int contador = 0;
        String texto = palabra.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }
}
