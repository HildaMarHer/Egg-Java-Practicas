/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
package guia7_ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Hilda MarHer
 */
public class Guia7_Ejercicio4 {

    public static void main(String[] args) {

        int F;
        Scanner leer = new Scanner(System.in);
        System.out.println("Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados\n"
                + "Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).\n");

        System.out.println("¿Cuantos grados centígrados deseas convertir a grados Fahrenheit? ");
        int grados = leer.nextInt();
        
        System.out.println(grados + "°C" + " = " + (F = 32 + (9 * grados / 5))+ "°F");
    }
}