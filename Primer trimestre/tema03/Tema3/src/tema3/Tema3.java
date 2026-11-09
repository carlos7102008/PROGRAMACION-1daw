/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3;

import static proyecto_ud3.Biblioteca.RaizCuadrada;
import static proyecto_ud3.Biblioteca.aleatorio;
import static proyecto_ud3.Biblioteca.division;
import static proyecto_ud3.Biblioteca.esPar;
import static proyecto_ud3.Biblioteca.esPrimo;
import static proyecto_ud3.Biblioteca.factorial;
import static proyecto_ud3.Biblioteca.imprimir;
import static proyecto_ud3.Biblioteca.imprimirLinea;
import static proyecto_ud3.Biblioteca.maximo;
import static proyecto_ud3.Biblioteca.minimo;
import static proyecto_ud3.Biblioteca.multiplicar;
import static proyecto_ud3.Biblioteca.potencia;
import static proyecto_ud3.Biblioteca.restar;
import static proyecto_ud3.Biblioteca.sumar;

/**
 *
 * @author 15_1DAW
 */
public class Tema3 {
     public static void main(String[] args) {
        imprimirLinea("--- Pruebas de la Biblioteca de Utilidades ---");

        imprimirLinea("Suma de 15 + 5: " + sumar(15, 5));

        imprimirLinea("Resta de 20 - 8: " + restar(20, 8));

        imprimirLinea("Multiplicación de 2 * 3 * 4: " + multiplicar(2, 3, 4));

        imprimirLinea("División de 10 / 4: " + division(10, 4));

        imprimirLinea("Raíz cuadrada de 25: " + RaizCuadrada(25));

        imprimirLinea("Potencia de 2^3: " + potencia(2, 3));

        imprimir("¿Es el 7 primo?: ");
        imprimirLinea(esPrimo(7));

        imprimirLinea("Factorial de 5: " + factorial(5));

        imprimirLinea("Factorial de un negativo (-3): " + factorial(-3));
        
        imprimir("¿Es el 14 par?: ");
        imprimirLinea(esPar(14));
        
        imprimirLinea("Número aleatorio entre 1 y 10: " + aleatorio(1, 10));
        
        imprimirLinea("El mayor entre 45 y 22 es: " + maximo(45, 22));
        
        imprimirLinea("El menor entre 45 y 22 es: " + minimo(45, 22));
    }
}
