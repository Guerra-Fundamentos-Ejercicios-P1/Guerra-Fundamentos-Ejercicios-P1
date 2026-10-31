// Autor: Guerra Andres
import java.util.Locale;
import java.util.Scanner;

// Programa 3: Aprobacion de un curso con operadores logicos
public class Programa3_Logicos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        final double NOTA_MINIMA = 7.0;
        final int ASISTENCIA_MINIMA = 70;

        // ENTRADA
        System.out.print("Nota final (0 a 10): ");
        double nota = sc.nextDouble();
        System.out.print("Porcentaje de asistencia: ");
        int asistencia = sc.nextInt();

        // PROCESO
        boolean notaValida = nota >= 0 && nota <= 10;
        boolean notaOk = nota >= NOTA_MINIMA;
        boolean asistenciaOk = asistencia >= ASISTENCIA_MINIMA;
        boolean aprueba = notaOk && asistenciaOk;
        boolean cumpleAlguno = notaOk || asistenciaOk;
        boolean reprueba = !aprueba;

        // SALIDA
        System.out.println();
        System.out.println("La nota es valida:        " + notaValida);
        System.out.println("Nota >= 7.0:              " + notaOk);
        System.out.println("Asistencia >= 70%:        " + asistenciaOk);
        System.out.println("Aprueba (nota Y asist.):  " + aprueba);
        System.out.println("Cumple al menos uno (O):  " + cumpleAlguno);
        System.out.println("Reprueba (NO aprueba):    " + reprueba);
    }
}
