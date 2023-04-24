/*
 * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
 * al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
 * numero y si se encuentra repetido
 */
package guia7_ejercicio16;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Hilda Martinez
 */
public class Guia7_Ejercicio16 {

    public static void main(String[] args) {
        System.out.println("Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida\n"
                + "al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el\n"
                + "numero y si se encuentra repetido");
        Scanner vector = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del vector: ");
        int n = vector.nextInt();

        int[] numeros = new int[n];

        //Radom se utiliza para rellenar el vector con valores aleatorios
        Random r = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = r.nextInt(100) + 1;
        }

        System.out.println("¿Qué número vas a buscar?");
        System.out.println("Ingresa el número a buscar: ");
        int num = vector.nextInt();
      
        boolean encontrado = false;
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == num) {
                encontrado = true;
                contador++;
                
                System.out.println("El número " + num + " se encuentra en la posición " + i + " del vector.");
            }
        }
        if (!encontrado) {
            System.out.println("El número " + num + " no se encuentra en el vector.");
        } else {
            if (contador > 1) {
                System.out.println("El número " + num + " está repetido " + contador + " veces en el vector.");
            } else {
                System.out.println("El número " + num + " no está repetido en el vector.");
            }
        }
    }
}