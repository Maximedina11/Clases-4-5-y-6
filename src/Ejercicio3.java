
import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra de 8 caracteres: ");
        String entrada = leer.nextLine();
        
        if(entrada.length() == 8){
            System.out.println("CORRECTO");
        }
        else {
            System.out.println("INCORRECTO");
        }
    }
   
}

