import java.util.Scanner;

/*
 * PSEUDOCÓDIGO
 * INICIO
 *   leer n
 *   si n = 0 entonces cifras <- 1 y suma <- 0
 *   n <- valor absoluto de n
 *   cifras <- 0, suma <- 0
 *   mientras n <> 0 hacer
 *       suma <- suma + (n mod 10)
 *       n <- n div 10
 *       cifras <- cifras + 1
 *   fin mientras
 *   mostrar cifras, suma
 * FIN
 */
public class Guerra_Andres_Ejercicio3_CifrasEntero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        long n = Math.abs(sc.nextLong());

        int cifras = 0;
        int suma = 0;
        if (n == 0) {
            cifras = 1; // el 0 tiene una cifra
        }
        while (n != 0) {
            suma += n % 10;
            n /= 10;
            cifras++;
        }
        System.out.println("Cantidad de cifras: " + cifras);
        System.out.println("Suma de cifras: " + suma);
        sc.close();
    }
}
