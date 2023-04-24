/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
package pooej3;

/**
 *
 * @author Hilda MarHer <hherlindo@gmail.com>
 * @GitHub https://github.com/HildaMarHer
 *
 */
public class POOEj3 {

    public static void main(String[] args) {

        Operacion operacion = new Operacion();

//sin el  @Override se debe declarar la variables

        operacion.crearOperacion();
        int resultadoSuma = operacion.sumar();
        System.out.println("El resultado de la suma es: " + resultadoSuma);

        int resultadoResta = operacion.restar();
        System.out.println("El resultado de la resta es: " + resultadoResta);

        int resultadoMultiplicacion = operacion.multiplicar();
        System.out.println("El resultado de la multiplicación es: " + resultadoMultiplicacion);

        double resultadoDivision = operacion.dividir();
        System.out.println("El resultado de la división es: " + resultadoDivision);

//Usando el  @Override solo se llaman las clases

        operacion.sumar();
        System.out.println("Suma= " + operacion.sumar());

        operacion.restar();
        System.out.println("Restar= " + operacion.restar());

        operacion.multiplicar();
        System.out.println("Multiplicación= " + operacion.multiplicar());

        operacion.dividir();
        System.out.println("División= " + operacion.dividir());

    }
}