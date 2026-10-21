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
public class Ejercicio_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int total = 0;
        System.out.println("Dime el primer numero que quieras sumar: \n");
        int numero = sc.nextInt();
        total = total + numero;
        while(numero != 0){
            System.out.println("Dime otro numero: \n");
             numero = sc.nextInt();
             total = total + numero;
            
        }
        System.out.println("EL total es: " + total);
    }
}
