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
public class Ejercicio_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("introduce una palabra: ");
            String palabra = sc.nextLine();
            if (palabra.matches("[a-z]{3,8}")) {
                System.out.println("La palabra cumple con el patron");

                System.out.println("");
            }else{ 
                System.out.println("La palabra no cumple el patron");
                System.out.println("");
            }

        }

    }
}
