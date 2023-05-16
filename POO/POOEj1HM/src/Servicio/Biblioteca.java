/*

 */

package Servicio;

import java.util.Scanner;

import Biblioteca.Libro;
/*
 * POOEj1HM
 * Hilda MarHer, Date: 12/5/2023
 */

public class Biblioteca {

    public static void main (String[] args) {

        Scanner read = new Scanner(System.in);
        Libro dato1 = new Libro();
        //se ocupa para hacer una validación de caracteres.
        boolean validISBN = false;
        while (!validISBN) {
            System.out.println("Ingresa el ISBN (debe tener 13 caracteres)");
            String isbn = read.nextLine();
            if (isbn.length() == 13) {
                dato1.setISBN(Integer.parseInt(isbn));
                validISBN = true;
            } else {
                System.out.println("El ISBN debe tener 13 caracteres, intenta de nuevo.");
            }
        }

        System.out.println("Ingrese el nombre del libro");
        dato1.setTitulo(read.nextLine());

        System.out.println("Ingrese el nombre del autor");
        dato1.setAutor(read.nextLine());

        System.out.println("Ingrese el número de paginas");
        dato1.setNumeroDePaginas(read.nextInt());
        read.nextLine();

        System.out.println("El libro ingresado es: " + dato1.toString());
    }
}