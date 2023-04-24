/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*       *
*       *
* * * *
 */
package guia7_ejercicio13;

import java.util.Scanner;

/**
 * Nombre del archivo: Guia7_Ejercicio13 Author Hilda MarHer GitHub: https://github.com/HildaMarHer/
 *
 * Fecha de creación: DD/MM/AAAA
 *
 */
public class Guia7_Ejercicio13 {

    public static void main(String[] args) {

        System.out.println("Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el\n"
                + "cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:\n"
                + "* * * *\n"
                + "*     *\n"
                + "*     *\n"
                + "* * * *\n");

        Scanner scanner = new Scanner(System.in);

        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
