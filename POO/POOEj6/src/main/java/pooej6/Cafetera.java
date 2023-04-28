/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual

 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package pooej6;

import java.util.Scanner;

/**
 *
 * @Hilda MarHer
 * @GitHub https://github.com/HildaMarHer
 *
 */

public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;

    // Constructor predeterminado o vacío
    public Cafetera() {
        this.capacidadMaxima = 3000; // Capacidad máxima predeterminada de 1000 ml
        this.cantidadActual = 0;
    }

    // Constructor con la capacidad máxima y la cantidad actual
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = Math.min(capacidadMaxima, cantidadActual); // Asegura que la cantidad actual no sea mayor a la capacidad máxima
    }

    // Métodos getters y setters.
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    // Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
    public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
    }

    //  Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el 
    //tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
// cuanto quedó la taza.
     public void servirTaza(int tamanoTaza) {
        String[] tamanos = {"Short", "Tall", "Grande", "Venti"};
        int[] capacidades = {250, 350, 470, 590}; // Capacidades en ml correspondientes a cada tamaño de taza
        int indice = tamanoTaza - 1;
        if (indice < 0 || indice >= tamanos.length) {
            System.out.println("Tamaño de taza inválido.");
            return;
        }
        int capacidadTaza = capacidades[indice];
        if (this.cantidadActual >= capacidadTaza) {
            this.cantidadActual -= capacidadTaza;
            System.out.println("Se llenó la taza de tamaño " + tamanos[indice] + ".");
        } else {
            System.out.println("No se pudo llenar completamente la taza de tamaño " + tamanos[indice] + ".");
            System.out.println("La taza quedó con " + this.cantidadActual + " ml de café.");
            this.cantidadActual = 0;
        }
    }

    public void vaciarCafetera() {
        this.cantidadActual = 0;
        System.out.println("Cafetera vaciada.");
    }

    public void agregarCafe(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Cantidad inválida.");
            return;
        }
        this.cantidadActual += cantidad;
        if (this.cantidadActual > this.capacidadMaxima) {
            this.cantidadActual = this.capacidadMaxima;
        }
        System.out.println("Se agregaron " + cantidad + " ml de café.");
    }

    public void mostrarMenu() {
        System.out.println("Seleccione el tamaño de taza:");
        System.out.println("1. Short (250 ml)");
        System.out.println("2. Tall (350 ml)");
        System.out.println("3. Grande (470 ml)");
        System.out.println("4. Venti (590 ml)");
    }

   
}
 
 
    
