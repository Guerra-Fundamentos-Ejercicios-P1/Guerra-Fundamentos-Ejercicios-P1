/*
 * Nombre completo: Guerra Andres
 * NRC: 37712
 * Fecha: 22/10/2026
 * Ejercicio E4: Factura con IVA del 15 % a partir del producto,
 * la cantidad y el precio unitario.
 */
import java.util.Locale;
import java.util.Scanner;

public class Lab1_E4_Guerra {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        final double IVA = 0.15;

        // ENTRADA: el nombre se lee primero con nextLine (puede tener espacios)
        System.out.print("Producto: ");
        String producto = sc.nextLine();
        System.out.print("Cantidad: ");
        int cantidad = sc.nextInt();
        System.out.print("Precio unitario: ");
        double precio = sc.nextDouble();

        // PROCESO
        double subtotal = cantidad * precio;
        double valorIva = subtotal * IVA;
        double total = subtotal + valorIva;

        // SALIDA
        System.out.println();
        System.out.println(producto);
        System.out.printf("%-25s%10.2f%n", "Subtotal", subtotal);
        System.out.printf("%-25s%10.2f%n", "IVA 15%", valorIva);
        System.out.printf("%-25s%10.2f%n", "TOTAL", total);
    }
}
