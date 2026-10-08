/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 15_1DAW
 */
public class Ejercicio_26 {
    public static void main(String[] args) {
     boolean op_1 = 10 + 5 * 2 > 20 && 4 == 4;
     boolean op_2 = !(7 + 2 > 10)|| 3 * 2 <= 6;
     boolean op_3 = 10 / 2 + 3 * 5 == 19 && true;
     int x = 5; 
     int op_4 = x +=3 * 2;
     
     boolean b = false;
     boolean op_5 = !b || 7 % 2 == 1;
     /*
     Orden de prioridad.
     1. Parentesis.
     2. Unarios; !
     3. Multiplicativo; *,/,%
     4. Aditivo; + , - 
     5. Relacionales; >,<,>=,<=
     6. Igualdad; == , !=
     7. AND lógico; &&
     8. OR lógico; ||
     9. Asignacion; =, +=, -=
     */
        System.out.println("Ejercicio 1 " + op_1);
        System.out.println("Ejercicio 2 " + op_2);
        System.out.println("Ejercicio 3 " + op_3);
        System.out.println("Ejercicio 4 " + op_4);
        System.out.println("Ejercicio 5 " + op_5);
    }
}
