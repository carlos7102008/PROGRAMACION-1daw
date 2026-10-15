/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author 15_1DAW
 */
public class Ejercicio_6 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Dime un numero ");
        int n1 = sc.nextInt();
        
        if (n1 % 2 == 0 ){
            System.out.println("El mumero es par");        }
        else{
            System.out.println("Este numero es impar");
                
        }
    }
}