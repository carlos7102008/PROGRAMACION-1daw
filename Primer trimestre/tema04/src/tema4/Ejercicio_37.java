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
public class Ejercicio_37 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String codigo;
        while (true) {
            System.out.print("Introduce un código de producto (o SALIR para terminar): ");
            codigo = sc.nextLine();

            if (codigo.equalsIgnoreCase("SALIR")) {
                System.out.println("Programa finalizado.");
                break;
            }

            if (codigo.matches("[A-Z]{2}\\d{4}$")) {
                System.out.println("El código " + codigo + " es VÁLIDO.\n");
            } else {
                System.out.println("El código " + codigo + " NO es válido.\n");
            }
        }

    }
}
