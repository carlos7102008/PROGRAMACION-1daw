/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;
   import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author USUARIO
 */
public class Ejercicio_13 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array de la actividad anterior (con un par de repetidos al final para probar la ampliación)
        int[] numeros = {12, 5, 8, 21, 4, 16, 9, 21, 5};
        
        System.out.println("Array actual: " + Arrays.toString(numeros));
        System.out.print("Número buscado: ");
        int numeroABuscar = scanner.nextInt();
        
        // Variable bandera para saber si existe
        boolean encontrado = false;
        
        // Variable de texto (String) para ir guardando todas las posiciones donde aparezca
        String posiciones = "";
        
        // Recorremos el array completo
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroABuscar) {
                // Si ya habíamos encontrado uno antes, añadimos una coma para separar
                if (encontrado) {
                    posiciones += ", ";
                }
                
                // Añadimos la posición (índice) al texto
                posiciones += i;
                
                // Marcamos que sí lo hemos encontrado
                encontrado = true;
                
                // IMPORTANTE: Aquí NO ponemos 'break' para que siga buscando más coincidencias (Ampliación)
            }
        }
        
        // Mostrar el resultado final
        System.out.println("\n--- Resultado ---");
        if (encontrado) {
            System.out.println("El número se encuentra en la posición " + posiciones + ".");
        } else {
            System.out.println("El número " + numeroABuscar + " no existe en el array.");
        }
        
    }
} 

