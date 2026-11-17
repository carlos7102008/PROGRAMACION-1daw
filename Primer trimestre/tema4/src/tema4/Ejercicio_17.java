/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;
import java.util.Arrays;

/**
 *
 * @author 15_1DAW
 */
public class Ejercicio_17 {

    public static void main(String[] args) {
        int[] numeros = {12, 5, 8, 20, 3, 14, 7};

        System.out.println("Array original:");
        mostrar(numeros);

        System.out.println("Suma total: " + suma(numeros));
        System.out.println("Media: " + calcularMedia(numeros));
        System.out.println("Valor máximo: " + obtenerMaximo(numeros));
        System.out.println("Cantidad de números pares: " + contarPares(numeros));

        // Prueba de la ampliación
        int valorBuscado = 20;
        int posicion = buscarPosicion(numeros, valorBuscado);
        System.out.println("La posición del número " + valorBuscado + " es: " + posicion);

        int valorNoExistente = 99;
        System.out.println("La posición del número " + valorNoExistente + " es: " + buscarPosicion(numeros, valorNoExistente));
    } // Solo una llave aquí para cerrar el main

    public static void mostrar(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]); // Cambiado a print
            if (i < numeros.length - 1) {
                System.out.print(", "); // Cambiado a print
            }
        }
        System.out.println(); // Salto de línea al final
    }

    public static double suma(int[] numeros) {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return suma;
    }

    public static double calcularMedia(int[] numeros) {
        int sumaInterna = 0;
        for (int num : numeros) {
            sumaInterna += num;
        }
        return (double) sumaInterna / numeros.length;
    }

    public static int obtenerMaximo(int[] numeros) {
        int max = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }
        return max;
    }

    public static int contarPares(int[] numeros) {
        int contador = 0;
        for (int num : numeros) {
            if (num % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }

    // Método de la ampliación
    public static int buscarPosicion(int[] numeros, int valor) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valor) {
                return i;
            }
        }
        return -1;
    }
} 