/*
 * Nombre completo: Guerra Andres
 * NRC: 37712
 * Fecha: 22/10/2026
 * Ejercicio E1: Leer grados Celsius y mostrar Fahrenheit y Kelvin en una tabla.
 */
import java.util.Locale;
import java.util.Scanner;

public class Lab1_E1_Guerra {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // ENTRADA
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = sc.nextDouble();

        // PROCESO (se usa 9.0/5.0 para que la division sea real)
        double fahrenheit = celsius * 9.0 / 5.0 + 32;
        double kelvin = celsius + 273.15;

        // SALIDA
        System.out.printf("%-12s%10.2f%n", "Celsius", celsius);
        System.out.printf("%-12s%10.2f%n", "Fahrenheit", fahrenheit);
        System.out.printf("%-12s%10.2f%n", "Kelvin", kelvin);
    }
}
