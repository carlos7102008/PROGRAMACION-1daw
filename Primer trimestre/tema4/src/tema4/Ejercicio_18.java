/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author USUARIO
 */
public class Ejercicio_18 {

    public static void main(String[] args) {
        int[] numeros = {12, 5, 8, 20, 3, 14, 7};
        int[] arrayCopiado = copiar(numeros);
        
        arrayCopiado[0] = 999;
        
        System.out.print("Array original intacto: ");
        imprimirArray(numeros);
        
        System.out.print("Array copia modificado: ");
        imprimirArray(arrayCopiado);
        
        System.out.println(" la suma de todos los elementos: " + implementar(numeros));

        int factor = 4;
        multiplicar(numeros, factor);
        System.out.println(" Multiplicar cada elemto por " + factor + ": ");
        imprimirArray(numeros);
// usado un metodo de otro ejercicio por no usar java.util.Arrays.toString

        System.out.println(" Poner 0 en cada elemto: ");
        imprimirArray(numeros);
// usado un metodo de otro ejercicio por no usar java.util.Arrays.toString

    }

    public static int implementar(int[] numeros) {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return suma;
    }

    public static void multiplicar(int[] numeros, int factor) {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] *= factor;
        }
    }

    public static void rellenarCeros(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = 0;
        }

    }

    public static int[] copiar(int[] numeros) {
        int[] nuevaCopia = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            nuevaCopia[i] = numeros[i];
        }
        return nuevaCopia;
    }

    public static void imprimirArray(int[] numeros) {
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
