/*
 * Nombre completo: Guerra Andres
 * NRC: 37712
 * Fecha: 22/10/2026
 * Ejercicio E5: Evaluacion de expresiones; se imprimen los valores para
 * compararlos con los calculados a mano.
 */
public class Lab1_E5_Guerra {
    public static void main(String[] args) {
        int a = 9, b = 4;

        int r1 = a / b + a % b * 2;
        boolean r2 = 10 - 3 * 2 > 3 && 5 % 2 == 1;
        double r3 = (double) 7 / 2 + 7 / 2;
        boolean r4 = !(4 >= 4) || 2 * 3 != 6;

        System.out.println("a / b + a % b * 2 = " + r1);
        System.out.println("10 - 3 * 2 > 3 && 5 % 2 == 1 = " + r2);
        System.out.println("(double) 7 / 2 + 7 / 2 = " + r3);
        System.out.println("!(4 >= 4) || 2 * 3 != 6 = " + r4);
    }
}
