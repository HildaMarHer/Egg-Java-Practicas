package guia7_ejercicio20;

import java.util.Scanner;

/**
 *
 * @author Hilda Martinez
 */
public class Guia7_Ejercicio20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[] sumas = new int[8]; // Almacenará las sumas de filas, columnas y diagonales

        // Pedir al usuario que ingrese los valores de la matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese el valor de la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Calcular las sumas de filas, columnas y diagonales
        sumas[0] = matriz[0][0] + matriz[0][1] + matriz[0][2]; // Fila 1
        sumas[1] = matriz[1][0] + matriz[1][1] + matriz[1][2]; // Fila 2
        sumas[2] = matriz[2][0] + matriz[2][1] + matriz[2][2]; // Fila 3
        sumas[3] = matriz[0][0] + matriz[1][0] + matriz[2][0]; // Columna 1
        sumas[4] = matriz[0][1] + matriz[1][1] + matriz[2][1]; // Columna 2
        sumas[5] = matriz[0][2] + matriz[1][2] + matriz[2][2]; // Columna 3
        sumas[6] = matriz[0][0] + matriz[1][1] + matriz[2][2]; // Diagonal principal
        sumas[7] = matriz[0][2] + matriz[1][1] + matriz[2][0]; // Diagonal secundaria

        // Mostrar la matriz con las sumas
        System.out.println("Matriz ingresada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("| " + sumas[i] + " |"); // Suma de la fila
        }
        System.out.println(sumas[3] + "\t" + sumas[4] + "\t" + sumas[5] + "\t| " + sumas[6] + " |"); // Suma de las columnas
        System.out.println(sumas[7] + "\t\t\t| " + sumas[2] + " |"); // Suma de las diagonales

        // Comprobar si es un cuadrado mágico
        boolean esMagico = true;
        for (int i = 0; i < sumas.length - 1; i++) {
            if (sumas[i] != sumas[i + 1]) {
                esMagico = false;
                break;
            }
        }
        if (esMagico) {
            System.out.println("El cuadrado es mágico");
        } else {
            System.out.println("El cuadrado no es mágico");
        }
    }
}
