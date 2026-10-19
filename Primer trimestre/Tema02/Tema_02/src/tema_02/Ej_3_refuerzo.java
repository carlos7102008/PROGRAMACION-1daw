/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema_02;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ej_3_refuerzo {
     public static void main(String[] args) {
        
    
     Scanner sc = new Scanner (System.in);
     //Le ponemos inicio de cuenta en este caso 1   
     int numero = 1;
     
     // hacemos un bucle el cual lee la variable numero 
     
     // si es menor ejecuta por pantalla su valor
     // si es mayor no ejecuta nada y termina el programa
     while(numero < 5){
         System.out.println(numero);
         numero++;
         break;
     }
}
}