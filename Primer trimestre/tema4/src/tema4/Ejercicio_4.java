
import tema4.Ejercicio_1;

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
        int[] numeros = {10, 20, 30, 40, 50, 60, 70};
        System.out.println("Array antes de los intercambios.");

        Ejercicio_1.imprimeArray(numeros);
        int temp;

        for (int i = 0; i < numeros.length / 2; i++) {
            temp = numeros[i];
            numeros[i] = numeros[numeros.length - i - 1];
            numeros[numeros.length - i - 1] = temp;
        }
       
        System.out.println("Array despues de los intercambios: ");
        Ejercicio_1.imprimeArray(numeros);
    }

}
