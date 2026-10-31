import java.util.Locale;
import java.util.Scanner;

/*
 * PSEUDOCÓDIGO
 * INICIO
 *   leer a, b, c
 *   si a = 0 entonces mostrar "No es ecuación cuadrática" y terminar
 *   d <- b^2 - 4*a*c
 *   si d > 0 entonces
 *       x1 <- (-b + raíz(d)) / (2a)
 *       x2 <- (-b - raíz(d)) / (2a)
 *       mostrar "dos raíces reales distintas", x1, x2
 *   sino si d = 0 entonces
 *       x <- -b / (2a)
 *       mostrar "raíz doble", x
 *   sino
 *       mostrar "sin raíces reales"
 * FIN
 */
public class Guerra_Andres_Ejercicio1_EcuacionCuadratica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US); // decimales con punto
        System.out.print("Ingrese a: ");
        double a = sc.nextDouble();
        System.out.print("Ingrese b: ");
        double b = sc.nextDouble();
        System.out.print("Ingrese c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("a no puede ser 0: no es una ecuación cuadrática.");
        } else {
            double d = b * b - 4 * a * c;
            if (d > 0) {
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.printf("Dos raíces reales: x1 = %.4f, x2 = %.4f%n", x1, x2);
            } else if (d == 0) {
                double x = -b / (2 * a);
                System.out.printf("Raíz doble: x = %.4f%n", x);
            } else {
                System.out.println("Sin raíces reales");
            }
        }
        sc.close();
    }
}
