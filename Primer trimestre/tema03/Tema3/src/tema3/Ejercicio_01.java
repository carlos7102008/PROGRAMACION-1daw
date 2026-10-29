/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

/**
 *
 * @author 15_1DAW
 */
public class Ejercicio_01 {

    public static int calcularAreaRectangulos(int base, int altura) {
        return base * altura;
    }

    public static void mostrarDatosArea(int base, int altura) {
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("El area es: " + calcularAreaRectangulos(base, altura) + " m²");
    }

    public static void main(String[] args) {
        // Cálculo 1: Salón
        mostrarDatosArea(4, 5);
        // Cálculo 2: Cocina
        mostrarDatosArea(10, 5);

        // Cálculo 3: Jardín
        mostrarDatosArea(9, 8);
    }
}
