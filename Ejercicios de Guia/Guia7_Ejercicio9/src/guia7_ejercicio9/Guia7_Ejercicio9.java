/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
investigar la función Substring y equals() de Java.
 */
package guia7_ejercicio9;

import java.util.Scanner;

/**
 * Nombre del archivo: Guia7_Ejercicio9 Author Hilda MarHer GitHub: https://github.com/HildaMarHer/
 *
 * Fecha de creación: DD/MM/AAAA
 *
 */
public class Guia7_Ejercicio9 {

    public static void main(String[] args) {
        System.out.println("Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase\n"
                + "es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla\n"
                + "que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. \n");

        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe una frase o palabra: ");
        String input = leer.nextLine();
        
        if (input.substring(0, 1).equals("A")) {
        /* La función substring() se utiliza para extraer una porción de una cadena de texto
        * Sinaxis: String subcadena(starIndex, endIndex); 
            Es importante recordar que los indices en java inician en 0.
        * equals(); se usa para saber si dos onjetos son del mismo tipo y tienen los mismos datos. 
        * Nos dará el valor true si son iguales y false si no. 
        */
            System.out.println("Correcto " + input);

        } else {
            System.out.println("INCORRECTO " + input);
        }

    }

}
