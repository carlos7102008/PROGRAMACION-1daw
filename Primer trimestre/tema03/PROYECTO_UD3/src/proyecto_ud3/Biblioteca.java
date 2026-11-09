/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_ud3;

/**
 *Vamos a crear una biblioteca de utilidades personal.

En ella incluiremos los métodos que pensemos puedan sernos útiles de entre los que hemos ido desarrollando: números primos, factorial, multiplicar tres números, etc.

Se propone para ello crear una clase con todos estos métodos y luego un jar. Pero puedes hacerlo como desees siempre que esté bien justificado y lo entiendas.

 * @author Miguel
 * @ Aya
 * @ Carlos
 */
public class Biblioteca {

    public static double sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static double restar(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public static double multiplicar(int numero1, int numero2, int numero3) {
        return numero1 * numero2 * numero3;
    }

    public static double division(int numero1, int numero2) {
        return (double) numero1 / numero2; // Se añade (double) para asegurar precisión decimal
    }

    public static double RaizCuadrada(double numero1) {
        return Math.sqrt(numero1);
    }

    public static double potencia(double numero1, double numero2) {
        return Math.pow(numero1, numero2);
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static long factorial(int numero) {
        if (numero < 0) {
            return -1; // Indicador de error para números negativos
        }
        long resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void imprimirLinea(Object mensaje) {
        System.out.println(mensaje);
    }

    public static void imprimir(Object mensaje) {
        System.out.print(mensaje);
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static int aleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static int maximo(int a, int b) {
        return Math.max(a, b);
    }

    public static int minimo(int a, int b) {
        return Math.min(a, b);
    }

    
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
