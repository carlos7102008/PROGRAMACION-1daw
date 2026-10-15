/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/*Crea un programa en Java que gestione el despegue de una nave espacial siguiendo estos pasos:

Declara una constante entera llamada CAPACIDAD_MAXIMA con el valor de 1000 para el tanque de combustible.

Pide al usuario por teclado que introduzca el nivel de combustible actual de la nave.

Pide al usuario por teclado que introduzca el número total de horas que durará el vuelo.

Calcula cuántos días completos y cuántas horas sobrantes durará el viaje (utiliza la división para los días y el operador módulo % para las horas sueltas).

Pide al usuario que confirme si la tripulación está lista introduciendo true o false.

Crea una variable booleana que sea true solo si el combustible actual es exactamente igual a la CAPACIDAD_MAXIMA.

Crea una condición lógica final para saber si la nave "puede despegar": esto solo ocurrirá si el depósito está al máximo y la tripulación está lista.

Declara una variable entera con las misiones completadas (por ejemplo, 4), aplícale el operador de incremento (++) para sumar la nueva misión, y muestra todos los resultados por pantalla.**/
/**
 *
 * @author USUARIO
 */
public class REPASO_4 {
    public static void main(String[] args) {
       final int capacidad_maxima = 1000 ;
       Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de combustible actual de la nave \n");
        int cantidad_actual = sc.nextInt();
        System.out.println("Introduzca el total de horas que durará el vuelo  \n");
        int horas = sc.nextInt();
        
        int dias = horas / 24;
        int horas_sobrantes = horas % 24; 
        System.out.println("durara " + dias + " dias " + horas_sobrantes + " horas");
        System.out.println("La tripulación esta lista?(true or false) \n");
        boolean lista = sc.nextBoolean();
        
        boolean combustible = cantidad_actual  == capacidad_maxima ;
        
        System.out.println("Puede despegar?");
        boolean decision_final =  combustible && lista;
        System.out.println(decision_final);
        int misiones = 4;
        
        misiones++;
        
        System.out.println("Misiones completadas "+ misiones);
    }
    
}
