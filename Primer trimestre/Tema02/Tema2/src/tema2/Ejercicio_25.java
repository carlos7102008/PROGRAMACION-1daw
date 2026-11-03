/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema_02;

import java.util.Scanner;

/**
 *
 * @author 15_1DAW
 */
public class Ejercicio_25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el numero el cual quieres calcular el factorial");
        int numero = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;

        }
        System.out.println(factorial);
    }
}

