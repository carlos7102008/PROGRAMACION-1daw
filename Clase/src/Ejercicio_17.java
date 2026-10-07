
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
       
       /* Parte dos del programa*/
        System.out.println("Parte 2");
        System.out.println("Introduce un total de segundos \n");
       /* una vez obtenido los segundos que quiere pasar lo pasaremos a horas o a minutos*/ 
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int minutos = x % 3600 / 60;
        int segundos = x % 60;
        int hora = x / 3600;
        System.out.println("Equivale a " + hora +  "horas" + minutos + "minutos" + segundos + "segundos");


    }
}
