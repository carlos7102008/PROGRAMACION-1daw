/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

import java.util.Arrays;

/**
 *
 * @author USUARIO
 */
public class ULTIMO_REPASO {

    public static void main(String[] args) {
        String[] usuarios = {"  Ana2026 ", "carlos_1", "LUIS99", "  marta  ", "Eva2026"};
        limpiarUsuarios(usuarios);
        System.out.println("Usuarios: " + Arrays.toString(usuarios));

        System.out.println("usuarios validos : " + contarValidos(usuarios));
    }

    public static void limpiarUsuarios(String[] lista) {
      
        if (lista == null) {
            System.out.println("El valor de larray es nulo");
            return;
        } for (int i = 0; i < lista.length; i++) {
            lista[i] = lista[i].toLowerCase().trim();
        }
    }

    public static int contarValidos(String[] lista) {
        int contador = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].matches("[a-z0-9]{5,10}")){
            contador++;}
        }
        return contador;
    }
    
}
