/*
 * PSEUDOCÓDIGO
 * INICIO
 *   cuenta <- 0
 *   para i desde 1 hasta 100 hacer
 *       si i mod 7 = 0 entonces
 *           mostrar i
 *           cuenta <- cuenta + 1
 *   mostrar cuenta
 * FIN
 */
public class Guerra_Andres_Ejercicio5_MultiplosDe7 {
    public static void main(String[] args) {
        int cuenta = 0;
        System.out.println("Múltiplos de 7 entre 1 y 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
                cuenta++;
            }
        }
        System.out.println();
        System.out.println("Cantidad de múltiplos: " + cuenta);
    }
}
