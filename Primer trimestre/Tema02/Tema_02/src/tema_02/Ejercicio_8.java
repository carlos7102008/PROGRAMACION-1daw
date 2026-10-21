/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author 15_1DAW
 */
public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime tu nota");
        int nota = sc.nextInt();
        
        switch (nota){
            case 0,1,2,3,4: 
                System.out.println("Tu nota es insuficiente");
                break;
            case 5:
                System.out.println("Tu nota es suficiente");
                break;
            case 6:
                System.out.println("Tu nota es un bien");
                break;
            case 7,8:
                System.out.println("Tu nota es un notable");
                break;
            case 9,10:
                System.out.println("Tu nota es un sobresaliente");
                break;
            default:
                System.out.println("Esta nota no es valida");
                break;
            
        }
    }
}
