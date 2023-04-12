/** Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
 * pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
 * investigar la función equals() en Java. */
package guia7_ejercicio7;

import java.util.Scanner;

/**
 * Author Hilda MarHer GitHub: https://github.com/HildaMarHer/
 *
 */
public class Guia7_Ejercicio7 {

    public static void main(String[] args) {

        System.out.println("Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa\n"
                + "pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.\n");
       
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingresa una frase: ");
        String frase = leer.nextLine();
        
        if (frase.equalsIgnoreCase("eureka")) { 
            
            /* Se utiliza para realizar una comparación sí dos objetos son iguales. Si los ojetos no son del mismo tipo, 
            entonces no se pueden comparar y se devuelve 'false´. Al agregarle a la palabra reservada 
            el IgnoreCase es indistinto si escribes mayuscula o minuscula.*/
            
            System.out.println("Correcto, me encontraste!");
        } else {
        
            System.out.println("Incorrecto, más suerte para la próxima");
               
        }
        
        leer.close ( );    //se utiliza para cerrar el Scanner  
                
    }

}
