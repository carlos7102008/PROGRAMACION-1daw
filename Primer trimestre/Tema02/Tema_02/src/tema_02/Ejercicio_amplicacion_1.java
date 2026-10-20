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
public class Ejercicio_amplicacion_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int pinCorrecto = 2580;
        int intentos = 3;
        int intentosUsados = 0;
        int pinIntroducido;

        // 1. Solicita un PIN al usuario por primera vez
        System.out.print("Introduce el PIN de cuatro cifras: ");
        pinIntroducido = sc.nextInt();
        intentos--;
        intentosUsados++;

        // 2 y 6. Bucle while con la condición al principio (PIN incorrecto y quedan intentos)
        while (pinIntroducido != pinCorrecto && intentos > 0) {
            // 5. Muestra los intentos que le quedan
            System.out.println("PIN incorrecto. Te quedan " + intentos + " intento(s).");
            
            System.out.print("Introduce el PIN de nuevo: ");
            pinIntroducido = sc.nextInt();
            intentos--;
            intentosUsados++;
        }

        // Comprobación final al salir del bucle
        if (pinIntroducido == pinCorrecto) {
            // 3 y Ampliación. Acceso concedido e intentos necesitados
            System.out.println("Acceso concedido. Has necesitado " + intentosUsados + " intento(s).");
        } else {
            // 4. Acceso bloqueado al agotar intentos
            System.out.println("Acceso bloqueado.");
        }

    }
}

