import java.util.Scanner;

public class Ejercicio_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduzca dos números mayores que 0");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        while (b != 0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        
        System.out.println(a);
        scanner.close();
    }
}
