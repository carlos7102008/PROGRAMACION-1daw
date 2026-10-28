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
public class Ej_1_refuerzo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //solicitamos la edad de nacimiento
        System.out.println("Introduce tu edad de nacimiento \n");
        
        int nacimiento = sc.nextInt();
        // Año actual
        final int año_a = 2026;
        // Calculamos la edad de esta persona
        int edad = año_a - nacimiento ;
        // determinamos si esta autorizado o no 
        if (edad >= 18){
            System.out.println("Credencial Autorizada");
        
        }else {
            System.out.println("Credencial no autorizada");
    
        }
    }
}
