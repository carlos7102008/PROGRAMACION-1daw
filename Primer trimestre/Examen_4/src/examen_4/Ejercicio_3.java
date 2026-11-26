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
public class Ejercicio_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] temperaturas = new double[3][4];

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Localidad " + (i + 1));
            for (int j = 0; j < temperaturas[i].length; j++) {
                System.out.print("Introduce la temperatura del Día " + (j + 1) + ": ");
                temperaturas[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Tabla de temperaturas");
        System.out.println("Día 1  \t dia 2  \t dia3  \t dia4");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Localidad " + (i + 1) + ":\t");
            for (int j = 0; j < temperaturas[i].length; j++) {
                System.out.print(temperaturas[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println(" Media por localidad ");
        for (int i = 0; i < temperaturas.length; i++) {
            double sumaLocalidad = 0;
            for (int j = 0; j < temperaturas[i].length; j++) {
                sumaLocalidad += temperaturas[i][j];
            }
            double media = sumaLocalidad / temperaturas[i].length;
            System.out.println("Localidad " + (i + 1) + ": " + media + " ºC");
        }

        double maxima = temperaturas[0][0];
        int localidadMax = 0;
        int diaMax = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            for (int j = 0; j < temperaturas[i].length; j++) {
                if (temperaturas[i][j] > maxima) {
                    maxima = temperaturas[i][j];
                    localidadMax = i;
                    diaMax = j;
                }
            }
        }
        System.out.println("temperatura maxima : " + maxima);
        System.out.println("Esta  temperatura se produjo en el dia " + diaMax + " en la localidad " + localidadMax);
    }
}