/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema_02;

import java.util.Scanner;

/**
 *
 * @author 15_1DAW
 */
public class Ejercicio_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            
            System.out.println("Hasta que numero quieres que cuente\n");
            int num1 = sc.nextInt();
            int fin = num1;
            System.out.println("\n");
         do{
         System.out.println(fin);
         fin--;
        } while (fin >= 0);
            System.out.println("Fin del programa");
}   
}
    

