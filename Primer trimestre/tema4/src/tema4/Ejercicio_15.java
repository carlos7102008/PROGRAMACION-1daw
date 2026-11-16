/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;
    import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author USUARIO
 */
public class Ejercicio_15 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array de notas proporcionado
        int[] notas = {4, 7, 3, 8, 5, 2, 9, 6, 4, 7};
        
        System.out.println("Notas de la clase: " + Arrays.toString(notas));
        
        // 4. Solicitar la nota a buscar para contarla
        System.out.print("Introduce una nota para saber cuántos alumnos la han obtenido: ");
        int notaBuscada = scanner.nextInt();
        
        // Variables para los cálculos principales
        int aprobados = 0;
        int suspensos = 0;
        boolean existeDiez = false;
        int contadorNotaBuscada = 0;
        
        // Variables para la ampliación (nota más alta y sus posiciones)
        int notaMasAlta = notas[0];
        int primeraPos = 0;
        int ultimaPos = 0;
        
        // Recorremos el array una sola vez para sacar todas las estadísticas
        for (int i = 0; i < notas.length; i++) {
            int notaActual = notas[i];
            
            // 1 y 2. Contar aprobados y suspensos
            if (notaActual >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }
            
            // 3. Buscar si existe algún 10
            if (notaActual == 10) {
                existeDiez = true;
            }
            
            // 4. Contar cuántos tienen la nota buscada
            if (notaActual == notaBuscada) {
                contadorNotaBuscada++;
            }
            
            // --- AMPLIACIÓN ---
            // Comprobar la nota más alta y registrar sus posiciones
            if (notaActual > notaMasAlta) {
                // Si encontramos una nota que supera a la mayor actual, actualizamos todo
                notaMasAlta = notaActual;
                primeraPos = i; 
                ultimaPos = i; // Por ahora, la primera y la última posición son la misma
            } else if (notaActual == notaMasAlta) {
                // Si encontramos una nota igual a la mayor, solo actualizamos la última posición
                ultimaPos = i;
            }
        }
        
        // Mostrar todos los resultados
        System.out.println("\n--- Estadísticas de la clase ---");
        System.out.println("1. Alumnos aprobados (>= 5): " + aprobados);
        System.out.println("2. Alumnos suspensos (< 5): " + suspensos);
        
        System.out.print("3. ¿Algún alumno tiene un 10?: ");
        if (existeDiez) {
            System.out.println("Sí.");
        } else {
            System.out.println("No.");
        }
        
        System.out.println("4. Número de alumnos con un " + notaBuscada + ": " + contadorNotaBuscada);
        
        System.out.println("\n--- Ampliación ---");
        System.out.println("La nota más alta es un " + notaMasAlta);
        
        // Comprobar si la nota máxima aparece una sola vez o varias para ajustar el mensaje
        if (primeraPos == ultimaPos) {
            System.out.println("Esta nota aparece únicamente en la posición " + primeraPos + ".");
        } else {
            System.out.println("Aparece por primera vez en la posición " + primeraPos + " y por última vez en la posición " + ultimaPos + ".");
        }
        
    }
}

