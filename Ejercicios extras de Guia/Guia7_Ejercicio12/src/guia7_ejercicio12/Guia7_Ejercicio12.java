/* Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals(). */


package guia7_ejercicio12;

import java.util.Scanner;

/**
 *
 * @author Hilda MarHer
 */
public class Guia7_Ejercicio12 {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;

        System.out.println("Ingrese las cadenas (máximo de 5 caracteres, empiezan con X y terminan con O):");

        while (true) {
            String cadena = input.nextLine();

            if (cadena.equals("&&&&&")) {
                break;
            } else if (cadena.length() == 5 && cadena.charAt(0) == 'X' && cadena.charAt(4) == 'O') {
                correctas++;
            } else {
                incorrectas++;
            }
        }

        System.out.println("Informe:");
        System.out.println("Lecturas correctas: " + correctas);
        System.out.println("Lecturas incorrectas: " + incorrectas);
    }
}