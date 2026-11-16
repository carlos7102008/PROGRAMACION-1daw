/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author USUARIO
 */
public class Ejercicio_12 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // 1. Crear el array de enteros
            int[] numeros = {12, 5, 8, 21, 4, 16, 9};

            // Mostramos el array (opcional, pero útil para que el usuario sepa qué buscar)
            System.out.println("Array actual: " + Arrays.toString(numeros));

            // 2 y Ampliación. Definir la variable y solicitar el número por teclado
            System.out.print("Introduce el número que quieres buscar: ");
            int numeroABuscar = scanner.nextInt();

            // Variable "bandera" para saber si hemos encontrado el número
            boolean encontrado = false;

            // 3. Recorrer el array
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] == numeroABuscar) {
                    encontrado = true; // ¡Lo encontramos!
                    break; // Rompemos el bucle, ya no hace falta seguir buscando
                }
            }

            // 4. Mostrar el mensaje indicando si se ha encontrado
            System.out.println("\n--- Resultado de la búsqueda ---");
            if (encontrado) {
                System.out.println(" El número " + numeroABuscar + " SÍ está presente en el array.");
            } else {
                System.out.println(" El número " + numeroABuscar + " NO está presente en el array.");
            }

        }
    }

