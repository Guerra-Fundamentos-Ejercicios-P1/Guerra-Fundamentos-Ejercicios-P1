// Autor: Guerra Andres
import java.util.Locale;
import java.util.Scanner;

// Programa 5: Promedio de tres notas y conversiones de tipo (cast)
public class Programa5_Conversiones {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // ENTRADA
        System.out.print("Nota 1 (entera): ");
        int n1 = sc.nextInt();
        System.out.print("Nota 2 (entera): ");
        int n2 = sc.nextInt();
        System.out.print("Nota 3 (entera): ");
        int n3 = sc.nextInt();

        // PROCESO
        int suma = n1 + n2 + n3;
        int promedioEntero = suma / 3;
        double promedioReal = (double) suma / 3;
        double castMalPuesto = (double) (suma / 3);
        int truncado = (int) promedioReal;
        int redondeado = (int) (promedioReal + 0.5);

        // SALIDA
        System.out.println();
        System.out.println("Suma de las notas:             " + suma);
        System.out.println("Promedio con int (suma / 3):   " + promedioEntero);
        System.out.printf("Promedio con (double) suma / 3: %.2f%n", promedioReal);
        System.out.printf("Con (double) (suma / 3):        %.2f%n", castMalPuesto);
        System.out.println("Truncado con (int):            " + truncado);
        System.out.println("Redondeado (+ 0.5 y (int)):    " + redondeado);
    }
}
