/*
 * Nombre: Andres Guerra
 * NRC: 37712
 * Fecha: 29 de octubre de 2026
 * Ejercicio 4: Pedir un numero impar y dibujar un rombo de asteriscos de
 *              esa cantidad de filas. Si el numero no sirve, se vuelve a pedir.
 */
import java.util.Scanner;

public class Guerra_Andres_Rombo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;

        // Se pide el tamano al menos una vez y se repite si no es impar y positivo
        do {
            System.out.print("Tamano del rombo (un numero impar y positivo): ");
            n = teclado.nextInt();

            if (n <= 0 || n % 2 == 0) {
                System.out.println("Ese numero no sirve, intenta de nuevo.");
            }
        } while (n <= 0 || n % 2 == 0);

        int mitad = n / 2;   // numero de la fila del centro (la mas ancha)

        for (int fila = 0; fila < n; fila++) {

            // Que tan lejos esta esta fila de la del centro
            int distancia = Math.abs(mitad - fila);

            // Cuanto mas lejos del centro, mas espacios y menos asteriscos
            int espacios = distancia;
            int asteriscos = n - 2 * distancia;

            for (int i = 0; i < espacios; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < asteriscos; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
