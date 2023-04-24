/**Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del segundo, sino informe que no lo son.*/

package ejercicio12_guia7;

import java.util.Scanner;

/**
 *
 * @author Hilda MarHer
 */
public class Ejercicio12_Guia7 {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número: ");
        int num1 = input.nextInt(); 
        
        System.out.println("Ingrese el primer número: ");
        int num2 = input.nextInt(); 
        
        EsMultiplo(num1, num2); 
                   
    }

    private static void EsMultiplo(int num1, int num2) {
        
        if (num1 % num2 == 0){
            System.out.println(num1 + " es múltiplo de " + num2);
        } else {
            System.out.println(num1 +  " no es múltiplo de " + num2);
        }
      
    }
}
