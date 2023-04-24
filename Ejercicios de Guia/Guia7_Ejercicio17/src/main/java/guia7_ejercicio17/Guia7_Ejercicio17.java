/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package guia7_ejercicio17;

import java.util.Scanner;

/**
 *
 * @author Hilda Martinez
 */
public class Guia7_Ejercicio17 {

        public static void main(String[] args) {
            
            // Pedir al usuario el tamaño del vector
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese el tamaño del vector: ");
            int n = sc.nextInt();

            // Declaración e inicialización del vector de tamaño n
            int[] numeros = new int[n];

            // Pedir al usuario los valores para el vector
            System.out.println("Ingrese los valores del vector:");
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = sc.nextInt();
            }

            // Declaración e inicialización de los contadores
            int[] digitos = new int[6];

            // Recorrer el vector y contar los números de 1 a 5 dígitos
            for (int i = 0; i < numeros.length; i++) {
                int num = numeros[i];
                int contador = 0;
                while (num != 0) {
                    num /= 10;
                    contador++;
                }
                digitos[contador]++;
            }

            // Mostrar los resultados
            System.out.println("Resultados:");
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hay " + digitos[i] + " números de " + i + " dígito(s).");
            }
        }
    }


