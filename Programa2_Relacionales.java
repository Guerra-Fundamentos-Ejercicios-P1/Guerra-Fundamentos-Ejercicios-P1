// Autor: Guerra Andres
import java.util.Scanner;

// Programa 2: Comparacion de dos numeros con operadores relacionales
public class Programa2_Relacionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ENTRADA
        System.out.print("Ingrese el primer numero (a): ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo numero (b): ");
        int b = sc.nextInt();

        // PROCESO: cada comparacion produce un boolean
        boolean igual = a == b;
        boolean diferente = a != b;
        boolean menor = a < b;
        boolean menorIgual = a <= b;
        boolean mayor = a > b;
        boolean mayorIgual = a >= b;

        // SALIDA
        System.out.println();
        System.out.println("a = " + a + " y b = " + b);
        System.out.println("a == b : " + igual);
        System.out.println("a != b : " + diferente);
        System.out.println("a <  b : " + menor);
        System.out.println("a <= b : " + menorIgual);
        System.out.println("a >  b : " + mayor);
        System.out.println("a >= b : " + mayorIgual);
    }
}
