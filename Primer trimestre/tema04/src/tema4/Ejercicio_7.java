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

        // Declaramos el array para 7 días
        double[] temperaturas = new double[7];

        //Solicitar las temperaturas
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Introduce la temperatura del día " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
        }

        //Mostrar las temperaturas
        System.out.println("Temperaturas introducidas: ");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print(temperaturas[i] + "  ");
        }
        System.out.println();

        // Inicializar variables 
        double sumaTemperaturas = 0;
        double tempMaxima = temperaturas[0];
        double tempMinima = temperaturas[0];
        int diasMas25 = 0;

        // Recorrer el array para realizar los cálculos 
        for (int i = 0; i < temperaturas.length; i++) {
            double tempActual = temperaturas[i];

            // Sumar para la media
            sumaTemperaturas += tempActual;

            // Comprobar temperatura máxima
            if (tempActual > tempMaxima) {
                tempMaxima = tempActual;
            }

            // Comprobar temperatura mínima
            if (tempActual < tempMinima) {
                tempMinima = tempActual;
            }

            // Contar días con más de 25 grados
            if (tempActual > 25) {
                diasMas25++;
            }
        }

        //Calcular la temperatura media
        double tempMedia = sumaTemperaturas / temperaturas.length;

        // Mostrar los resultados
        System.out.println("Temperatura media: " + tempMedia + " grados");
        System.out.println("Temperatura máxima: " + tempMaxima + " grados");
        System.out.println("Temperatura mínima: " + tempMinima + " grados");
        System.out.println("Días con más de 25 grados: " + diasMas25);

    }
}
