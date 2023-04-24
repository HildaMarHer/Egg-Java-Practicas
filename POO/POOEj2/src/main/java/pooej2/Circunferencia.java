package pooej2;

import java.util.Scanner;

/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c.) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
/**
 *
 * @author Hilda MarHer <hherlindo@gmail.com>
 * @GitHub https://github.com/HildaMarHer
 *
 */
//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 
public class Circunferencia {

    //a) Método constructor que inicialice el radio pasado como parámetro.
    private double radio;

    //Método vacio
    public Circunferencia() {
    }

    //b) Métodos get y set para el atributo radio de la clase Circunferencia.
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getradio() {
        return radio;
    }

    public void setradio(double radio) {
        this.radio = radio;
    }

    /*
    c.) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
     */
    public void crearCircunferencia() {
        Scanner objeto = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia: ");
        radio = objeto.nextDouble();

    }

    //d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
    public double area() {
        double area = Math.PI * Math.pow(radio, 2);
        return area;

    }
//e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).

    public double perimetro() {
        double perimetro = 2 * Math.PI * radio;
        return perimetro;

    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
}
