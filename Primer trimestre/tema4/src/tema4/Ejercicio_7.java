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
public class Ejercicio_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declarar e inicializar el array para 7 días
        double[] temperaturas = new double[7];

        // 1. Solicitar las siete temperaturas
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Introduce la temperatura del día " + (i + 1) + ": ");
            // Se asume que el usuario introduce valores numéricos válidos (ej. 24.5 o 24,5 dependiendo del locale)
            temperaturas[i] = scanner.nextDouble();
        }

        // 2. Mostrar todas las temperaturas
        System.out.print("\nTemperaturas registradas: ");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print(temperaturas[i] + "  ");
        }
        System.out.println(); // Salto de línea

        // Inicializar variables usando el primer elemento del array como referencia
        double sumaTemperaturas = 0;
        double tempMaxima = temperaturas[0];
        double tempMinima = temperaturas[0];
        int diasMas25 = 0;

        // Recorrer el array para realizar los cálculos (condición obligatoria del ejercicio)
        for (int i = 0; i < temperaturas.length; i++) {
            double tempActual = temperaturas[i];

            // Sumar para la media
            sumaTemperaturas += tempActual;

            // 4. Comprobar temperatura máxima
            if (tempActual > tempMaxima) {
                tempMaxima = tempActual;
            }

            // 5. Comprobar temperatura mínima
            if (tempActual < tempMinima) {
                tempMinima = tempActual;
            }

            // 6. Contar días con más de 25 grados
            if (tempActual > 25) {
                diasMas25++;
            }
        }

        // 3. Calcular la temperatura media
        double tempMedia = sumaTemperaturas / temperaturas.length;

        // Mostrar los resultados
        System.out.printf("\nTemperatura media: %.2f grados\n", tempMedia);
        System.out.println("Temperatura máxima: " + tempMaxima + " grados");
        System.out.println("Temperatura mínima: " + tempMinima + " grados");
        System.out.println("Días con más de 25 grados: " + diasMas25);

        scanner.close();
    }
}

