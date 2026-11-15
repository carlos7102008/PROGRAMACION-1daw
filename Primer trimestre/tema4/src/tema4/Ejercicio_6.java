/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author USUARIO
 */
public class Ejercicio_6 {
    public static void main(String[] args) {
        int[] numeros = {12, 5, 8, 20, 3, 15};

        // 1. Mostrar todos los números utilizando un for
        System.out.println("1. Recorrido con bucle for tradicional:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("\n");

        // 2. Mostrar todos los números utilizando un for-each
        System.out.println("2. Recorrido con bucle for-each:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println("\n");

        // 3. Mostrar únicamente los números mayores que 10
        System.out.println("3. Números mayores que 10:");
        for (int numero : numeros) {
            if (numero > 10) {
                System.out.print(numero + " ");
            }
        }
        System.out.println();
    }
}

