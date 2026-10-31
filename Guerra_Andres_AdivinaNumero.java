/*
 * Nombre: Andres Guerra
 * NRC: 37712
 * Fecha: 29 de octubre de 2026
 * Ejercicio 3: El programa piensa un numero del 1 al 100 y el usuario tiene
 *              7 intentos para adivinarlo, con pistas de "mas alto" o "mas bajo".
 */
import java.util.Random;
import java.util.Scanner;

public class Guerra_Andres_AdivinaNumero {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random azar = new Random();

        int secreto = azar.nextInt(100) + 1;   // numero escondido entre 1 y 100
        final int MAXIMO_INTENTOS = 7;
        int intentos = 0;                      // cuantas veces ha probado el usuario
        boolean acerto = false;                // pasa a true cuando adivina

        System.out.println("Estoy pensando en un numero del 1 al 100.");
        System.out.println("Tienes 7 intentos para adivinarlo.");

        // Se juega al menos una vez, y se repite mientras no haya acertado
        // y todavia le queden intentos
        do {
            System.out.print("Intento " + (intentos + 1) + ": ");
            int propuesta = teclado.nextInt();
            intentos++;

            if (propuesta == secreto) {
                acerto = true;
            } else if (propuesta < secreto) {
                System.out.println("El numero es mas alto.");
            } else {
                System.out.println("El numero es mas bajo.");
            }
        } while (!acerto && intentos < MAXIMO_INTENTOS);

        if (acerto) {
            System.out.println("Lo adivinaste en " + intentos + " intento(s).");
        } else {
            System.out.println("Se acabaron los intentos. El numero era " + secreto + ".");
        }
    }
}
