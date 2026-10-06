/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 15_1DAW
 */
public class Ejercicio_14_ampliacion {
    public static void main(String args []){
        int Pocione_Jugador = 6;
        double Precio_Oro = 200;
       System.out.println("Datos Iniciales");
       System.out.println("Pociones " + Pocione_Jugador);
       System.out.println("ORO " + Precio_Oro);
        /** Simulamos la compra de mas pociones*/

        int compra = Pocione_Jugador + 3 ;
        double Oro_final = Precio_Oro - 120 ;
        /** La mochila se llena si tiene mas de 7 pociones*/
        boolean Mochila = compra > 7;
        System.out.println("Tras la compra de las pociones");

        System.out.println("Pociones " + Pocione_Jugador);
        System.out.println("ORO " + Precio_Oro);
        System.out.println("¿Tras la compra Tengo la mochila llena? " + Mochila); 
    }
    
}
    

