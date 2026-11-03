package tema_02;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
         
/**
 *
 * @author USUARIO
 */
public class REPASO_2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
        int pinCorrecto = 1810;
        int Intentos = 3;
        boolean accesoPermitido = false;
        while (Intentos <=3){
            System.out.println("Introduce un ping de 4 caracteres");
            int pinIntroducido = sc.nextInt();
            
            if(pinIntroducido == pinCorrecto){
                System.out.println("Has introducido el pin correcto \n Acceso permitido");
                accesoPermitido = true;
                break;
            }else {
                System.out.println("Acceso denegado, contraseña incorrecta");
            Intentos--;
                System.out.println("te quedan "+ Intentos);
            }
            
            if (!accesoPermitido && Intentos == 0) {
                System.out.println("Acceso bloqueado. Sistema terminado.");
                break;
            }
        }
                
    }
}
