
package ejercicio8_guia7;

import java.util.Scanner;

/**
 *Escriba un programa que valide si una nota está entre 0 y 10, sino  está entre 0 y 10 se pedirá de nuevo hasta que la nota sea correcta. 
 * @author hherl
 */
public class Ejercicio8_Guia7 {

    public static void main(String[] args) {
         
    Scanner leer = new Scanner(System.in);
        System.out.println("Introduce tu nota para saber si es un número válido:");
      
    int nota = leer.nextInt();
           while (0 <= nota && nota >= 11) {
            
            System.out.println("Tu nota NO es válida." + "Tu nota es: "+ nota);
            System.out.println("Introducir otra nota");
         
            nota = leer.nextInt();        
          
          
        }
    }
    
}
