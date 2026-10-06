/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Ejercicio_19 {      
    public static void main(String args []){
    short valor = 32767   ;    
    System.out.println("Valor inicial (máximo): " + valor); 
    
    valor++;
    System.out.println("Valor después de sumar 1: " + valor); 
    
    boolean Ciclico = (valor == -32768);
    System.out.println("¿El valor actual es igual al mínimo (-32768)? " + Ciclico);
}
}
