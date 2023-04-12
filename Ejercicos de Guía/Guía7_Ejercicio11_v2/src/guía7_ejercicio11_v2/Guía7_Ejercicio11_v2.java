       /*
 Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */

package guía7_ejercicio11_v2;
import java.util.Scanner;
/**
 *
 * @author Hilda MarHer
 */
public class Guía7_Ejercicio11_v2 {

    public static void main(String[] args) {


        Scanner datos = new Scanner(System.in);
        
        String frase;
        int longitud_frase;
        System.out.println("Ingrese una frase (debe finalizar con un punto).");
        do //Ciclo que pide y verifica que la frase finalice en un punto
         {   
             System.out.print("->");
             frase = datos.nextLine();        
        longitud_frase = frase.length();
        
        if(!frase.substring(longitud_frase-1, longitud_frase).equals("."))
                 System.out.println("Debe finalizar con un punto.");
          }while(!frase.substring(longitud_frase-1, longitud_frase).equals("."));
        
        String frase_codificada = codifica_frase(frase); //llama a la función que codifica la frase
        System.out.println(frase_codificada);
        
        System.out.println("Fin");
    }
    
    public static String codifica_frase (String frase)
    {
        int longitud_frase = frase.length();
        String frase_codificada = "";//inicializa la frase como vacía
        String caracter_a_cadena; // variable que guarda la conversión de una letra a una cadena de lungitud 1
        char letra, letra_codificada;
    
        for (int i=0; i< longitud_frase; i++)
        {  
          letra = frase.charAt(i); //guarda el caracter actual de la frase
          letra_codificada = codifica_vocal(letra); //llama a la función que codifica cada vocal
          caracter_a_cadena = String.valueOf(letra_codificada); //convierte cada letra codificada en una cadena de longitud 1
          frase_codificada = frase_codificada.concat(caracter_a_cadena); //adiciona a la frase el último caracter convertido en cadena
          }
          return frase_codificada; //devuelve la frase codificada
        }
    
   public static char codifica_vocal (char letra) {
        
        switch (letra) //Si la letra es una vocal mayúscula o minúscula la reemplaza
             {         //Si no, devuelve la misma letra
            case 'a':
            case 'A':    
               letra = '@';
               break;
            case 'e': 
            case 'E':    
               letra = '#';
               break;
            case 'i':
            case 'I':    
               letra = '$';
               break;
            case 'o':
            case 'O':    
               letra = '%';
               break;
            case 'u':
            case 'U':   
               letra = '*';
               break;
         }
        return letra;
    }
}
