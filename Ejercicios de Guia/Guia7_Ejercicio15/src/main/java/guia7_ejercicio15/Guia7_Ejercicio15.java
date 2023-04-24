/*
 * Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
 * muestre por pantalla en orden descendente.
 */
package guia7_ejercicio15;

/**
 *
 * @author Hilda Martinez
 * @GitHub https://github.com/HildaMarHer
 *
 */
public class Guia7_Ejercicio15 {

    public static void main(String[] args) {
        System.out.println ("Realizar un algoritmo que rellene un vector con los 100 primeros 100 primeros números enteros y los muestre por pantalla en orden descendente.!");
        int[] numeros = new int[100];
        
       // Rellenar el vector con los 100 primeros números enteros
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        // Mostrar el vector en orden descendente
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}