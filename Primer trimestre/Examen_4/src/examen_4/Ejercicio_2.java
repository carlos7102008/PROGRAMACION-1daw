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
public class Ejercicio_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();

        System.out.println("Longitud: " + frase.length() + " caracteres");

        System.out.println("El primer caracter de esta frase es: " + frase.charAt(0));
            System.out.println("El primer caracter de esta frase es: " + frase.charAt(frase.length() - 1));

        System.out.println("Frase en mayusculas " + frase.toUpperCase());
        System.out.println("Frase en minusculas " + frase.toLowerCase());

        System.out.println("Dime que palabra deseas buscar en la frase:");
        String buscar = sc.nextLine();

        System.out.println("¿Contiene la palabra?: " + frase.contains(buscar));

        System.out.println("Dime que palabra deseas buscar en el inicio de la frase:");
        String buscarInicio = sc.nextLine();

        System.out.println("¿La frase empieza por " + buscarInicio + "?: " + frase.startsWith(buscarInicio));

        System.out.println("Dime otra frase para ver si coincide con la enterior: ");
        String fraseNueva = sc.nextLine();

        System.out.println("Coincide " + frase.equals(fraseNueva));

    }
}
