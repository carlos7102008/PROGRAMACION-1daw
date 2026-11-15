/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;
    import java.util.Arrays;

/**
 *
 * @author USUARIO
 */
public class Ejercicio_11 {


    public static void main(String[] args) {
        // Array original del ejemplo
        int[] original = {2, 5, 3, 2, 8, 5, 9};
        
        System.out.println("Original: " + Arrays.toString(original));
        
        // Empezamos a imprimir el resultado con el formato de corchetes
        System.out.print("Resultado: [");
        
        // Variable para controlar el formato de las comas al imprimir
        boolean primerElemento = true;
        
        // Bucle externo: selecciona cada número uno por uno
        for (int i = 0; i < original.length; i++) {
            int numeroActual = original[i];
            int contadorRepeticiones = 0;
            
            // Bucle interno: cuenta cuántas veces aparece el número actual en todo el array
            for (int j = 0; j < original.length; j++) {
                if (original[j] == numeroActual) {
                    contadorRepeticiones++;
                }
            }
            
            // Si el contador es exactamente 1, el número es único
            if (contadorRepeticiones == 1) {
                // Control para no imprimir una coma antes del primer número
                if (!primerElemento) {
                    System.out.print(", ");
                }
                
                System.out.print(numeroActual);
                primerElemento = false; // Ya hemos impreso el primero, los siguientes llevarán coma
            }
        }
        
        // Cerramos el corchete del resultado
        System.out.println("]");
    }
}

