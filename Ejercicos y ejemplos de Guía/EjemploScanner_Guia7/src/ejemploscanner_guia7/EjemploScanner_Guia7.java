
package ejemploscanner_guia7;
import java.util.Scanner; 


public class EjemploScanner_Guia7 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Con esta clase guardamos valores ingresados por consola en las variables");
        System.out.println("Ingresa tu nombre");
        String nombre = leer.nextLine();
        
        System.out.println("Ingresa tu edad");
        int edad = leer.nextInt();
        
        System.out.println("Tu nombre es: " + nombre) ;
        System.out.println("Tienes una de edad de:  " + edad);
        
    }
    
}
