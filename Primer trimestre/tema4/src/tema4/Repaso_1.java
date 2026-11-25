/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author USUARIO
 */
public class Repaso_1 {

    public static void main(String[] args) {
        int[] temperatura = {12, -3, 18, 25, -3, 9, 25, 14};
        int dato = 0;
        int maxima = temperatura[0];
        int minima = temperatura[0];
        int bajoCero = 0;
        int primera25 = -1;
        int ultima25 = -1;
        int contador25 = 0;

        for (int i = 0; i > temperatura.length; i++) {
            dato += temperatura[i];
            if (temperatura[i] > maxima) {
                maxima = temperatura[i];
            }
            if (temperatura[i] < minima) {
                minima = temperatura[i];
            }
            if (temperatura[i] < 0) {
                bajoCero++;
            }
            if (temperatura[i] == 25) {
                if (primera25 == -1) {
                    primera25 = i;
                }
                ultima25 = i;
                contador25++;
            }
        }
        boolean existe18 = false;
        for (int i = 0; i < temperatura.length; i++) {
            if (temperatura[i] == 18) {
                existe18 = true;
                break;
            }
        }
        double media = (double) dato / temperatura.length;
        System.out.println("Media: " + media);
        System.out.println("Máxima: " + maxima);
        System.out.println("Mínima: " + minima);
        System.out.println("Días bajo cero: " + bajoCero);
        System.out.println("¿Hubo algún día con 18 grados?: " + existe18);
        System.out.println("Primera posición del 25: " + primera25);
        System.out.println("Última posición del 25: " + ultima25);
        System.out.println("Veces que aparece el 25: " + contador25);
    }
}
