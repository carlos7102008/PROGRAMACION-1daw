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
public class Ejercicio_25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserta tu nombre de usuario");
        String usuario = sc.nextLine();

        int longitud = usuario.length();
        if (longitud > 15) {
            System.out.println("La palabra tiene más de 15 caracteres.");
        }
        if (longitud < 5) {
            System.out.println("La palabra tiene menos de 5 caracteres.");
        } else {
            System.out.println("tiene unos caracteres correctos ");
        }

        String vacio = "";

        boolean sonIguales = usuario.equals(vacio);
        System.out.println("Esta vacio: \n"
                + sonIguales);

        boolean tieneEspacios = usuario.contains(" ");

        if (tieneEspacios) {
            System.out.println("El nombre de usuario no puede contener espacios.");
        } else {
            System.out.println("El nombre de usuario no tiene espacios.");
        }
    }

}
