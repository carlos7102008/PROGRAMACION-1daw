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
public class Ejercicio_26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Nombre : " + nombre);

        System.out.print("Introduce tu primer apellido: ");
        String apellido1 = sc.nextLine();

        System.out.println("Nombre : " + apellido1);

        System.out.print("Introduce tu segundo apellido: ");
        String apellido2 = sc.nextLine();

        System.out.println("Nombre : " + apellido2);

        String iniciales = "" + nombre.charAt(0) + apellido1.charAt(0) + apellido2.charAt(0);
        
        System.out.println(" Iniciales : " + iniciales);
    }
}
