/*
* Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra
* moneda, estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y la
* moneda a converir que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
*El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package ejercio14_victor;

import java.util.Scanner;

/**
 *
 * @author Hilda MarHer
 */
public class Ejercio14_victor {

   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int euros;
        int opcion1;

        // Ingrese cantidad de euros
        System.out.println("Ingrese la cantidad de euros que desea convertir: ");
        euros = sc.nextInt();
        sc.nextLine(); // limpiamos el buffer

        // Menu para elegir tipo de divisa al que quieres convertir
        System.out.println("Elige la opción la divisa a la que quieres hacer la conversión:");
        System.out.println("1. Libras");
        System.out.println("2. Dolares");
        System.out.println("3. Yenes");
        opcion1 = sc.nextInt();

        // Subprograma para realizar las operaciones funciones o procedimientos
        convertirDivisa(euros, opcion1);
        sc.close();
    }p

    private static void convertirDivisa(int euros, int opcion1) {
        double resultado = 0;

        switch((int)opcion1) {
            case 1:
                resultado = euros * 0.86;
                System.out.println(euros + " euros equivalen a " + resultado + " Libras");
                break;

            case 2:
                resultado = euros * 1.28611;
                System.out.println(euros + " euros equivalen a " + resultado + " Dolares");
                break;

            case 3:
                resultado = euros * 129.852;
                System.out.println(euros + " euros equivalen a " + resultado + " Yenes");
                break;

            default:
                System.out.println("Opción inválida. Saliste del programa");
        }
    }
}