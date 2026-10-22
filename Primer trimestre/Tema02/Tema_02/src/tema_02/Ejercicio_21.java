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
public class Ejercicio_21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el numero del cual te voy a decir la tabla de multiplicar \n");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int tabla =  i * num;
                System.out.println(tabla);
            
            }
        }
    }

