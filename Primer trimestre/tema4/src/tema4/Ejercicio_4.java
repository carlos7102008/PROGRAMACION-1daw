/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Ejercicio_4 {

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50, 60};
        System.out.println("Array antes de los intercambios.");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + "\n");
        }

        int temp = numeros[0];

        numeros[0] = numeros[5];
        numeros[5] = temp;

        temp = numeros[1];

        numeros[1] = numeros[4];
        numeros[4] = temp;
        
        temp = numeros[2];

        numeros[2] = numeros[3];
        numeros[3] = temp;
        System.out.println("Array despues de los intercambios: ");
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i] + "\n");
        }
    }

}
