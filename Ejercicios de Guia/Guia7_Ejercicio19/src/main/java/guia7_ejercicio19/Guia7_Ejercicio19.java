package guia7_ejercicio19;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Hilda MarHer
 * @GitHub https://github.com/HildaMarHer
 *
 */
public class Guia7_Ejercicio19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese el número de filas y columnas de la matriz: ");
        int n = input.nextInt();

        // Crear la matriz y rellenarla con números aleatorios
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }

        // Imprimir la matriz original
        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        // Calcular la matriz traspuesta
        int[][] matrizTraspuesta = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizTraspuesta[j][i] = matriz[i][j];
            }
        }

        // Cambiar de signo a la matriz traspuesta
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizTraspuesta[i][j] *= -1;
            }
        }

        // Imprimir la matriz traspuesta cambiada de signo
        System.out.println("Matriz traspuesta cambiada de signo:");
        imprimirMatriz(matrizTraspuesta);

        // Verificar si la matriz original es anti simétrica
        boolean esAntiSimetrica = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != -matrizTraspuesta[i][j]) {
                    esAntiSimetrica = false;
                    break;
                }
            }
            if (!esAntiSimetrica) {
                break;
            }
        }

        // Imprimir el resultado
        if (esAntiSimetrica) {
            System.out.println("La matriz es anti simétrica.");
        } else {
            System.out.println("La matriz no es anti simétrica.");
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}