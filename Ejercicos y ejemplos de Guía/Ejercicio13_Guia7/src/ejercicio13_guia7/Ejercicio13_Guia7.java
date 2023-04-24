/** Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y define su tipo de dato de tal manera que te permita alojar sus nombres más adelante. 
 
 Ejercicio 14: Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo */ 

package ejercicio13_guia7;

import java.util.Scanner;
import static javafx.scene.input.KeyCode.S;

/**
 *
 * @author Hilda MarHer
 */
public class Ejercicio13_Guia7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de integrantes del equipo: ");
        int cantidadCompaneros = input.nextInt();

        String[] Equipo = new String[cantidadCompaneros];

        for (int i = 0; i < cantidadCompaneros; i++) {
            System.out.println("Ingrese el nombre del integrante de equipo núm: " + (i + 1));
            Equipo[i] = input.next();

        } // Alojar el vector de Equipo usando for: 
        System.out.println("Los nombres de los integrantes de equipo son: ");
        for (int i = 0; i < cantidadCompaneros; i++) {
            System.out.println(Equipo[i]);
        }

        
        /* segunda manera de leer el nombre de los integrantes 
       for (int i = 0; i < Equipo.length; i++) {
             System.out.println(Equipo[i]);
         }*/
        
        /**Java si podemos devolver un vector o una matriz en una función para
usarla en otro momento. Lo que hacemos es poner como tipo de dato de la función, el tipo de dato que tendra el vector y asi poder devolverlo.*/
        
        
        
        
    }

}
