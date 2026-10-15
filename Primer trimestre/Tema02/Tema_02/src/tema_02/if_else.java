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
public class if_else {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      // compararremos dos numeros para ver cual es mayor.
      
      System.out.println("Dime un numero");
      int numero1 = sc.nextInt();
      System.out.println("Dime otro numero");
      int numero2 = sc.nextInt();     
   
        // haremos la comparacion.
        // En el primer y segundo caso haremos que comparen los dos numeros indicando cual es mayor
        if (numero1 > numero2){
            System.out.println("El numero mayor es " + numero1 + "!");
            
        }else if(numero1 < numero2) {
            System.out.println("El numero mayor es " + numero2 + "!");
            // En el tercer caso haremos que si no es ni mayor ni menor nos muestre que los numeros son iguales
        }else{
              System.out.println("Los dos numeros son iguales");  
                }
        System.out.println("FIN ");
    }
}
