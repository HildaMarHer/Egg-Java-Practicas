package remplazo;

import java.util.Scanner;

/**
 *
 * @author Hilda MarHer
 */
public class Remplazo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una cadena de caracteres terminada en punto:");
        String cadena = entrada.nextLine();

        String cadenaCodificada = codificarVocales(cadena);
        System.out.println("Cadena codificada: " + cadenaCodificada);
    }

    public static String codificarVocales(String cadena) {
        String cadenaCodificada = "";
        char[] arregloCadena = cadena.toCharArray();

        for (char caracter : arregloCadena) {
            switch (caracter) {
                case 'a':
                    cadenaCodificada += "@";
                    break;
                case 'e':
                    cadenaCodificada += "#";
                    break;
                case 'i':
                    cadenaCodificada += "$";
                    break;
                case 'o':
                    cadenaCodificada += "%";
                    break;
                case 'u':
                    cadenaCodificada += "*";
                    break;
                case 'á':
                    cadenaCodificada += "@";
                    break;
                case 'é':
                    cadenaCodificada += "#";
                    break;
                case 'í':
                    cadenaCodificada += "$";
                    break;
                case 'ó':
                    cadenaCodificada += "%";
                    break;
                case 'ú':
                    cadenaCodificada += "*";
                    break;
                default:
                    cadenaCodificada += caracter;
                    break;
            }
        }

        return cadenaCodificada;
    }
}
