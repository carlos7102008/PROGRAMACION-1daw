/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author USUARIO
 */
public class Repaso_3 {
    public static void main(String[] args) {
        String correo = "Carlos.DAW@CentroEducativo.ES ";
        
        String minusculas = correo.toLowerCase();
        boolean contiene = correo.contains("@") && (correo.endsWith(".es")|| correo.endsWith(".com"));
        System.out.println("¿Correo valido?" + contiene);
        
        int posArroba = correo.indexOf("@");
        
        String usuario = correo.substring(0, posArroba);
        String dominio = correo.substring( posArroba + 1);
                
        
        String usuarioModificado = usuario.replace(".", "_");
    }
   
}
