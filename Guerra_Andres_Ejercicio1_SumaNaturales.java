import java.util.Scanner;

/*
 * PSEUDOCÓDIGO
 * INICIO
 *   leer n
 *   suma <- 0
 *   para i desde 1 hasta n hacer
 *       suma <- suma + i
 *   fin para
 *   formula <- n * (n + 1) / 2
 *   mostrar suma, formula
 *   si suma = formula entonces mostrar "coinciden" sino "no coinciden"
 * FIN
 */
public class Guerra_Andres_Ejercicio1_SumaNaturales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese n: ");
        long n = sc.nextLong();

        long suma = 0;
        for (long i = 1; i <= n; i++) {
            suma += i;
        }
        long formula = n * (n + 1) / 2;

        System.out.println("Suma con ciclo: " + suma);
        System.out.println("Suma con fórmula n(n+1)/2: " + formula);
        if (suma == formula) {
            System.out.println("Los resultados coinciden.");
        } else {
            System.out.println("Los resultados NO coinciden.");
        }
        sc.close();
    }
}
