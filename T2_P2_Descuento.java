import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea 2 - Problema 2: Descuento por volumen en una ferreteria.
 */
public class T2_P2_Descuento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Tarifas declaradas como constantes
        final double PRECIO_SACO = 8.50;
        final double DESC_MEDIO = 0.05;   // de 21 a 50 sacos
        final double DESC_ALTO = 0.10;    // mas de 50 sacos
        final double IVA = 0.15;

        System.out.print("Cantidad de sacos de cemento: ");
        int sacos = sc.nextInt();

        double subtotal = sacos * PRECIO_SACO;

        double porcentaje;
        if (sacos <= 20) {
            porcentaje = 0;
        } else if (sacos <= 50) {
            porcentaje = DESC_MEDIO;
        } else {
            porcentaje = DESC_ALTO;
        }

        double descuento = subtotal * porcentaje;
        double base = subtotal - descuento;
        double valorIva = base * IVA;
        double total = base + valorIva;

        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Descuento (%.0f%%): $%.2f%n",
                porcentaje * 100, descuento);
        System.out.printf("Base imponible: $%.2f%n", base);
        System.out.printf("IVA (%.0f%%): $%.2f%n", IVA * 100, valorIva);
        System.out.printf("Total a pagar: $%.2f%n", total);
    }
}
