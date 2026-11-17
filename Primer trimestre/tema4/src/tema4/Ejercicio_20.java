/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author USUARIO
 */
public class Ejercicio_20 {
    public static void main(String[] args) {
        // Declaramos la matriz de 3 filas y 4 columnas con valores de ejemplo
        int[][] matriz = {
            {2, 4, 6, 8},
            {10, 12, 14, 16},
            {18, 20, 22, 24}
        };

        // 1. Mostrar todos los elementos (usamos dos bucles: uno para filas y otro para columnas)
        System.out.println("1. Todos los elementos de la matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\n"); 
            }
            System.out.println(); 
        }

        // 2. Mostrar el número de filas y columnas
        System.out.println("\n2. Tamaño de la matriz:");
        System.out.println("Número de filas: " + matriz.length);
        System.out.println("Número de columnas: " + matriz[0].length);

        // 3. Mostrar el elemento de la segunda fila y tercera columna
        // Fila 2 = índice 1. Columna 3 = índice 2.
        System.out.println("\n3. Elemento de la 2ª fila y 3ª columna: " + matriz[1][2]);

        // 4. Modificar el elemento de la primera fila y primera columna
        // Fila 1 = índice 0. Columna 1 = índice 0.
        System.out.println("\n4. Modificando el elemento de la 1ª fila y 1ª columna a 99...");
        matriz[0][0] = 99;
        System.out.println("Nuevo valor en la posición [0][0]: " + matriz[0][0]);

        // 6. Calcular la suma de todos los elementos
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        System.out.println("\n6. La suma de todos los elementos (con el 99 modificado) es: " + suma);
    }
}
