/*
 * Nombre: Andres Guerra
 * NRC: 37712
 * Fecha: 29 de octubre de 2026
 * Ejercicio 2: Leer temperaturas de un sensor hasta que se escriba un numero
 *              negativo y mostrar cuantas hubo, el promedio, la mayor y la menor.
 */
import java.util.Locale;
import java.util.Scanner;

public class Guerra_Andres_SensorTemperatura {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US); // los decimales se escriben con punto

        // Estas variables empiezan en cero justo antes de leer los datos
        int cantidad = 0;      // cuantas temperaturas buenas llevamos
        double suma = 0;       // la suma de todas ellas
        double mayor = 0;      // la temperatura mas alta
        double menor = 0;      // la temperatura mas baja

        System.out.println("Escribe las temperaturas una por una.");
        System.out.println("Para terminar, escribe un numero negativo.");
        System.out.print("Temperatura: ");
        double lectura = teclado.nextDouble();

        // Seguimos leyendo mientras el numero NO sea negativo
        while (lectura >= 0) {

            if (cantidad == 0) {
                // La primera temperatura es, por ahora, la mayor y la menor
                mayor = lectura;
                menor = lectura;
            } else {
                if (lectura > mayor) {
                    mayor = lectura;
                }
                if (lectura < menor) {
                    menor = lectura;
                }
            }

            cantidad++;
            suma = suma + lectura;

            System.out.print("Temperatura: ");
            lectura = teclado.nextDouble();
        }

        // Solo calculamos el promedio si de verdad hubo temperaturas
        if (cantidad > 0) {
            double promedio = suma / cantidad;
            System.out.printf(Locale.US,
                    "Lecturas: %d Promedio: %.2f Max: %.2f Min: %.2f%n",
                    cantidad, promedio, mayor, menor);
        } else {
            System.out.println("No hubo lecturas, asi que no hay nada que mostrar.");
        }
    }
}
