/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package pooej2;

/**
 *
 * @author Hilda MarHer <hherlindo@gmail.com>
 * @GitHub https://github.com/HildaMarHer
 *
 */
public class POOEj2 {

    public static void main(String[] args) {
        // Instanciación utilizando el contructor vacio
        Circunferencia c1 = new Circunferencia();

        c1.setradio(0);
        System.out.println();
        System.out.println(c1);

        c1.crearCircunferencia();
        System.out.println();

        c1.getradio();

        c1.area();
        System.out.println(c1.area());

        System.out.println(c1.perimetro());
        c1.perimetro();

        /*
        System.out.println("Ingrese el radio");
        // Instanciación utilizando el contructor vacio
        Circunferencia creacionCircunferencia2 = new Circunferencia();
        // llamando al método crearCircunferencia
        //crearcircun.crearCircunferencia();
         */
    }
}
