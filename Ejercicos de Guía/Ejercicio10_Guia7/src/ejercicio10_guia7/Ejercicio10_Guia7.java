package ejercicio10_guia7;

/* Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número ingresado seguido de tantos asteriscos como indique su valor. 
Poe ejemplo: 

5 *****
3 ***
1 *
11 ***********
2 **
 */

import java.util.Scanner;

public class Ejercicio10_Guia7 {

    /**
     * @param args @author Hilda_ MarHer
     */
    
       public static void main(String[] args) {
           
      Scanner input = new Scanner(System.in);

        int[ ] numbers = new int[4];

        // Leer los cuatro números
          for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese un número entre 1 y 20: ");
            int number = input.nextInt();
            if (number >= 1 && number <= 20) {
                numbers[i] = number;
            } else {
                System.out.println("El número debe estar entre 1 y 20.");
                i--;
            }
        }

        // Imprimir el número y los asteriscos
        for (int i = 0; i < 4; i++) {
            System.out.print(numbers[i] + ": ");
            for (int j = 0; j < numbers[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
       }
}

 
 /*  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[4];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Ingrese un número entre 1 y 20: ");
            numbers[i] = input.nextInt();
            while (numbers[i] < 1 || numbers[i] > 20) {
                System.out.print("Número fuera de rango, ingrese nuevamente: ");
                numbers[i] = input.nextInt();
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ": ");
            for (int j = 0; j < numbers[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **       
package ejerciciobuclefor;

import java.util.Scanner;

public class EjercicioBucleFor {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;

        for (int i = 0; i < 4; i++) {
            System.out.println("");
            do {
                System.out.print("Ingresa un número: ");
                num = leer.nextInt();

            } while (num > 20 || num < 0);

            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }

        }
        System.out.println("");

    }
}
*/

/*public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa 4 números enteros, uno por uno,"
                + "que estén dentro del rango de 1 a 20:");

        int n1 = leer.nextInt();
        while (n1 < 1 || n1 > 20) {
            System.out.println("El número ingresado está fuera del rango.");
            System.out.println("Ingresa otro:");
            n1 = leer.nextInt();
        }
        
        int n2 = leer.nextInt();
        while (n2 < 1 || n2 > 20) {
            System.out.println("El número ingresado está fuera del rango.");
            System.out.println("Ingresa otro:");
            n2 = leer.nextInt();
        }
        
        int n3 = leer.nextInt();
        while (n3 < 1 || n3 > 20) {
            System.out.println("El número ingresado está fuera del rango.");
            System.out.println("Ingresa otro:");
            n3 = leer.nextInt();
        }
        
        int n4 = leer.nextInt();
        while (n4 < 1 || n4 > 20) {
            System.out.println("El número ingresado está fuera del rango.");
            System.out.println("Ingresa otro:");
            n4 = leer.nextInt();
        }
        
        for (int i = 1; i <= 4; i++) {
            
            switch (i){
                case 1:
                    System.out.print(n1 + " ");
                    for (int j = 1; j <= n1; j++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                    break;
                    
                case 2:
                    System.out.print(n2 + " ");
                    for (int k = 1; k <= n2; k++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                    break;
                    
                case 3:
                    System.out.print(n3 + " ");
                    for (int l = 1; l <= n3; l++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                    break;
                    
                case 4:
                    System.out.print(n4 + " ");
                    for (int m = 1; m <= n4; m++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                    break;
            }
            
        }

    }
*/