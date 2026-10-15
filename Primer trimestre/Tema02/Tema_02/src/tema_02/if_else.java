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
        
    
      String usuario = "Fran";
        final String usuario_correcto = "Fran";
        // Si el usuario introducido coincide con USUARIO_CORRECTO
        // le damos la bienvenida, en otro caso, continua el programa.
        
        if (usuario == usuario_correcto){
            System.out.println("Bienvenido " + usuario + "!");
            
        }else {
            System.out.println("Usuario incorrecto");
        }
        System.out.println("FIN ");
    }
}
