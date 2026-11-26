/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_4;

import java.util.Scanner;

/**
 *
 * @author 15_1DAW
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el nombre del primer participante");
        String nombre = sc.nextLine();
        System.out.println("Dime el edad del primer participante");
        int edad = sc.nextInt();

        System.out.println("Dime el nombre del segundo participante");
        String nombre2 = sc.nextLine();
        System.out.println("Dime el edad del segundo participante");
        int edad2 = sc.nextInt();

        System.out.println("DATOS GUARDADOS");
        System.out.println("Primer participante se llama "+ nombre + "y su edad es: " + edad);
        System.out.println("segundo participante se llama "+ nombre + "y su edad es: " + edad);
        
        if (edad > 18 && edad2  > 18){
            System.out.println("Ambos  son mayor de edad");
        }else if(edad > 18){
            System.out.println(nombre + " es mayor de edad");
        } else if (edad2 > 18){
            System.out.println(nombre2 + "es mayor de edad");
        }
    }

}
