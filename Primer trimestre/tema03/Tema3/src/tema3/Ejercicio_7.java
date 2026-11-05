package tema3;

import java.util.Scanner;

/**
 *
 * @author 15_1DAW
 */
public class Ejercicio_7{

    public static double sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static double restar(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public static double multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }
    public static double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }    
    public static double multiplicar(int numero1, int numero2, int numero3) {
        return numero1 * numero2 * numero3;
    }
        public static double division(int numero1, int numero2) {
        return numero1 / numero2;
    }
    public static double RaizCuadrada(double numero1){
        return Math.sqrt(numero1);
    }
    public  static double potencia( double numero1, double numero2){
        return Math.pow(numero1, numero2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int num1 = 0, num2 = 0;;
        do {
            System.out.print("Elige una opcion: ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Salir");
            System.out.print("4. dividir: ");
            System.out.println("5. Raiz cuadrada");
            System.out.println("6. Potencia (El primer numero es la base y el segundo el exponente)");
            System.out.print("7. Salir del programa ");
            opcion = sc.nextInt();
            if (opcion >= 1 && opcion <= 6) {
                System.out.println("Introduce el primer numero:");
                num1 = sc.nextInt();
                
                if (opcion != 5) {
                    System.out.print("Introduce el segundo numero: ");
                    num2 = sc.nextInt();
                }
            }
            
            switch (opcion) {
                case 1:
System.out.println("Resultado de la suma: " + sumar(num1, num2));
                    break;
                case 2:
                    System.out.println("Resultado de la resta: " + restar(num1, num2));
                    break;
               case 3:
                    System.out.println("¿Qué multiplicación deseas hacer? (1: Dos enteros, 2: Dos decimales, 3: Tres enteros)");
                    int tipoMultiplicacion = sc.nextInt();

                    if (tipoMultiplicacion == 1) {
                        System.out.println("Resultado de multiplicar 2 enteros: " + multiplicar(num1, num2));
                    } else if (tipoMultiplicacion == 2) {
                        System.out.println("Resultado de multiplicar 2 decimales : " + multiplicar((double)num1, (double)num2));
                    } else if (tipoMultiplicacion == 3){
                        System.out.println("DIme el tercer numero que quieres multiplicar");
                         int num3 = sc.nextInt();
                        System.out.println("Resultado de multiplicar 3 enteros:" + multiplicar(num1, num2,num3));
                    }else{
                        System.out.println("no has insertado un tipo de multiplicacion valida");
                    }
                    break;              
                case 4:
                    if (num2 != 0) {
                        System.out.println("Resultado de la division: " + division(num1, num2));
                    } else {
                        System.out.println("Error: No se puede dividir por cero.");
                    }
                    break;
                case 5: 
                    double resultado = RaizCuadrada(num1);
                    System.out.println("El resultado de la raiz cuadrada de "+ num1 + "es :" + resultado);
                    break;
                case 6:
                    System.out.println("El resultado de esta potencia es:" + potencia(num1, num2));
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intentalo de nuevo.");
            }
        } while (opcion != 7);
    }

} 

