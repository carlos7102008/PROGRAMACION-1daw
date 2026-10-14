/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**Enunciado del Ejercicio de Práctica: "La Tienda del Aventurero"
Crea un programa en Java que simule una tienda de videojuegos con las siguientes características:

Define una constante para el precio de una "Espada Legendaria" con un valor de 350.50.   
JAVA (hecho)

Pide al usuario que introduzca por teclado su nivel de personaje actual.   
JAVA

Pide al usuario que introduzca por teclado cuánto oro tiene en su inventario.

Calcula y guarda en una variable booleana si el jugador tiene un nivel superior a 10.

Calcula y guarda en otra variable booleana si el jugador tiene oro suficiente o de sobra para pagar la espada.

Finalmente, utiliza un operador lógico para determinar si el jugador puede comprar la espada (solo puede comprarla si tiene el nivel suficiente Y además tiene el oro suficiente).

Muestra por pantalla todos los resultados: el precio, si cumple el nivel, si cumple el oro, y si finalmente puede realizar la compra.
 */
public class REPASO_1 {
    public static void main(String[]Args) {
        final double espada = 350.50;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime tu nivel \n");
        int nivel = sc.nextInt();
        
        boolean apto_nivel = nivel > 10;
        
        System.out.println("Dime el oro que tienes \n");
        int oro = sc.nextInt();
        
        boolean apto_oro = oro > 350.50;
        
        boolean compra = (apto_nivel && apto_oro);
        
        System.out.println("\n" );
        
        System.out.println("Precio espada: " + espada );
        System.out.println("Cumple el nivel necesario: " + apto_nivel );
        System.out.println("Tiene el oro sufienciente: " +  apto_oro);
        System.out.println("puede realizar la compra: " + compra );

        
    }
}
