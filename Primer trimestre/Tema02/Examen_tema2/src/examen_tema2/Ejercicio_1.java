/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_tema2;

import java.util.Scanner;

/**
 *
 * @author Carlos
 * (Vinculado a CE a, CE e, CE g)
En una estación espacial, el terminal de control clasifica a las naves según su código de autorización numérico (un número entero del 1 al 4):
1: Nave Aliada  Imprime: "Acceso concedido: Sector Central".
2: Nave Comercial  Imprime: "Acceso concedido: Hangar de Carga".
3: Nave Desconocida  Imprime: "Acceso restringido: Enviar escolta".
4: Nave Hostil  Imprime: "¡ALERTA! Iniciar protocolos de defensa".
Cualquier otro número  Imprime: "Código no válido".
Se pide:
Escribe un programa en Java que solicite al usuario el código numérico y procese la respuesta utilizando la estructura switch.
Si la nave es Comercial (código 2), añade una condición adicional (if / else) que pida el tonelaje de carga (número entero). Si supera los 500 toneladas, debe mostrar el mensaje adicional: "Requiere inspección aduanera".
Comenta brevemente la función de cada bloque principal.

 */
public class Ejercicio_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        // solicitmos cual es el codigo de autorizacion
        System.out.print("Ingrese el codigo de autorizacion de la nave (1-4): ");
        int codigo = scanner.nextInt();
        // depende el codigo hace una cosa u otra
        switch (codigo) {
            // en el primer caso hace un sout
            case 1:
                System.out.println("Acceso concedido: Sector Central");
                break;
            // en el segundo caso solicita la carga y si el numero es mas de 500 indica que requiere inspeccion aduanera.
            case 2:
                System.out.println("Acceso concedido: Hangar de Carga");

                System.out.print("Ingrese el tonelaje de la carga : \n ");
                int tonelaje = scanner.nextInt();

                if (tonelaje > 500) {
                    System.out.println("Requiere inspeccion aduanera");
                } else {
                    System.out.println("Proceder con la descarga habitual");
                }
                break;
            // en el tercer caso india que envia escolta con un sout
            case 3:
                System.out.println("Acceso restringido: Enviar escolta");
                break;
            // en el cuarto caso Salta una alerta
            case 4:
                System.out.println("¡ALERTA! Iniciar protocolos de defensa");
                break;
            // si ingresa cualquier otro numero que no sea 1-4 salta aqui indicando codigo no valido
            default:
                System.out.println("Codigo no válido");
                break;
                
        }
    }
}
