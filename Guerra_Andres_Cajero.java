/*
 * Nombre: Andres Guerra
 * NRC: 37712
 * Fecha: 29 de octubre de 2026
 * Ejercicio 5: Cajero automatico con menu que se repite: consultar, depositar,
 *              retirar y salir. Empieza con $500 y no permite montos invalidos.
 */
import java.util.Locale;
import java.util.Scanner;

public class Guerra_Andres_Cajero {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);   // los decimales se escriben con punto

        double saldo = 500;   // dinero que hay en la cuenta al empezar
        int opcion;

        // El menu se muestra al menos una vez y se repite hasta elegir salir
        do {
            System.out.println();
            System.out.println("===== CAJERO AUTOMATICO =====");
            System.out.println("1) Consultar saldo   2) Depositar   3) Retirar   0) Salir");
            System.out.print("Elige una opcion: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.printf(Locale.US, "Saldo: $%.2f%n", saldo);
                    break;

                case 2:
                    System.out.print("Cuanto quieres depositar? $");
                    double deposito = teclado.nextDouble();

                    // Solo se acepta si el monto es mayor que cero
                    if (deposito > 0) {
                        saldo = saldo + deposito;
                        System.out.println("Deposito aceptado.");
                    } else {
                        System.out.println("Monto invalido.");
                    }
                    break;

                case 3:
                    System.out.print("Cuanto quieres retirar? $");
                    double retiro = teclado.nextDouble();

                    // Solo se acepta si es mayor que cero y no pasa de lo que hay
                    if (retiro > 0 && retiro <= saldo) {
                        saldo = saldo - retiro;
                        System.out.println("Retiro aceptado.");
                    } else {
                        System.out.println("Fondos insuficientes o monto invalido.");
                    }
                    break;

                case 0:
                    System.out.println("Fin del programa. Hasta pronto!");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 0);
    }
}
