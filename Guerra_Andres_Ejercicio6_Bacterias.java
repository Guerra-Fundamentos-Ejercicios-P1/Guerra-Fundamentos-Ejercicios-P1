/*
 * PSEUDOCÓDIGO
 * INICIO
 *   poblacion <- 100, horas <- 0
 *   mientras poblacion <= 1000000 hacer
 *       poblacion <- poblacion * 2
 *       horas <- horas + 1
 *   fin mientras
 *   mostrar horas, poblacion
 * FIN
 */
public class Guerra_Andres_Ejercicio6_Bacterias {
    public static void main(String[] args) {
        long poblacion = 100;
        int horas = 0;

        while (poblacion <= 1_000_000) {
            poblacion *= 2;
            horas++;
        }
        System.out.println("La población supera 1 000 000 en " + horas + " horas.");
        System.out.println("Población en ese momento: " + poblacion);
    }
}
