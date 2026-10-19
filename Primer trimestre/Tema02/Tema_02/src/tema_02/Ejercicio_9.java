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
public class Ejercicio_9 {
  public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Calculadora Básica ---");
        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("\n Selecciona la operación que deseas realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("Elige una opción (1-4): ");
        int opcion = scanner.nextInt();

        double resultado = 0;
        boolean operacionValida = true;

        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                    operacionValida = false;
                }
                break;
            default:
                System.out.println("Opción no válida. Por favor, selecciona un número del 1 al 4.");
                operacionValida = false;
        }

        if (operacionValida) {
            System.out.println("El resultado de la operación es: " + resultado);
        }
    }
}
}
