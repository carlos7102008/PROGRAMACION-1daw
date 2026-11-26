/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author USUARIO
 */
public class Ejercicio_8 {

    public static void main(String[] args) {
        // Array inicial proporcionado en el ejercicio
        double[] precios = {10.0, 15.5, 20.0, 8.5, 12.0};
        
        // Constante para el incremento del 5% (100% + 5% = 1.05)
        final double INCREMENTO = 1.05;

        // 1. Mostrar los precios originales
        System.out.println("1. Precios originales:");
        for (int i = 0; i < precios.length; i++) {
            System.out.print(precios[i] + " €   ");
        }
        System.out.println("\n");

        // 2. Incrementar todos los precios un 5 %
        for (int i = 0; i < precios.length; i++) {
            precios[i] = precios[i] * INCREMENTO; 
        }

        // 3. Mostrar los precios actualizados
        System.out.println("2 y 3. Precios actualizados (+5%):");
        for (int i = 0; i < precios.length; i++) {
            System.out.print(precios[i] + " €   ");
        }
        System.out.println("\n");

        // Variables para los cálculos finales
        double sumaPrecios = 0;
        int productosMasDe15 = 0;

        // Recorrer el array ya actualizado para la media y el conteo
        for (int i = 0; i < precios.length; i++) {
            double precioActual = precios[i];
            
            // Sumar para calcular la media posteriormente
            sumaPrecios += precioActual;
            
            // 5. Contar cuántos cuestan más de 15 euros
            if (precioActual > 15.0) {
                productosMasDe15++;
            }
        }

        // 4. Calcular el precio medio
        double precioMedio = sumaPrecios / precios.length;

        // Mostrar los resultados finales
        System.out.println("4. Precio medio de los productos: " + precioMedio + " €");
        System.out.println("5. Cantidad de productos que cuestan más de 15 euros: " + productosMasDe15);
    }
}