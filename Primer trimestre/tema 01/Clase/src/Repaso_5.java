/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/*
### Enunciado del Ejercicio: "Acceso al Festival"

Crea un programa en Java que controle el acceso de una persona a un evento y determine si tiene ciertas ventajas:

1. Pide al usuario que introduzca su edad por teclado.


2. Pide al usuario que indique si tiene una autorización firmada por sus padres (escribiendo `true` o `false`).


3. Pide al usuario que indique si ha comprado el pase VIP (escribiendo `true` o `false`).


4. Crea una variable booleana para saber si es mayor de edad (18 años o más).


5. Crea una condición lógica para determinar si "puede entrar" al festival. Para entrar, la persona debe ser mayor de edad **O** tener la autorización de los padres.


6. Crea otra condición lógica para determinar si "tiene barra libre". Para esto, debe ser mayor de edad **Y** tener el pase VIP.


7. Muestra por pantalla los dos resultados finales.

 *
 * @author USUARIO
 */
public class Repaso_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu edad \n");
        
        int edad = sc.nextInt();
        
        boolean mayoredad = edad >= 18;
        
        System.out.println("Tienes la autorizacion firmada por tus padres(true or false) \n");
        boolean autorizacion= sc.nextBoolean();
        
        System.out.println("Has comprado el VIP (true or false)\n");
        boolean vip = sc.nextBoolean();
        
        boolean entrada = mayoredad || autorizacion;
        
        System.out.println("puede entrar \n" + entrada);
        
        boolean barra = mayoredad && vip; 
        
        System.out.println("Barra libre \n " + barra);
        
      
        
    }
}
