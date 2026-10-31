// Autor: Guerra Andres
import java.util.Locale;
import java.util.Scanner;

// Programa 4: Cuenta de ahorros con operadores de asignacion
public class Programa4_Asignacion {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        final double TASA = 0.02;

        // ENTRADA
        System.out.print("Saldo inicial: ");
        double saldo = sc.nextDouble();
        System.out.print("Valor a depositar: ");
        double deposito = sc.nextDouble();
        System.out.print("Valor a retirar: ");
        double retiro = sc.nextDouble();

        // PROCESO
        int transacciones = 0;

        saldo += deposito;
        transacciones++;
        System.out.printf("Despues del deposito: %10.2f%n", saldo);

        saldo -= retiro;
        transacciones++;
        System.out.printf("Despues del retiro:   %10.2f%n", saldo);

        saldo *= 1 + TASA;
        transacciones++;
        System.out.printf("Con interes del 2%%:   %10.2f%n", saldo);

        double cuota = saldo;
        cuota /= 4;

        // SALIDA
        System.out.println();
        System.out.printf("Saldo final:          %10.2f%n", saldo);
        System.out.printf("Cuota si lo divido en 4: %7.2f%n", cuota);
        System.out.println("Transacciones hechas: " + transacciones);
    }
}
