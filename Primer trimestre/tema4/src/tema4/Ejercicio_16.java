/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author USUARIO
 */
public class Ejercicio_16 {

    public static void main(String[] args) {
        // Array proporcionado en el ejemplo
        int[] numeros = {3, 5, 2, 3, 7, 5, 9, 1};
        
        System.out.println("Elementos que aparecen una sola vez:");
        
        // Bucle externo: selecciona cada elemento del array uno por uno
        for (int i = 0; i < numeros.length; i++) {
            int numeroActual = numeros[i];
            int contadorRepeticiones = 0;
            
            // Bucle interno: recorre todo el array de nuevo para contar 
            // cuántas veces aparece el número seleccionado
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[j] == numeroActual) {
                    contadorRepeticiones++;
                }
            }
            
            // Si el contador es exactamente 1, el elemento no se repite
            if (contadorRepeticiones == 1) {
                System.out.println(numeroActual);
            }
        }
    }
}  

