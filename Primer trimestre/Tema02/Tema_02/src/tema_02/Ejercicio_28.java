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
public class Ejercicio_28 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double suma = 0;
        int contador = 0;
        
        System.out.println("Introduce números uno por uno.");
        System.out.println("Pulsa la tecla espacio y luego Enter para terminar:");
        
        while (true) {
            String entrada = scanner.nextLine();
            
            // Si la entrada es exactamente un espacio, salimos del bucle
            // preguntar por el entrada.equals
            if (entrada.equals(" ")) {
                break;
            }
            
            // Convertimos el texto introducido a número decimal
            double numero = Double.parseDouble(entrada);
            suma = suma + numero;
            contador++;
        }
        
        // Comprobamos que se haya introducido al menos un número para evitar dividir por cero
        if (contador > 0) {
            double promedio = suma / contador;
            System.out.println("El promedio de los números es: " + promedio);
        } else {
            System.out.println("No se introdujo ningún número.");
        }
        
        scanner.close();
    }    
}
