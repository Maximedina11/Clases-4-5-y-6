
import java.util.Scanner;


public class Ejercicio1 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int num = leer.nextInt();
        
        if(num % 2 == 0) {
            System.out.println(num + " es un número par.");
        } else {
            System.out.println(num + " es un número impar.");
        }
    }
}
