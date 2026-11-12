package tema4;

import java.util.Scanner;
import static tema4.Ejercicio_1.imprimeArray;

/**
 *
 * @author USUARIO
 */
public class Ejercicio_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] precios = new double[5];
        System.out.println("Introduce los precios de los 5 productos");;
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Precio del producto " + (i + 1) + ": ");
            precios[i] = sc.nextDouble();
        }

        System.out.println(" --  Listado de precios  -- ");
        imprimeArray(precios);
        
        System.out.println("\n");
        System.out.println(" -- Modificar precio -- ");
        int posicion = 0;
        boolean posicionValida = false;

        while (!posicionValida) {
            System.out.println("que podicion quieres modificar (1 - " + precios.length + ")");
            posicion = sc.nextInt();

            if (posicion >= 1 && posicion <= precios.length) {
                posicionValida = true;
            } else {
                System.out.println("No has introducido una opcion valida.");
            }
        }
        System.out.println("Introduce el nuevo precio para el producto "
                + posicion + ": ");
        double nuevoPrecio = sc.nextDouble();

        precios[posicion - 1] = nuevoPrecio;

        System.out.println(" -- listado de precios nuevo -- ");
        imprimeArray(precios);
    }
}
