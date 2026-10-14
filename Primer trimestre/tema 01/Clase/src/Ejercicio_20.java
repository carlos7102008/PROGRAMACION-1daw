
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Ejercicio_20 {
    public static void main(String args []){
        System.out.println("Introduce tu primera nota \n");
        Scanner sc = new Scanner(System.in);
        double nota2 = sc.nextDouble();
        System.out.println("Introduce tu segunda nota \n");
        double nota1 = sc.nextDouble();
        
        double media = (nota1 + nota2)/ 2;
        System.out.println("tu nota media es " + media);

        
    }    
}
