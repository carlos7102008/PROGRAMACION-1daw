/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author USUARIO
 */
public class Ejercicio_9 {
    public static void main(String[] args) {
        // Array que almacena las notas de 10 alumnos
        double[] notas = {4.5, 5.0, 7.5, 9.2, 3.1, 6.8, 8.0, 10.0, 4.9, 5.5};
        
        // Variables contadoras para cada categoría
        int suspensos = 0;
        int aprobados = 0;
        int notables = 0;
        int sobresalientes = 0;
        
        // Recorrer el array para evaluar cada nota
        for (int i = 0; i < notas.length; i++) {
            double nota = notas[i];
            
            if (nota < 5.0) {
                suspensos++;
            } else if (nota >= 5.0 && nota < 7.0) {
                aprobados++;
            } else if (nota >= 7.0 && nota < 9.0) {
                notables++;
            } else if (nota >= 9.0) {
                sobresalientes++;
            }
        }
        
        // Mostrar el recuento de las categorías
        System.out.println("Clasificación de las notas:");
        System.out.println("- Suspensos: " + suspensos);
        System.out.println("- Aprobados: " + aprobados);
        System.out.println("- Notables: " + notables);
        System.out.println("- Sobresalientes: " + sobresalientes);
        
        // Comprobar que la suma de categorías coincide con el número de alumnos
        int totalClasificados = suspensos + aprobados + notables + sobresalientes;
        System.out.println("\n--- Comprobación de integridad ---");
        System.out.println("Suma de todas las categorías: " + totalClasificados);
        System.out.println("Número total de alumnos: " + notas.length);
        
        if (totalClasificados == notas.length) {
            System.out.println("Estado: CORRECTO. La suma coincide perfectamente.");
        } else {
            System.out.println("Estado: ERROR. Los datos no cuadran.");
        }
        
        // Calcular el porcentaje total de alumnos que han superado la asignatura (nota >= 5)
        int totalSuperan = aprobados + notables + sobresalientes;
        
        // Se hace un "cast" a double para evitar que la división entera pierda los decimales
        double porcentajeAprobados = ((double) totalSuperan / notas.length) * 100;
        
        System.out.printf("\nPorcentaje de alumnos que superan la materia: %.2f%%\n", porcentajeAprobados);
    }
}
