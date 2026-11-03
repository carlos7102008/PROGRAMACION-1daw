/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_tema2;

/**
 *
 * @author Carlos Marquez Cozar Para sintonizar una emisora de emergencia, el
 * sistema debe probar una serie de frecuencias de radio numéricas desde la
 * frecuencia 100 hasta la 150 (de 1 en 1). Se pide: Escribe un programa
 * utilizando un bucle que analice las frecuencias en dicho rango bajo las
 * siguientes reglas de negocio: Las frecuencias divisibles entre 5 se
 * consideran "Frecuencias saturadas" y deben saltarse sin imprimirse (utiliza
 * la sentencia adecuada para saltar a la siguiente iteración). Si la frecuencia
 * es exactamente 137, se ha encontrado la "Frecuencia de Socorro". El programa
 * debe mostrar por pantalla "¡Frecuencia de socorro 137 hallada! Deteniendo el
 * escaneo." y interrumpir inmediatamente el bucle. Para todas las demás
 * frecuencias válidas, se debe imprimir: "Sintonizando frecuencia: [número]".
 *
 */
public class Ejercicio_2 {

    public static void main(String[] args) {
        int frecuencia = 100;
        //generamos un bucle que empieza en 100 y acaba cuando es igual o menor de 150 osea hasta 150, aumentando 1 cada vez que se ejecute el bucle
        for (frecuencia = 100; frecuencia <= 150; frecuencia++) {
            if (frecuencia == 137) {
                System.out.println("Frecuencia de socorro 137 hallada! Deteniendo escaneo");
                break;
            }// que si frecuencia es divisible entre 5 no se ejecute
            if (frecuencia % 5 == 0) {
                continue;
            }
            System.out.println("Sincronizando frecuencia " + frecuencia);
        }
    }
}
