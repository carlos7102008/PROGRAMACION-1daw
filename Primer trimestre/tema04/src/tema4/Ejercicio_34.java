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
public class Ejercicio_34 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta una frase");
        String frase = sc.nextLine();
        System.out.print("Introduce el carácter a buscar: ");
        char caracter = sc.nextLine().charAt(0);

        int contador = 0;
        int primeraPosicion = frase.indexOf(caracter);
        int ultimaPosicion = frase.lastIndexOf(caracter);

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == caracter) {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("El carácter '" + caracter + "' sí aparece en la frase.");
            System.out.println("Número de veces que aparece: " + contador);
            System.out.println("Posición de la primera aparición: " + primeraPosicion);
            System.out.println("Posición de la última aparición: " + ultimaPosicion);
        } else {
            System.out.println("El carácter '" + caracter + "' no aparece en la frase.");
        }

    }
}
    
