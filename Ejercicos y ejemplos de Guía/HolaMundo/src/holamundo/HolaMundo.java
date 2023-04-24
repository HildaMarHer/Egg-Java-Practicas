package holamundo;

import java.util.Scanner;


public class HolaMundo {

    
    public static void main(String[] args) {
        
        /*método: es lo primero que se va a ejecutar. Es igual a una función o
        un procedimiento, sólo que es la manera de nombrer a los subprogramas 
        que se codifican dentro de una clase*/
        //sout tab; escribe en automatico la sintexis de impresión
        
        //String = véctor de cadena
        System.out.println("Intoducción a JAVA");
        System.out.println("Hola Mundo");
        
        //se crea una variable Scanner que se utiliza para leer datos del usuario
        Scanner leer = new Scanner(System.in); 
        //Se crea una variable cadena (String) que se utiliza par aleer datos del usuario
        String nombre; 
        System.out.println("Ingresa tu nombre");
        //leemos el nombre de l apersona en la variable nombre
        nombre = leer.next();
        System.out.println("Hola Mundo! Soy " + nombre + " y estoy programando en Java!");
        
        
        
    }
    
}
