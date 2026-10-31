/*
 * Nombre completo: Guerra Andres
 * NRC: 37712
 * Fecha: 22/10/2026
 * Ejercicio E3: Leer un entero de cuatro cifras; mostrar suma de cifras,
 * numero invertido y si es par.
 */
import java.util.Locale;
import java.util.Scanner;

public class Lab1_E3_Guerra {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // ENTRADA
        System.out.print("Ingrese un entero de cuatro cifras: ");
        int n = sc.nextInt();

        // PROCESO: extraccion de cifras con / y %
        int unidades = n % 10;
        int decenas = (n / 10) % 10;
        int centenas = (n / 100) % 10;
        int millares = (n / 1000) % 10;

        int suma = unidades + decenas + centenas + millares;
        int invertido = unidades * 1000 + decenas * 100 + centenas * 10 + millares;
        boolean esPar = n % 2 == 0;

        // SALIDA
        System.out.println("Suma de cifras: " + suma);
        System.out.println("Invertido: " + invertido);
        System.out.println("Es par: " + esPar);
    }
}
