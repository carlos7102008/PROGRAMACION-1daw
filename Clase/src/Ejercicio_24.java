
import java.util.Scanner;


/** Algoritmo por si podemos salir a la calle.
 * Solo podemos salir si noesta lloviendo y hemos finalizado nuestras tareas o si tenemos que ir a la biblioteca.
 **/
public class Ejercicio_24 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        /* Solicitamos al usuario si llueve */
        System.out.println ("No esta lloviendo? \n");
        boolean no_lluvia = sc.nextBoolean();
        /* Solicitamos al usuario si a terminado las tareas*/
        System.out.println ("Has hecho las tareas? \n");
        boolean tareas = sc.nextBoolean();
        /* Solicitamos al usuario si tiene que ir a la biblioteca */
        System.out.println ("Tienes que ir a la biblioteca? \n");
        boolean biblioteca = sc.nextBoolean();
        
        /*Con los datos anteriores decidimos si puede salir o no */
        boolean salir = no_lluvia && tareas || biblioteca;
        
        System.out.println("Podrias salir? \n" + salir);
}
}