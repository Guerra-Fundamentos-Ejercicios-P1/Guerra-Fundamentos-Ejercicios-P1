import java.util.Locale;
import java.util.Scanner;

/*
 * PSEUDOCÓDIGO
 * INICIO
 *   suma <- 0, cantidad <- 0
 *   leer t
 *   mientras t <> -999 hacer
 *       si cantidad = 0 entonces mayor <- t y menor <- t
 *       sino actualizar mayor y menor
 *       suma <- suma + t
 *       cantidad <- cantidad + 1
 *       leer t
 *   fin mientras
 *   si cantidad = 0 entonces mostrar "no se ingresaron datos"
 *   sino mostrar mayor, menor, suma / cantidad
 * FIN
 */
public class Guerra_Andres_Ejercicio4_Temperaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US); // decimales con punto
        double mayor = 0, menor = 0, suma = 0;
        int cantidad = 0;

        System.out.print("Temperatura (-999 para terminar): ");
        double t = sc.nextDouble();
        while (t != -999) {
            if (cantidad == 0) {
                mayor = t;
                menor = t;
            } else {
                if (t > mayor) mayor = t;
                if (t < menor) menor = t;
            }
            suma += t;
            cantidad++;
            System.out.print("Temperatura (-999 para terminar): ");
            t = sc.nextDouble();
        }

        if (cantidad == 0) {
            System.out.println("No se ingresaron temperaturas.");
        } else {
            System.out.printf("Mayor: %.2f%n", mayor);
            System.out.printf("Menor: %.2f%n", menor);
            System.out.printf("Promedio: %.2f%n", suma / cantidad);
        }
        sc.close();
    }
}
