import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un valor límite positivo: ");
        int limite = leer.nextInt();

        int suma = 0;
        int contador = 0;

        while (true) {
            System.out.print("Ingrese un número: ");
            int numero = leer.nextInt();

            if (numero < 0) {
                System.out.println("El número ingresado no es positivo. Inténtelo de nuevo.");
                continue;
            }

            if (suma + numero > limite) {
                break;
            }

            suma += numero;
            contador++;
        }

        System.out.println("La suma de los " + contador + " números ingresados es " + suma);

        leer.close();
    }
}
