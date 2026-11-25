/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author USUARIO
 */
public class Repaso_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] datos = {2, 4, 5, 6, 7, 8, 4, 4, 2, 3, 5, 1, 5};
        double[] precios = {12.3, 3, 32.2, 3, 32.2, 65};

        System.out.println(" Inserta el numero que quieres buscar: ");
        int buscado = sc.nextInt();

        int pos = buscarUltimaPosicion(datos, buscado);
        System.out.println(" La ultima aparicion de " + buscado + "es" + pos);

        double porcentaje = 10;
        aplicarDescuento(precios, porcentaje);
        System.out.println("Precio con  descuento: " + Arrays.toString(precios));
    }

    public static int buscarUltimaPosicion(int[] datos, int buscado) {
        if (datos == null || datos.length == 0) {
            return -1;
        }
        int ultimaAp = -1;
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] == buscado) {
                ultimaAp = i;
            }

        }
        return ultimaAp;
    }

    public static void aplicarDescuento(double[] precios, double porcentaje) {
        for (int i = 0; i < precios.length; i++) {
            precios[i] = precios[i] - (precios[i] * porcentaje / 100);
        }
    }
}
