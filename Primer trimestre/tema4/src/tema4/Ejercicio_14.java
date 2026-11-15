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
public class Ejercicio_14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array proporcionado
        int[] numeros = {2, 5, 2, 8, 2, 9, 5, 2};
        
        System.out.println("Array actual: " + Arrays.toString(numeros));
        
        // 1, 2 y 3. Búsqueda interactiva (permite cambiar el número buscado)
        System.out.print("Introduce el número que quieres contar: ");
        int numeroBuscado = scanner.nextInt();
        
        int contadorInteractivo = 0;
        
        // Recorremos el array para contar las coincidencias
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscado) {
                contadorInteractivo++;
            }
        }
        
        // Mostramos el resultado de la búsqueda principal
        System.out.println("El número " + numeroBuscado + " aparece " + contadorInteractivo + " veces.");
        
        
        // --- AMPLIACIÓN ---
        System.out.println("\n--- Resumen de apariciones (Ampliación) ---");
        
        // Creamos un array con los números específicos que pide el enunciado
        int[] numerosABuscar = {2, 5, 8, 9};
        
        // Bucle externo: selecciona qué número vamos a contar ahora
        for (int i = 0; i < numerosABuscar.length; i++) {
            int numeroActual = numerosABuscar[i];
            int contadorAmpliacion = 0;
            
            // Bucle interno: recorre el array original buscando el número seleccionado
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[j] == numeroActual) {
                    contadorAmpliacion++;
                }
            }
            
            System.out.println("El número " + numeroActual + " aparece " + contadorAmpliacion + " veces.");
        }
        
        scanner.close();
    }
}  

