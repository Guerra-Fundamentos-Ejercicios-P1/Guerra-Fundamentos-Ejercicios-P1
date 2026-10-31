import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea 2 - Problema 3: Nota final (promedio de tres parciales).
 */
public class T2_P3_NotaFinal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota parcial 1 (sobre 20): ");
        double n1 = sc.nextDouble();
        System.out.print("Nota parcial 2 (sobre 20): ");
        double n2 = sc.nextDouble();
        System.out.print("Nota parcial 3 (sobre 20): ");
        double n3 = sc.nextDouble();

        double promedio = (n1 + n2 + n3) / 3;
        System.out.printf("Promedio: %.2f%n", promedio);

        if (promedio >= 14) {
            System.out.println("Resultado: Aprobado");
        } else if (promedio >= 9) {
            System.out.println("Resultado: Supletorio");
        } else {
            System.out.println("Resultado: Reprobado");
        }
    }
}
