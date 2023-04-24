
package ejerciio6_guia7;

import java.util.Scanner;

public class Ejerciio6_Guia7 {

    public static void main(String[] args) {
        
        /* if (<condicion1>) {
        <sentencias A>
        } else if (<condicion2>){
        <sentencia B>
        } else {
        <sentencia C>
        }
        
           Ejemplo
  
        int num1 = 5; 
        int num2 = 10; 
        
        if (num1 < num2) {
            
            System.out.println("La variable num1 aloja un número menor a la variable num2");
        } else {
            
            System.out.println("La variable num2 aloja un número mayor a la variable num1");
            }
        }
        }*/
     
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa el primer número");
             
        int num1 = leer.nextInt();
        
        System.out.println("Ingresa el segundo número");
        int num2 = leer.nextInt();
        
        System.out.println("Num1= " + num1);
        System.out.println("Num2= " + num2);
        
        
        if (num1 >  25 && num2 > 25) {
            System.out.println("Ambos numeros son menores a 25");
        } else if (num1 > 25 && num2 < 25){
                    System.out.println("El primer numero ingresado es mayor a 25");
        } else if (num1 <= 25 && num2 > 25){
                    System.out.println("El segundo numero ingresado es mayor a 25");
        } else {
               System.out.println("Ninguno de los numeros que ha ingresado es mayor a 25");
        }
        }  
    }
        
       

