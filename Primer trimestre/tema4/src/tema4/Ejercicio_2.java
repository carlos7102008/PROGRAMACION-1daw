/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author 15_1DAW
 */
public class Ejercicio_2 {

    public static void main(String[] args) {
        double[] temperaturas = new double[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca 5 temperaturas");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("temperatura " + (i + 1) + " : ");

            temperaturas[i] = sc.nextDouble();
        }
        System.out.println(" \n temperaturas introducidas: ");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("- " + temperaturas[i]);
        }
        System.out.println("Total de temperaturas: " + temperaturas.length);
    }
}
