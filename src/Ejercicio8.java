import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del cuadrado: ");
        int num = leer.nextInt();
        
        // Imprimir las filas
        for (int i = 1; i <= num; i++) {
            // Imprimir las columnas
            for (int j = 1; j <= num; j++) {
                // Imprimir el asterisco en las esquinas o en los bordes
                if (i == 1 || i == num || j == 1 || j == num) {
                    System.out.print("* ");
                } else { 
                    System.out.print("  ");
                }
            }
            System.out.println(); 
        }
    }
}

