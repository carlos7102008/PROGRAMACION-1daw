
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 15_1DAW
 */
public class Ejercicio_22 {
    public static void main(String args []){

        /*Solicitamos la edad del usuario*/
        
        System.out.println("introduce  tu edad \n");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        
        /*Si es mayor de edad responde true si no false */
        boolean mayor_edad = edad > 18;
        
        System.out.println("Mayor de edad? \n" + mayor_edad);
       
}
}