//5/5/2023

/*
 *
 * HILDA MARHER
 *
 */

import Mate.Matematicas;
import Operacion.Operaciones;
public class main {
    public static void main(String[] args) {
        Matematicas matematicas = new Matematicas ();
        double num1 = Math.random();
        double num2 = Math.random();
        System.out.println("num1= " + num1 + "\nnum2= " + num2);
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