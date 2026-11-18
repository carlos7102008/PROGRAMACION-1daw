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
public class Ejercicio_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primera palabra: ");
        String palabra1 = sc.next();

        System.out.print("Segunda palabra: ");
        String palabra2 = sc.next();

        boolean sonIguales = palabra1.equals(palabra2);
        boolean igualesIgnorandoMayusculas = palabra1.equalsIgnoreCase(palabra2);
        boolean mismaLongitud = palabra1.length() == palabra2.length();

        // Ampliación: comprobar si empiezan por el mismo carácter
        boolean mismoInicio = palabra1.substring(0, 1).equals(palabra2.substring(0, 1));

        System.out.println("\n¿Son iguales? " + sonIguales);
        System.out.println("¿Son iguales ignorando mayúsculas? " + igualesIgnorandoMayusculas);
        System.out.println("¿Tienen la misma longitud? " + mismaLongitud);
        System.out.println("¿Empiezan por el mismo carácter? " + mismoInicio);

    }
}
