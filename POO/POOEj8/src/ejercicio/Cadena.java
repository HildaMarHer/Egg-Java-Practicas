/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package ejercicio;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class Cadena{
    private String frase;
    private int longitud;

    public Cadena() {
        this.frase = "";
        this.longitud = 0;
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length ( );
    }
    public int mostrarVocales() {
        int contador = 0;
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U',
                'á', 'é', 'í', 'ó', 'ú', 'Á', 'É', 'Í', 'Ó', 'Ú', '\u00E4', '\u00EB', '\u00EF', '\u00F6', '\u00FC',
                '\u00C4', '\u00CB', '\u00CF', '\u00D6', '\u00DC'));
        for (int i = 0; i < this.frase.length(); i++) {
            char c = this.frase.charAt(i);
            if (vowels.contains(c)) {
                contador++;
            }
        }
        return contador;
    }

    public String invertirFrase() {
        String fraseInvertida = "";
        for (int i = this.frase.length() -1; i >= 0; i--) {
            fraseInvertida += this.frase.charAt(i);
        }
        return fraseInvertida;
    }


    public int vecesRepetido(char letra){
        int contador = 0;
        for (int i = 0; i < this.frase.length(); i++) {
            if (this.frase.charAt(i) == letra){
                contador++;
            }
        }
        return contador;
    }

    public int compararLongitud(String otraFrase){
        return Integer.compare(this.longitud, otraFrase.length());
    }

    public String unirFrase(String nuevaFrase){
        return this.frase + " " + nuevaFrase;
    }

    public String reemplazar(char letra) {
        return frase.replace('a', letra);
    }

    public boolean contiene(char letra){
        return this.frase.indexOf(letra) != -1;
    }

    public String unirFrases(String otraFrase) {
        return this.frase + " " + otraFrase;
    }
}