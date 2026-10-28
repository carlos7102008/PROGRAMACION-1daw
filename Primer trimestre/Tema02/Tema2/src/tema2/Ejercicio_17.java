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
public class Ejercicio_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Introduce un numero para elegir una opcion");
            System.out.println("1 --> Mostrando saldo");
            System.out.println("2 --> Retirar saldo");
            System.out.println("3 --> Salir del programa");
            System.out.println("\n");
            int opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("Mostrando saldo...");

            } else if (opcion == 2) {
                System.out.println("Retirando dinero...");
                
            } else if (opcion == 3) {
                System.out.println("Gracias por usar el cajero. ¡Adios!");
                break;
            } else {
                System.out.println("Opcion no valida. Intentalo de nuevo.");
            }
        }
        

    }

}
