/* Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:*/

package guia7_ejercicio11;

import java.util.Scanner; 

/**
 *
 * @author Hilda MarHer
 */
public class Guia7_Ejercicio11 {

    public static void main(String[] args) {
       
Scanner leer = new Scanner(System.in);

        System.out.println("Realizar un programa que pida dos números enteros positivos por teclado y muestre por\n" +
"pantalla el siguiente menú:\n");
        System.out.print("Ingrese dos numeros enteros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        boolean salir = false;
        boolean error = false;
        int resp = 0;
        String resp2; 
        do {
            System.out.println("Menu");
            System.out.println("1-Sumar");
            System.out.println("2-Restar");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            System.out.println("5-Salir");
            System.out.println("Elija una opción:");
            resp = leer.nextInt();
            
            switch (resp) {
                case 1:
                    int suma = num1 + num2;
                    System.out.println("La suma de los numeros ingresados es de " + suma);
                    break;
                case 2:
                    int resta = num1 - num2;
                    System.out.println("La resta de los numeros ingresados es de " + resta);
                    break;
                case 3:
                    int multip = num1 * num2;
                    System.out.println("La multiplicación de los numeros ingresados es de " + multip);
                    break;
                case 4:
                    double div = num1 / num2;
                    System.out.println("La división de los numeros ingresados es de " + div);
                    break;
                case 5:
                    leer.nextLine();
                    do {
                        System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                        resp2 = leer.nextLine();
                        resp2 = resp2.toUpperCase();
                        switch (resp2) {
                            case "S":
                                System.out.println("Hasta la proxima");
                                salir = true;
                                break;
                            case "N":
                                error = true; 
                                break;
                            default:
                                System.out.println("Ingreso una opción incorrecta");
                                error = true; 
                        }
                    } while (error);
                    break; 
                default: 
                    System.out.println("Ingreso una opción incorrecta");
            }
        } while (!salir);
    }
}