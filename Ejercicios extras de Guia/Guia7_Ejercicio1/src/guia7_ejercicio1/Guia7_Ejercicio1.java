/* Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma*/

package guia7_ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Hilda MarHer
 */
public class Guia7_Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner( System.in);
        System.out.println("Escribir un programa que pida dos números enteros por teclado y calcule la suma de los\n" +
"dos. El programa deberá después mostrar el resultado de la suma\n");
        System.out.println("Ingresa un número entero: ");
        int num1 = leer.nextInt();
        System.out.println("Ingresa otro número entero: ");
        int num2 = leer.nextInt();
        
        System.out.println("La suma de tus números es: ");
        System.out.print(num1 +"+");   System.out.print(num2 + "=");
        System.out.println(num1 + num2);
       
    }

}