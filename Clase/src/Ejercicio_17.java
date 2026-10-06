
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 15_1DAW
 */
public class Ejercicio_17 {
    public static void main(String args []){
       System.out.println("Parte 1");
       int armadura = 120;
       final double  Descuento = 0.15;
       double precio = armadura - (armadura * Descuento) ;
       System.out.println("El precio de la armdura es " + precio);
       
       
       System.out.println("Parte 2");
        System.out.println("Introduce un total de segundos \n");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int Minutos = x / 60;
        int Hora = Minutos / 60;
        System.out.println("Equivale en minutos a " + Minutos);
        System.out.println("Equivale en hora a " + Hora);

    }
}
