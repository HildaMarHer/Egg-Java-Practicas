/*
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
 * traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
 * obtiene cambiando sus filas por columnas (o viceversa).
 */
package guia7_ejercicio18;

import java.util.Random;

/**
 *
 * @author Hilda Martinez
 * @GitHub https://github.com/HildaMarHer
 *
 */
public class Guia7_Ejercicio18 {

    public static void main(String[] args) {
        System.out.println("""
                           Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
                            traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
                            obtiene cambiando sus filas por columnas (o viceversa)""");
        int[][] matriz = new int[4][4];
        Random random = new Random();
        
        System.out.println();

// Creación de   la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10);
            }

        }

                
        // Matriz original 
        System.out.println("Original");
            System.out.println();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Calcular la traspuesta 
                
        int[][] traspuesta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }
        
            System.out.println();
        
        // Imprimir la matriz traspuesta 
        
        System.out.println("Matriz traspuesta:");
            System.out.println();

        for (int i = 0; i < traspuesta.length; i++) {
            for (int j = 0; j < traspuesta[i].length; j++) {
                System.out.print(traspuesta[i][j] + " ");
            }
            System.out.println (); 
        }
        
    }

}

