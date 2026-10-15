/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**Crea un programa en Java que genere el perfil estadístico de un jugador siguiendo estos pasos:
 * Pide al usuario que introduzca el año actual y luego su año de nacimiento para calcular y guardar su edad.   
 * Pide al usuario que introduzca las puntuaciones con decimales de sus dos últimas partidas y calcula su puntuación media.   
 * Pide al usuario que introduzca su tiempo total de juego registrado en segundos.   
 * Transforma ese total de segundos a un formato de horas, minutos y segundos (usando divisiones y el resto de la división o módulo %).   
 * Muestra por pantalla todos los datos generados: la edad del jugador, su puntuación media y su tiempo de juego desglosado en horas, minutos y segundos.   
 */

public class REPASO_2 {
        public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cual es el año acutal \n");
        int año_actual = sc.nextInt();

        System.out.println("Cual es tu año de nacimiento \n");
        int año_nac = sc.nextInt();
        
        int edad = año_actual - año_nac;
        
        System.out.println("Dime el resultado de tu ultima partida \n");
        int partida_1 = sc.nextInt();
        
        System.out.println("Dime el resultado de tu antepenultima partida \n");
        int partida_2 = sc.nextInt();
        
        int media_partida = (partida_1 + partida_2) / 2;
        
        System.out.println("Cual es tu tiempo total de juego en segundos \n");
        int tiempo_total = sc.nextInt();
        
        
        int horas = tiempo_total / 3600; 
        int minutos = tiempo_total % 3600 / 60;
        int segundos = tiempo_total % 60;
        

        System.out.println("Edad jugador: " + edad);
        System.out.println("Puntuacion media: " + media_partida);        
        System.out.println("Tiempo de uso: " + horas + " horas " + minutos + " minutos " + segundos + " segundos ");


     }
    }

