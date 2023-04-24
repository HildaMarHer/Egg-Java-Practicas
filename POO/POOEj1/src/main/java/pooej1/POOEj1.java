
package pooej1;

import java.util.Scanner;

/**
 * 
 * @author Hilda MarHer <hherlindo@gmail.com>
 * @GitHub https://github.com/HildaMarHer
 *
 */

public class POOEj1 {

    public static void main(String[] args) {
     
     Scanner datos = new Scanner(System.in);   
    Libro Libro1 = new Libro(); 
    // Libro Libro2 = new Libro(123456, "El principito", "Antoine Exuspery",96 );
    // System.out.println(Libro1.ISBN);
        System.out.println("Ingrese el ISBN");
        Libro1.setISBN(datos.nextInt());
        datos.nextLine();
        System.out.println("Ingrese título");
        Libro1.setTitulo(datos.nextLine());
        System.out.println("Ingrese autor");
        Libro1.setAutor(datos.nextLine());
        System.out.println("Ingrese Nro de páginas");
        Libro1.setNroPaginas(datos.nextInt());
        
        System.out.println(Libro1.toString());
     //System.out.println(Libro1.getISBN() );
    // System.out.println(Libro2.getISBN() );
           
    }
    
}
