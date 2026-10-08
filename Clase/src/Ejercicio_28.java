/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author 15_1DAW
 */
public class Ejercicio_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /*pedimos las notas de los tres trimestres*/
        System.out.println("Dime la nota del primer trimestre \n");
        double nota1 = sc.nextDouble();
        
        System.out.println("Dime la nota del segundo trimestre \n");
        double nota2 = sc.nextDouble();
       
        System.out.println("Dime la nota del tercer trimestre \n");
        double nota3 = sc.nextDouble();
        
        /* Con estas notas hacemos la media tan y como saldria en un expediente academico osea contando con los decimales*/
        double media_d = (nota1 + nota2 + nota3) / 3;
        
        /* Truncamos las notas */
        System.out.println("\n");
        int entero1 = (int) nota1;
        int entero2 = (int) nota2;
        int entero3 = (int) nota3;
        /* Hacemos la nota media de los numeros truncados */
        int media_e = (entero1 + entero2 + entero3) / 3;
        
        System.out.println("SEGUN EL BOTELIN TENDRIAS");
        System.out.println(media_e);
        System.out.println("\n");
        
        
        System.out.println("SEGUN EL EXPEDIENTE ACADEMICO TENDRIAS");
        System.out.println(media_d);
        System.out.println("\n");
        
        
        
        
    }
}
