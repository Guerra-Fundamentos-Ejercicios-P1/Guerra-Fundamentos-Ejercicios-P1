import java.util.Scanner;

/*
 * PSEUDOCÓDIGO
 * INICIO
 *   leer horas (entero, se cobra la hora iniciada completa)
 *   si horas <= 0 entonces mostrar "valor inválido" y terminar
 *   total <- 1.00 + (horas - 1) * 0.50
 *   si total > 6.00 entonces total <- 6.00   (tope diario)
 *   mostrar total
 * FIN
 */
public class Guerra_Andres_Ejercicio3_TarifaParqueadero {
    public static void main(String[] args) {
        final double PRIMERA_HORA = 1.00;
        final double HORA_ADICIONAL = 0.50;
        final double TOPE_DIARIO = 6.00;

        Scanner sc = new Scanner(System.in);
        System.out.print("Horas de parqueo: ");
        int horas = sc.nextInt();

        if (horas <= 0) {
            System.out.println("Las horas deben ser mayores a 0.");
        } else {
            double total = PRIMERA_HORA + (horas - 1) * HORA_ADICIONAL;
            if (total > TOPE_DIARIO) {
                total = TOPE_DIARIO;
            }
            System.out.printf("Total a pagar: $%.2f%n", total);
        }
        sc.close();
    }
}
