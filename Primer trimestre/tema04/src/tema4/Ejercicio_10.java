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
public class Ejercicio_10 {
    public static void main(String[] args) {
        // 1. Array original
        int[] original = {3, 8, 5, 2, 9};
        
        // 2. Construir un segundo array con exactamente la misma longitud
        int[] invertido = new int[original.length];
        
        // 3. Rellenar el nuevo array con los elementos en orden inverso
        for (int i = 0; i < original.length; i++) {
            /* 
             * Si 'i' es 0, tomamos el último elemento de original (longitud - 1 - 0)
             * Si 'i' es 1, tomamos el penúltimo (longitud - 1 - 1)
             * Y así sucesivamente hasta recorrer todo el array.
             */
            invertido[i] = original[original.length - 1 - i];
        }
        
        // 4. Mostrar ambos arrays usando Arrays.toString() para un formato limpio
        System.out.println("Original:  " + Arrays.toString(original));
        System.out.println("Invertido: " + Arrays.toString(invertido));
    }
}
