//5/5/2023

/*
 *
 * HILDA MARHER
 *
 */

import Mate.Matematicas;
import Operacion.Operaciones;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Matematicas matematicas = new Matematicas ();
        Scanner nu1 = new Scanner(System.in);
        Scanner nu2 = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double num1 = nu1.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = nu2.nextDouble();

        matematicas.setNum1(num1);
        matematicas.setNum2(num2);
        Operaciones operaciones = new Operaciones(matematicas);
        double mayor = operaciones.devolverMayor();
        System.out.println("El número mayor es: " + mayor);
        double potencia = operaciones.calcularPotencia();
        System.out.println("La potencia del mayor elevado al menor es: " + potencia);
        double raiz = operaciones.calcularRaiz();
        System.out.println("La raíz cuadrada del menor es: " + raiz);
}
}