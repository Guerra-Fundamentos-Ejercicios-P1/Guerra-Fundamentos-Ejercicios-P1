/*
 * Nombre: Andres Guerra
 * NRC: 37712
 * Fecha: 29 de octubre de 2026
 * Ejercicio 1: Mostrar la tabla de multiplicar del 1 al 10 en 10 filas
 *              y 10 columnas, con los numeros bien alineados.
 */
public class Guerra_Andres_TablaMultiplicar {

    public static void main(String[] args) {

        // Cada vuelta de este ciclo es una fila de la tabla
        for (int fila = 1; fila <= 10; fila++) {

            // Cada vuelta de este ciclo es una columna de esa fila
            for (int columna = 1; columna <= 10; columna++) {
                // %4d deja 4 espacios para cada numero y asi quedan alineados
                System.out.printf("%4d", fila * columna);
            }

            // Cuando termina la fila, bajamos a la siguiente linea
            System.out.println();
        }
    }
}
