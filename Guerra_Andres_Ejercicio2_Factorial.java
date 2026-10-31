import java.util.Scanner;

/*
 * PSEUDOCÓDIGO
 * INICIO
 *   repetir
 *       leer n
 *       si n < 0 o n > 20 entonces mostrar "valor inválido"
 *   hasta que n >= 0 y n <= 20
 *   fact <- 1
 *   para i desde 2 hasta n hacer
 *       fact <- fact * i
 *   mostrar fact
 * FIN
 * Nota: con long el factorial llega solo hasta 20! (21! ya no cabe).
 */
public class Guerra_Andres_Ejercicio2_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Ingrese n (entre 0 y 20): ");
            n = sc.nextInt();
            if (n < 0 || n > 20) {
                System.out.println("Valor inválido, intente de nuevo.");
            }
        } while (n < 0 || n > 20);

        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        System.out.println(n + "! = " + fact);
        sc.close();
    }
}
