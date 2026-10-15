/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**Enunciado del Ejercicio: "La Ruta en Bicicleta"
Diseña un programa en Java para comprobar si un ciclista cumple las normas para salir a carretera y calcula algunos datos de su bicicleta:
Declara una constante para el valor de PI (3.14159) y pide al usuario que introduzca el radio de la rueda de su bicicleta.   
Calcula la longitud (perímetro) de la rueda usando la fórmula matemática correspondiente y muéstrala por pantalla.
* Pide al usuario que introduzca su edad.
* Guarda en una variable booleana si es mayor de edad (mayor de 18).
* Pregunta al usuario si lleva el casco puesto (leyendo un valor true o false por teclado)
* Crea una condición lógica para determinar si el ciclista "puede circular": para ello tiene que ser mayor de edad y llevar el casco puesto.
* Por último, utiliza el operador de incremento (++) para sumar 1 a la edad del ciclista y muestra por pantalla cuántos años tendrá el año que viene.
 */
public class REPASO_3 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
          
    final double pi = 3.14159;
    
    
        System.out.println("Dime el radio de la rueda de tu bicicleta \n");
        double radio = sc.nextDouble();
        
        
        double perimetro_circulo = 2 * pi * radio;
        System.out.println("El perimetro de la rueda es: " + perimetro_circulo + "cm²");
        
        System.out.println("Dime tu edad \n");
        int edad = sc.nextInt();
        
        boolean mayor_edad = edad >= 18;
        
        System.out.println("Llevas el casco puesto?(responde true o false) \n");
        boolean casco = sc.nextBoolean();
     
        boolean circular = casco && mayor_edad;
        System.out.println("puede circular: " + circular);
        
        int edad_año = edad++ ;
        System.out.println("tu edad el año que viene es: " + edad_año);
    
    }
}
