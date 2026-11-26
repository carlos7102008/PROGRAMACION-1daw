/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author 15_1DAW
 */
public class Ejercicio_1 {

    public static void main(String[] args) {
        int[] temperaturas = {10, 21, 24, 27};
        System.out.println("temperaturas:" + temperaturas);

        imprimeArray(temperaturas);

        temperaturas[2] = 35;

        imprimeArray(temperaturas);

    }

    public static void imprimeArray(int[] array) {
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.println(array[i]);
        }
    }

    public static void imprimeArray(double[] array) {
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.println(array[i]);
        }
    
}
}