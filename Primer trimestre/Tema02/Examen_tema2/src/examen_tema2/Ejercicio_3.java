/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_tema2;
import java.util.Scanner;
/**
 *
 * @author Carlos
 * Diseña un programa en Java que simule el proceso de recarga de batería de un robot explorador.
El robot empieza con una batería inicial del 10%.
En cada ciclo (bucle), el robot realiza una carga interactiva donde se le pregunta al usuario cuántos puntos de energía desea inyectar (un entero entre 1 y 30).
Si el usuario introduce un valor fuera de rango (menor que 1 o mayor que 30), el sistema debe mostrar "Entrada inválida" y pedir el valor de nuevo sin sumar nada a la batería.
La recarga finaliza cuando la batería alcanza o supera el 100%.
Al finalizar el bucle, debe mostrar el número total de ciclos de recarga que han sido necesarios.

 */
public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // empezamos con la bateria al 10% sin ciclos de carga
        int bateria = 10;
        int ciclos = 0;
        // hacemos un bucle siemore que la bateria sea menor o igual que 100
        while (bateria <= 100) {
            System.out.print("Ingrese los puntos de energia a inyectar (1-30): \n ");
            int energia = sc.nextInt();
            // hacemos una condicion si energia que queremos inyectar es menor de 1 o mayor de 30 de error
            if (energia < 1 || energia > 30) {
                System.out.println("Entrada invalida");
            } else { // si es correcto suba la cantidad nueva a la cantidad anterior y aumenta un ciclo
                bateria += energia;
                ciclos++;
                System.out.println("Bateria actual: " + bateria + "%");
            }
        }

        System.out.println("Recarga completada al " + bateria + "%.");
        System.out.println("Numero total de ciclos de recarga necesarios: " + ciclos);
        
    }
}

