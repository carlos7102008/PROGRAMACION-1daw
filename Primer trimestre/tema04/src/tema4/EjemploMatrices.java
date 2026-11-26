/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author 15_1DAW
 */
public class EjemploMatrices {

    public static void main(String[] args) {
        double[][] notas = {
            {7.5, 8.0},
            {2.5, 4.0},
            {1.5, 6.0}
        };

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println(notas[i][j]);
            }
        }
    }
}
