// Autor: Guerra Andres
import java.util.Locale;
import java.util.Scanner;

// Programa 1: Operaciones aritmeticas con dos numeros enteros
public class Programa1_Aritmeticos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // ENTRADA
        System.out.print("Ingrese el primer numero (a): ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo numero (b): ");
        int b = sc.nextInt();

        // PROCESO
        int suma = a + b;
        int resta = a - b;
        int producto = a * b;
        int cociente = a / b;
        int residuo = a % b;
        double divisionReal = (double) a / b;

        // SALIDA
        System.out.println();
        System.out.printf("%-26s%8d%n", "Suma (a + b):", suma);
        System.out.printf("%-26s%8d%n", "Resta (a - b):", resta);
        System.out.printf("%-26s%8d%n", "Producto (a * b):", producto);
        System.out.printf("%-26s%8d%n", "Cociente entero (a / b):", cociente);
        System.out.printf("%-26s%8d%n", "Residuo (a % b):", residuo);
        System.out.printf("%-26s%8.2f%n", "Division real:", divisionReal);
    }
}
