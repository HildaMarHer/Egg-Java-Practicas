/* Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llevar con un formato
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

        System.out.println("Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de\n"
                + "dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llevar con un formato\n"
                + "fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que\n"
                + "ser X y el último tiene que ser una O.\n"
                + "Las secuencias leídas que respeten el formato se consideran correctas, la secuencia\n"
                + "especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia\n"
                + "distinta de FDE, que no respete el formato se considera incorrecta.\n"
                + "Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas\n"
                + "e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las\n"
                + "siguientes funciones de Java Substring(), Length(), equals(). \n");
        /*
        Utilizando el toUpperCase(); se convierten todas las entradas del usuario a mayúsculas para respetar el formato de cadena. 
        La función substring(); se utiliza para obtener los primeros y últimos caracteres de la cadena. 
        length(); se ocupa para comprobar la longitud de la cadena. 
        equals(); compara las cadenas con las sencuencias, determina si es necesario continuar leyendo o finalizar. 
         */
        Scanner scanner = new Scanner(System.in);
        int correctReads = 0;
        int incorrectReads = 0;
        String input;
        do {
            System.out.println("Ingrese una cadena (o &&&&& para salir e imprimir el reporte): ");
            input = scanner.nextLine().toUpperCase();
            if (input.equals("&&&&&")) {
                continue;
            }
            if (input.length() != 5 || !input.substring(0, 1).equals("X") || !input.substring(4, 5).equals("O")) {
                System.out.println("Cadena inválida.");
                incorrectReads++;
            } else {
                System.out.println("Cadena válida.");
                correctReads++;
            }
        } while (!input.equals("&&&&&"));
        System.out.println("Informe:");
        System.out.println("=============================================");
        System.out.println("Lecturas correctas: " + correctReads);
        System.out.println("Lecturas incorrectas: " + incorrectReads);
        System.out.println("=============================================");
    }
}
