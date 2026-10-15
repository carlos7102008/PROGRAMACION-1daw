
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Ejercicio_18 {
    public static void main(String args []){
         System.out.println("Introduce el año actual \n");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
         System.out.println("Introduce tu fecha de nacimiento \n");
            int y = sc.nextInt();
     int edad = x - y;
     System.out.println("Tu edad es " + edad);
           
        
        
}
}