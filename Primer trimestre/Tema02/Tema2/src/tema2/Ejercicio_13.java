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
public class Ejercicio_13 {
    public static void main(String[] args) {
        
    
     Scanner sc = new Scanner (System.in);
    //pedimos que nos ingrese hasya que numero quiere que el programa cuente
     System.out.println("Hasta que numero quieres que cuente\n");
     //Guardamos ese numero en una variable
     int num1 = sc.nextInt();
     if (num1 < 0 ){
         num1 = -1 * num1;
     }
        System.out.println("\n\n");
     //Le ponemos inicio de cuenta en este caso 1   
     int inicio = 1;
     
     // hacemos un bucle el cual lee la variable inicio y la compara con la variable numero.
     
     // si es menor ejecuta por pantalla su valor
     // si es mayor no ejecuta nada y termina el programa
     while(inicio < num1){
         System.out.println(inicio);
         inicio++;
     }
}
}
