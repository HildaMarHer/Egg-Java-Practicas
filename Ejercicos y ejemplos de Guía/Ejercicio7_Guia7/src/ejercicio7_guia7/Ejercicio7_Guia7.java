
package ejercicio7_guia7;

import java.util.Scanner;

/**
 *
 * @author hherl
 */
public class Ejercicio7_Guia7 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in); 
        System.out.println("Seleccione el tipo de bomba a utilizar de acuerdo al fluido que va a mover:");
        System.out.println("");
        
        //Menú de opciones
        System.out.println("1. Bomba para agua");
        System.out.println("2. Bomba para gasolina");
        System.out.println("3. Bomba para hormigón");
        System.out.println("4. Bomba para pasta alimneticia");
        System.out.println("");
        System.out.print("Ingrese una opción: ");
                 
        int tipoMotor = leer.nextInt();
        
            if (tipoMotor != 1 && tipoMotor != 4) {     
            switch (tipoMotor) {
                case 1: 
                    System.out.println("La bomba es una bomba de agua");
                    break; 
                case 2: 
                    System.out.println("La bomba es una bomba de gasolina");
                    break;
                case 3: 
                    System.out.println("La bomba es una bomba de hormigón");
                    break;
                case 4: 
                    System.out.println("La bomba es una bomba de pasta alimenticia"); 
                    break;
                default: 
                    System.out.println("No existe un valor válido para tipo de bomba. " + "Debes seleccionar un número del 1 al 4"); 
                                      
                    }
        }
    }
    
 }