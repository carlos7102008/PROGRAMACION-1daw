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
public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa la longitud del lado a:");
        double a = sc.nextDouble();
        
        System.out.println("Ingresa la longitud del lado b:");
        double b = sc.nextDouble();
        
        System.out.println("Ingresa la longitud del lado c:");
        double c = sc.nextDouble();
        
        // 1. Comprobar si pueden formar un triángulo
        if ((a + b > c) || (a + c > b) || (b + c > a)) {
            
            // 2. Si es un triángulo, determinar el tipo
            if (a == b && b == c) {
                System.out.println("Los lados forman un triángulo Equilátero.");
            } else if (a == b || a == c || b == c) {
                System.out.println("Los lados forman un triángulo Isósceles.");
            } else {
                System.out.println("Los lados forman un triángulo Escaleno.");
            }
            
        } else {
            System.out.println("Error: Los lados ingresados no pueden formar un triángulo.");
        }
    }
}
