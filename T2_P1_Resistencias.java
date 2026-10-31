import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea 2 - Problema 1: Resistencias en serie o paralelo.
 */
public class T2_P1_Resistencias {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Resistencia 1 (ohmios): ");
        double r1 = sc.nextDouble();
        System.out.print("Resistencia 2 (ohmios): ");
        double r2 = sc.nextDouble();
        System.out.print("Conexion (S = serie, P = paralelo): ");
        char tipo = Character.toUpperCase(sc.next().charAt(0));

        if (r1 <= 0 || r2 <= 0) {
            System.out.println("Error: las resistencias deben ser positivas.");
        } else {
            switch (tipo) {
                case 'S':
                    double serie = r1 + r2;
                    System.out.printf("Req (serie): %.2f ohmios%n", serie);
                    break;
                case 'P':
                    double paralelo = (r1 * r2) / (r1 + r2);
                    System.out.printf("Req (paralelo): %.2f ohmios%n", paralelo);
                    break;
                default:
                    System.out.println("Error: conexion invalida (use S o P).");
            }
        }
    }
}
