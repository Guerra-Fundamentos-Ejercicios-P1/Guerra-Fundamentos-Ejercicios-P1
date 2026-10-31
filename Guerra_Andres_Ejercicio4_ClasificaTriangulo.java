import java.util.Locale;
import java.util.Scanner;

/*
 * PSEUDOCÓDIGO
 * INICIO
 *   leer a, b, c
 *   si a<=0 O b<=0 O c<=0 O a+b<=c O a+c<=b O b+c<=a entonces
 *       mostrar "no forma un triángulo"
 *   sino
 *       si a=b Y b=c entonces mostrar "equilátero"
 *       sino si a=b O a=c O b=c entonces mostrar "isósceles"
 *       sino mostrar "escaleno"
 * FIN
 */
public class Guerra_Andres_Ejercicio4_ClasificaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Lado a: ");
        double a = sc.nextDouble();
        System.out.print("Lado b: ");
        double b = sc.nextDouble();
        System.out.print("Lado c: ");
        double c = sc.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Los lados no forman un triángulo.");
        } else if (a == b && b == c) {
            System.out.println("Triángulo equilátero");
        } else if (a == b || a == c || b == c) {
            System.out.println("Triángulo isósceles");
        } else {
            System.out.println("Triángulo escaleno");
        }
        sc.close();
    }
}
