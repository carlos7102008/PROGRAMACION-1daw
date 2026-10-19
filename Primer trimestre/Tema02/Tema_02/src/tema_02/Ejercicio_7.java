/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema_02;
import java.util.Scanner;
/**
 *7. Año bisiesto: Determinar si un año ingresado por
el usuario es bisiesto.
Un año es bisiesto si cumple las condiciones:
a. Un año es bisiesto si es divisible entre 4.
b. Excepto los años que son múltiplos de 100, que
no son bisiestos.
c. Salvo que además sean divisibles entre 400, en
cuyo caso sí lo son
 * 
 */
public class Ejercicio_7 {
    public static void main(String[] args) {
        //Le pedimos datos al usuario.
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingresa un año \n");
        //Guardamos la respuesta en una variable llamada a
        int a = sc.nextInt();
        //hacemos el calculo si el dato obtenido es bisiesto y lo hacemos a traves de un if para hacer los 
        //calculos para saber si es bisiesto y si ese calculo es incorrecto hace el apartado else.
        if ((a % 4 == 0 && a % 100 != 0) ||(a % 400 == 0) ){
            System.out.println("El año es bisiesto");
        }else{
            System.out.println("El año no es bisiesto");
        }
    }
}
