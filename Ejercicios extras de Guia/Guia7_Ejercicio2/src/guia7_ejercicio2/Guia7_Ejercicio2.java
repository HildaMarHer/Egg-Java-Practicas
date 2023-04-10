/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.*/

package guia7_ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Hilda MarHer
 */
public class Guia7_Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por\n" +
"pantalla.");
        System.out.println("Ingresa tu nombre");
        String nombre = leer.nextLine(); 
        
        System.out.println("Tu nombre es: " + nombre);
       
    }

}