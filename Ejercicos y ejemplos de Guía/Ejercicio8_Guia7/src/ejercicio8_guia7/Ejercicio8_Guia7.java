
package ejercicio8_guia7;

import java.util.Scanner;

/**
 *Escriba un programa que valide si una nota está entre 0 y 10, sino  está entre 0 y 10 se pedirá de nuevo hasta que la nota sea correcta. 
 * @author hherl
 */
public class Ejercicio8_Guia7 {

    /*
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa la calificación obtenida:");

        int nota = leer.nextInt();

        while (nota > 10 || nota < 0) {

            System.out.println("La nota ingresada no es válida.");
            System.out.println("Ingresa una nota comprendida entre 0 y 10.");

            nota = leer.nextInt();

        }
    }
}
*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //int nota ; 

        System.out.println("Ingresa la nota: ");
        int nota = leer.nextInt();
              
        while (0 < nota && nota > 10) {
          
            }

            System.out.println("Nota No valida: " + nota);
            System.out.println("Introduce otra nota: ");
            nota = leer.nextInt();

        }

    }