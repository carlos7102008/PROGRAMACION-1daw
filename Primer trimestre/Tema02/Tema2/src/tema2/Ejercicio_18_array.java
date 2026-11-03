/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema_02;

/**
 *
 * @author 15_1DAW
 */
public class Ejercicio_18_array {
    public static void main(String[] args) {
        double[] precios = {10.5, -5.0, 20.0, -1.2, 5.5};
        double total = 0;

        for (double precio : precios) {
            if (precio <= 0) {
                continue;
            }
            total += precio;
        }

        System.out.println("El total de la suma es: " + total);
    }
}

