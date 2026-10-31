import java.util.Scanner;

/*
 * PSEUDOCÓDIGO
 * INICIO
 *   leer anio
 *   si (anio mod 4 = 0 Y anio mod 100 <> 0) O (anio mod 400 = 0) entonces
 *       mostrar "es bisiesto"
 *   sino
 *       mostrar "no es bisiesto"
 * FIN
 */
public class Guerra_Andres_Ejercicio2_AnioBisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        int anio = sc.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println(anio + " es bisiesto");
        } else {
            System.out.println(anio + " no es bisiesto");
        }
        sc.close();
    }
}
