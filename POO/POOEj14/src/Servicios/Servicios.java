/*

 */

package Servicios;

/*
 * POOEj14
 * Hilda MarHer, Date: 16/5/2023
 */

import Entidad.Movil;
import java.util.Scanner;

public class Servicios {

    public void cargarCelular() {
        Scanner infoCel = new Scanner(System.in);

        System.out.println("Ingrese la marca del celular:");
        String marca = infoCel.nextLine();

        System.out.println("Ingrese el precio del celular:");
        double precio = infoCel.nextDouble();
        infoCel.nextLine();

        System.out.println("Ingrese el modelo del celular:");
        String modelo = infoCel.nextLine();

        System.out.println("Ingrese la memoria RAM del celular:");
        int memoriaRam = infoCel.nextInt();

        System.out.println("Ingrese el almacenamiento del celular:");
        int almacenamiento = infoCel.nextInt();

        int[] codigo = ingresarCodigo();

        Movil celular = new Movil(marca, precio, modelo, memoriaRam, almacenamiento, codigo);
    }
    public int[] ingresarCodigo() {
        Scanner infocodigo = new Scanner(System.in);
        int[] codigo = new int[7];

        System.out.println("Ingrese el código de siete números del celular:");

        for (int i = 0; i < 7; i++) {
            System.out.printf("Ingrese el número %d: ", (i + 1));
            codigo[i] = infocodigo.nextInt();
        }

        return codigo;
    }
}