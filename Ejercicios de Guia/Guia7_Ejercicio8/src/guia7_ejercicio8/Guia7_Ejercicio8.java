/** Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si
 * el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
 * por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
 * “INCORRECTO”. Nota: investigar la función Lenght() en Java. */
package guia7_ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Hilda MarHer
 */
public class Guia7_Ejercicio8 {

    public static void main(String[] args) {
        Scanner frase = new Scanner(System.in);

        System.out.println("Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si\n"
                + "el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje\n"
                + "por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir\n"
                + "“INCORRECTO”.\n");

        System.out.println("Ingresa una frase o palabra de 8 cáracteres: ");
        String input = frase.nextLine();

        if (input.length() == 8) {
            System.out.println("CORRECTO " + input);
        } else {
            System.out.println("INCORRECTO " + input);

            frase.close();
        }

    }
}
