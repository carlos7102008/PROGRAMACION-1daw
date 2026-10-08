/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author 15_1DAW
 */
public class Ejercicio_25 {

    public static void main(String args[]) {
        /*Solicitamos los kilos de manzanas y de peras */
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos kilos de manzanas has vendido en este semestre \n");
        double kilos_man = sc.nextDouble();
        System.out.println("Cuantos kilos de peras has vendido en este semestre \n");
        double kilos_per = sc.nextDouble();

        /*declaramos el precio por kilos de las dos frutas*/
        double p_manzanas = 2.35;
        double p_peras = 1.95;
        
        /*hacemos el calculo para saber cuanto a ganado en este semestre de cada fruta*/
        
        double ganancia_man = kilos_man *= p_manzanas;
        double ganancia_per = kilos_per *= p_peras;

        /* Ganancia total*/
        double ganancia_total = ganancia_man + ganancia_per;

        /* no mostramos por pantalla */
        System.out.println("Tengo una ganancia de " + ganancia_man + "€ respecto a las manzanas");
        System.out.println("Tengo una ganancia de " + ganancia_per + "€ respecto a las peras");
        System.out.println("Tengo una ganancia total de " + ganancia_total + "€ ");

    }
}
