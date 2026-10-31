/*
 * Nombre completo: Guerra Andres
 * NRC: 37712
 * Fecha: 22/10/2026
 * Ejercicio E2: Leer segundos y mostrarlos en horas, minutos y segundos.
 */
import java.util.Locale;
import java.util.Scanner;

public class Lab1_E2_Guerra {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // ENTRADA
        System.out.print("Ingrese el tiempo total en segundos: ");
        int total = sc.nextInt();

        // PROCESO (division entera y modulo)
        int horas = total / 3600;
        int resto = total % 3600;
        int minutos = resto / 60;
        int segundos = resto % 60;

        // SALIDA
        System.out.printf("%d s = %d h %d min %d s%n", total, horas, minutos, segundos);

        // Verificacion: horas*3600 + minutos*60 + segundos debe dar el valor leido
        int reconstruido = horas * 3600 + minutos * 60 + segundos;
        System.out.printf("Verificacion: %d%n", reconstruido);
        System.out.println("Reconstruccion correcta: " + (reconstruido == total));
    }
}
