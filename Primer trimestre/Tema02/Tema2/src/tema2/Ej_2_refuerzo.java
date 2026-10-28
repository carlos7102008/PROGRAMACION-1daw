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
public class Ej_2_refuerzo {
     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        // solicitamos las notas
        System.out.println("Introduce la primera nota \n");
        
        int nota1 = sc.nextInt();

        System.out.println("Introduce la segunda nota \n");
        
        int nota2 = sc.nextInt();
        
        System.out.println("Introduce la tercera nota \n");
        
        int nota3 = sc.nextInt();

        // Calculamos la media 
        double media =((nota1 * 0.2) + (nota2 * 0.5) + (nota3 * 0.3) / 3);
        // determinamos que si esta variable es mayor de 5 escribimos aprobado.
        if(media >= 5) {
            System.out.println("Aprobado");
        }else {
            System.out.println("Reprobado");
        }
        
}
}
