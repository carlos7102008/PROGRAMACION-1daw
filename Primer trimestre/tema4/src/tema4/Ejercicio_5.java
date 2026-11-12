/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Ejercicio_5 {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce el tamaño que tendra el array: ");
        int tamano = sc.nextInt();

        int[] numeros = new int[tamano];

        System.out.println("Introduce los numeros para rellenar el array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Valor para la posicion " + i + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("Introduce la posicion que deseas consultar (de 0 a " +
                (tamano - 1) + "): ");
        int posicion = sc.nextInt();

        if (posicion >= 0 && posicion < numeros.length) {
            System.out.println("El valor almacenado en la posicion " + posicion 
                    + " es: " + numeros[posicion]);
        } else {
            System.out.println("Error: La posicion introducida no es valida."
                    + " Debe estar entre 0 y " + (tamano - 1) + ".");
        }
    }
}
