/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).

Las operaciones asociadas a dicha clase son:

a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package Banco;

import java.util.Scanner;

/**
 *
 * @author Hilda Martinez
 * @date {date}
 *
 */
public class Cuenta {

    public Cuenta(int numeroCuenta1, long dniCliente1, float par) {
    }

    /*Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).*/
//a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
    private int numeroCuenta;
    private long dniCliente;
    private float deposito;
    private int saldoActual;
    double interes = saldoActual * 3 / 100;

  
    //b) Agregar los métodos getters y setters correspondientes

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public float getDeposito() {
        return deposito;
    }

    public void setDeposito(float deposito) {
        this.deposito = deposito;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    
    
//c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    public Cuenta crearCuenta() {
        Scanner dc = new Scanner(System.in);
        System.out.println("Ingrese número de cuenta: ");
        numeroCuenta = dc.nextInt();
        System.out.println("Ingrese el DNI del cliente: ");
        dniCliente = dc.nextLong();
        System.out.println("¿Cantidad a dépositar?  ");
        deposito = dc.nextFloat();
        return new Cuenta(numeroCuenta, dniCliente, (float) deposito);
    }

    /*
        ublic void crearCuenta() {
        Scanner dc = new Scanner(System.in);
        System.out.println("Ingrese número de cuenta: ");
        this.numeroCuenta = dc.nextInt();
        System.out.println("Ingrese el DNI del cliente: ");
        this.dniCliente = dc.nextLong();
        System.out.println("Ingrese el saldo actual: ");
        this.saldoActual = dc.nextInt();
        System.out.println("Ingrese el interes: ");
        this.interes = dc.nextFloat();
        //return new Cuenta(numeroCuenta, dniCliente, saldoActual, interes);
    }
     */
// d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar y se la sumara a saldo actual.
    public void ingresar() {
        float ingreso = deposito;
              saldoActual += ingreso;
    } 

    /* e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.*/
    public void retirar(double retiro) {
        if (retiro <= saldoActual) {
            System.out.println("La cuenta no tiene saldo suficiente para lo que desea retirar ");
            saldoActual -= retiro;
        } else {
            saldoActual = 0;
        }
    }

// f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
    public void extraccionRapida(double saldo) {
        if (saldo <= saldoActual * 0.2) {
        saldoActual -= saldo;
        System.out.println("Se ha retirado $" + saldo + " de su cuenta.");
    } else {
        // Mostrar un mensaje de advertencia si la cantidad es mayor al 20% del saldo actual
        System.out.println("No es posible retirar más del 20% del saldo actual.");
        System.out.println("El máximo que puede retirar es de $" + (saldoActual * 0.2) + ".");
    }
}

// g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    public void consultarSaldo() {
        System.out.println("Saldo actual: " + saldoActual);

    }

// h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta  
    public void consultarDatos() {
        System.out.println("Número de cuenta: " + this.numeroCuenta);
        System.out.println("DNI del cliente: " + this.dniCliente);
        System.out.println("Saldo actual: " + this.saldoActual);
        System.out.println("Interés: " + this.interes);
    }

    void ingresar(double montoDeposito) {
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", dniCliente=" + dniCliente + ", deposito=" + deposito + ", saldoActual=" + saldoActual + ", interes=" + interes + '}';
    }

    

}
