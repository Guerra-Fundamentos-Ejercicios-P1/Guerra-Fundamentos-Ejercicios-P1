import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea 2 - Problema 6: Clasificacion de un angulo.
 */
public class T2_P6_Angulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el angulo en grados: ");
        double angulo = sc.nextDouble();

        if (angulo > 360) {
            angulo = angulo % 360;
            if (angulo == 0) {
                angulo = 360;   // era multiplo exacto de 360
            }
            System.out.printf("Angulo reducido: %.2f grados%n", angulo);
        }

        String tipo;
        if (angulo < 90) {
            tipo = "agudo";
        } else if (angulo == 90) {
            tipo = "recto";
        } else if (angulo < 180) {
            tipo = "obtuso";
        } else if (angulo == 180) {
            tipo = "llano";
        } else if (angulo < 360) {
            tipo = "concavo";
        } else {
            tipo = "completo";
        }
        System.out.println("Clasificacion: angulo " + tipo);
    }
}
