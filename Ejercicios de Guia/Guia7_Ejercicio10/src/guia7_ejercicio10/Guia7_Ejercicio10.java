/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
 */
package guia7_ejercicio10;

import java.util.Scanner;

/**
 * Nombre del archivo: Guia7_Ejercicio10 Author Hilda MarHer GitHub: https://github.com/HildaMarHer/
 *
 * Fecha de creación: DD/MM/AAAA
 *
 */
public class Guia7_Ejercicio10 {

    public static void main(String[] args) {
        System.out.println("Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación\n"
                + "solicite números al usuario hasta que la suma de los números introducidos supere el\n"
                + "límite inicial.\n");
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese un valor límite positivo: ");
        int limite = entrada.nextInt();
        int suma = 0;
        int numero;

        while (suma <= limite) {
            System.out.print("Ingrese un número: ");
            numero = entrada.nextInt();
            suma += numero;
        }

        System.out.println("La suma de los números introducidos es " + suma + " y ha superado el límite de " + limite);
    }
}

