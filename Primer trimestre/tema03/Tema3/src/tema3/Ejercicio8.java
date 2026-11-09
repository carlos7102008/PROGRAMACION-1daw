package tema3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 15_1DAW
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        int numero = generarNumeroAleatorio();
        System.out.println("El numero generado es: " + numero);
    }

    public static int generarNumeroAleatorio() {

        return (int) (Math.random() * 10) + 1;
    }

}
