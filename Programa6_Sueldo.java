// Autor: Guerra Andres
import java.util.Locale;
import java.util.Scanner;

// Programa 6: Sueldo de un empleado
public class Programa6_Sueldo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        final double APORTE_IESS = 0.0945;
        final int HORAS_NORMALES = 160;

        // ENTRADA: el nombre va primero con nextLine porque puede tener espacios
        System.out.print("Nombre del empleado: ");
        String nombre = sc.nextLine();
        System.out.print("Horas trabajadas en el mes: ");
        int horas = sc.nextInt();
        System.out.print("Valor por hora: ");
        double valorHora = sc.nextDouble();

        // PROCESO
        double sueldoBruto = horas * valorHora;
        double aporte = sueldoBruto * APORTE_IESS;
        double sueldoNeto = sueldoBruto - aporte;
        boolean haceHorasExtra = horas > HORAS_NORMALES;

        // SALIDA
        System.out.println();
        System.out.println("Empleado: " + nombre);
        System.out.printf("%-28s%10.2f%n", "Sueldo bruto", sueldoBruto);
        System.out.printf("%-28s%10.2f%n", "Aporte IESS 9.45%", aporte);
        System.out.printf("%-28s%10.2f%n", "Sueldo neto", sueldoNeto);
        System.out.println("Trabajo horas extra: " + haceHorasExtra);
    }
}
