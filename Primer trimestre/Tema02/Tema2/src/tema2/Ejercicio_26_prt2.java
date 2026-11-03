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
public class Ejercicio_26_prt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el numero: ");
        int n = scanner.nextInt();
        
        System.out.print("Ingrese el divisor: ");
        int m = scanner.nextInt();
        
        if (n % m == 0) {
            System.out.println(m + " es divisor exacto de " + n + ".");
        } else {
            System.out.println("El resto de dividir " + n + " por " + m + " es: " + (n % m));
        }
        
        scanner.close();
    }
}
