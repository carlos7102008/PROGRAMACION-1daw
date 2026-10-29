/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

/**
 *
 * @author Carlos Marquez Cozar
 */
public class Ejercicio_03 {
        public static double calcularPrecioFinal(double precio, double descuento, double porcentajeImpuesto) {
        
        double precioDescuento = precio * (1 - (descuento / 100));
        
        double precioFinal = precioDescuento * (1 + (porcentajeImpuesto / 100));
                
         return precioFinal;
        }
    public static void main(String[] args) {
        double pan = calcularPrecioFinal(150, 10 , 21);
        System.out.println(pan);
    }
}
