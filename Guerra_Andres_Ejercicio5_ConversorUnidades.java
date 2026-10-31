import java.util.Locale;
import java.util.Scanner;

/*
 * PSEUDOCÓDIGO
 * INICIO
 *   mostrar menú: 1) m->ft  2) kg->lb  3) °C->°F
 *   leer opcion
 *   segun opcion
 *     1: leer m;  ft <- m * 3.28084;   mostrar ft
 *     2: leer kg; lb <- kg * 2.20462;  mostrar lb
 *     3: leer C;  F <- C * 9/5 + 32;   mostrar F
 *     otro: mostrar "opción inválida"
 * FIN
 */
public class Guerra_Andres_Ejercicio5_ConversorUnidades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("=== CONVERSOR DE UNIDADES ===");
        System.out.println("1) Metros a pies (m -> ft)");
        System.out.println("2) Kilogramos a libras (kg -> lb)");
        System.out.println("3) Celsius a Fahrenheit (°C -> °F)");
        System.out.print("Elija una opción: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Metros: ");
                double m = sc.nextDouble();
                System.out.printf("%.2f m = %.2f ft%n", m, m * 3.28084);
                break;
            case 2:
                System.out.print("Kilogramos: ");
                double kg = sc.nextDouble();
                System.out.printf("%.2f kg = %.2f lb%n", kg, kg * 2.20462);
                break;
            case 3:
                System.out.print("Grados Celsius: ");
                double c = sc.nextDouble();
                System.out.printf("%.2f °C = %.2f °F%n", c, c * 9 / 5 + 32);
                break;
            default:
                System.out.println("Opción inválida.");
        }
        sc.close();
    }
}
