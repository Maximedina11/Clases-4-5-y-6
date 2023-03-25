
import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = leer.nextLine();
        
        if(frase.equals("eureka")){
            System.out.println("Es correcto");
            
                 
        }
        else {
            System.out.println("Es incorrecto");
        }
    }
    
}
