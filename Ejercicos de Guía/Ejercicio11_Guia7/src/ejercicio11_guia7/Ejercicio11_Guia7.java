/*Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios. */

package ejercicio11_guia7;

import java.util.Scanner;

/**
 *
 * @author Hilda MarHer
 */
public class Ejercicio11_Guia7 {

    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);

        // Definimos la tabla de reemplazo
        char[] vowels = {'á', 'é', 'í', 'ó', 'ú'};
        char[] vowels2={'A', 'E', 'I', 'O', 'U'};
        char[] replacements = {'@', '#', '$', '%', '*'};
        
       if (String.valueOf(vowels).equalsIgnoreCase(String.valueOf(vowels2))) {
          
        }

        // Leemos la secuencia de caracteres
        System.out.println("Ingrese una secuencia de caracteres (terminada en punto): ");
        String sequence = input.nextLine();

        // Quitamos el punto del final
        sequence = sequence.substring(0, sequence.length() - 1);

        // Procesamos la secuencia de caracteres
        // StringBuilder se puede usar para modificar una cadena sin crear un objeto. Por ejemplo, el uso de la clase de StringBuilder puede mejorar el rendimiento al concatenar varias cadenas en un bucle .
        StringBuilder encodedSequence = new StringBuilder();
        for (int i = 0; i < sequence.length(); i++) {
            char currentChar = sequence.charAt(i);
            boolean isVowel = false;
            

            // Verificamos si el caracter actual es una vocal
            for (int j = 0; j < vowels.length; j++) {
                if (Character.toLowerCase(currentChar) == vowels[j]) {
                    encodedSequence.append(replacements[j]);
                    isVowel = true;
                    break;
                    
                }
            }

            // Si no es una vocal, lo agregamos tal cual
            if (!isVowel) {
                encodedSequence.append(currentChar);
            }
        }

        // Imprimimos la secuencia codificada
        System.out.println("Secuencia codificada: ");
        System.out.println(encodedSequence.toString());
        //El método toString() en Java, como su propio nombre indica, se utiliza para convertir a String (es decir, a una cadena de texto) cualquier objeto Java.
    }
}

   /* 
    public static void main(String[] args) {
        // Definir tabla de codificación
        String[][] codificacion = {
            {"a", "@"},
            {"á", "@"},
            {"e", "#"},
            {"é", "#"},
            {"i", "$"},
            {"í", "$"},
            {"o", "%"},
            {"ó", "%"},
            {"u", "*"},
            {"ú", "*"}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una secuencia de caracteres: ");
        String secuencia = scanner.nextLine();

        StringBuilder codificada = new StringBuilder();
        for (int i = 0; i < secuencia.length(); i++) {
            String caracter = secuencia.substring(i, i + 1);
            boolean encontrado = false;
            for (int j = 0; j < codificacion.length; j++) {
                if (caracter.equalsIgnoreCase(codificacion[j][0])) {
                    codificada.append(codificacion[j][1]);
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                codificada.append(caracter);
            }
        }

        // Imprimir secuencia codificada
        System.out.println("Secuencia codificada: " + codificada);
    }
}
*/