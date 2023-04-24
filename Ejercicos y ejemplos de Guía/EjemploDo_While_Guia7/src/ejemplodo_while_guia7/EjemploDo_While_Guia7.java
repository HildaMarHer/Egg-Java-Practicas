package ejemplodo_while_guia7;

import java.util.Scanner;
/**
 *
 * @author Hilda MarHer
 */
public class EjemploDo_While_Guia7 {

   public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        String respuesta; 
        
        do {
            
            System.out.println("¿Desea continuar?");
            respuesta = leer.nextLine();
            
        } while (respuesta.equalsIgnoreCase("S"));
    }

}