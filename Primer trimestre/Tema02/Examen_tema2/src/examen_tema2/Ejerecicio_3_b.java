/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_tema2;

/**
 *
 * @author 15_1DAW
 */
public class Ejerecicio_3_b {
    public static void main(String[] args) {
        int contadorPares = 0;
        int i = 1;
        
        while (i <= 5){
        if (i % 2 == 0){
            contadorPares++;
        }
        i++;
        }
        System.out.println("Pares encontrador: " + contadorPares);
    }
}
