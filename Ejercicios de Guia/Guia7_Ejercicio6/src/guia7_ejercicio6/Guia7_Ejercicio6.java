/* Crear un programa que dado un numero determine si es par o impar. */
package guia7_ejercicio6;

import java.util.Scanner;

/**
 *
 * Author Hilda MarHer GitHub: https://github.com/HildaMarHer/
 *
 */
public class Guia7_Ejercicio6 {

    public static void main(String[] args) {
        System.out.println("Crear un programa que dado un numero determine si es par o impar.\n");

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int num = leer.nextInt();
        
        //El operador módulo %, se utiliza para obtener el resto ed una división entre dos números. 
        
        if (num % 2 == 0) {
            System.out.println(num + " es par");
        } else {
            System.out.println(num + " es impar");
        }
    }
}
