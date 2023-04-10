/* Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo*/

package ejercicio14_guia7;

import java.util.Scanner;

/**
 *
 * @author Hilda MarHer
 */
public class Ejercicio14_Guia7 {

    public static void main(String[] args) {
        // Creamos un array vacío llamado "Equipo"
        String[] Equipo = new String[5];

        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);

        System.out.println("¿Cuantos integrantes tiene el equipo?");
        int numIntegrantes = input.nextInt();
        
        System.out.println("Este equipo cuenta con: " + numIntegrantes + "integrantes");
        // Utilizamos un bucle for para solicitar los nombres de nuestros compañeros de equipo y agregarlos al array "Equipo"
        for (int i = 0; i < Equipo.length; i++) {
            System.out.print("Ingrese el nombre del compañero " + (i+1) + ": ");
            Equipo[i] = input.nextLine();
        }

        // Imprimimos el array "Equipo" para verificar que los nombres se han agregado correctamente
        for (int i = 0; i < Equipo.length; i++) {
            System.out.println(Equipo[i]);
        }
    }
}