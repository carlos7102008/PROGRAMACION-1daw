/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;
import java.util.Scanner;

public class Ejercicio_32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        String fraseMinusculas = frase.toLowerCase();
        int contadorVocales = 0;

        for (int i = 0; i < fraseMinusculas.length(); i++) {
            char caracter = fraseMinusculas.charAt(i);

            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contadorVocales++;
            }
        }

        System.out.println("La frase contiene " + contadorVocales + " vocales.");

    }
}