package ejercicio9_guia7;

import java.util.Scanner;

/**
 *
 * @author Hilda MarHer
 */
public class Ejercicio9_Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Ingrese un número entero positvo");
            num = leer.nextInt();
            if (num > 20) {
                System.out.println("Este programa podría tardar, ¿está seguro? (s/n)");
                String confirma = leer.next();
                if (confirma.equalsIgnoreCase("s")) {
                    break;  //detiene el bucle y continua con el próximo bloque
                }
            }
        } while (num <= 0 || num > 20);
        /* for (<inicialización); <expresión_ terminación> <paso/incremento/decremento>) {
        }*/

        int j, suma;
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                continue; //detiene la iteración actual y salta a la siguiente
            }
            suma = 0;
            j = 1;
            while (j <= i) {
                suma += j;
                j++;

            }
            System.out.println("La suma de los " + i + " números naturales es: " + suma);
        }

    }

}
