package pooej6;

import java.util.Scanner;

/**
 *
 * @author Hilda Martinez
 */
public class POOEj6 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cafetera cafetera = new Cafetera(1000, 500);

        cafetera.mostrarMenu();
        System.out.print("Ingrese el número de la opción elegida: ");
        int opcion = scanner.nextInt();

        cafetera.servirTaza(opcion);
    }
}
}
