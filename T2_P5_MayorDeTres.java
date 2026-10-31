import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea 2 - Problema 5: Ordenar tres numeros de mayor a menor
 * usando solo condicionales.
 */
public class T2_P5_MayorDeTres {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero 1: ");
        double a = sc.nextDouble();
        System.out.print("Numero 2: ");
        double b = sc.nextDouble();
        System.out.print("Numero 3: ");
        double c = sc.nextDouble();

        System.out.print("Orden de mayor a menor: ");
        if (a > b) {
            if (a > c) {
                if (b > c) {
                    System.out.println(a + ", " + b + ", " + c);
                } else {
                    System.out.println(a + ", " + c + ", " + b);
                }
            } else {
                System.out.println(c + ", " + a + ", " + b);
            }
        } else {
            if (b > c) {
                if (a > c) {
                    System.out.println(b + ", " + a + ", " + c);
                } else {
                    System.out.println(b + ", " + c + ", " + a);
                }
            } else {
                System.out.println(c + ", " + b + ", " + a);
            }
        }
    }
}
