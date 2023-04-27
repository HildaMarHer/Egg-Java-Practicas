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
package pooej5;

import Banco.Menu;
import Banco.Cuenta;


/**
 *
 * @author Hida MarHer
 * @GitHub https://github.com/HildaMarHer
 *
 */
public class POOEj5 {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Cuenta cuenta = Cuenta(); 

        cuenta = cuenta.crearCuenta(); // Llamada al método crearCuenta de la clase Cuenta
        cuenta.consultarSaldo(); // Llamada al método consultarSaldo de la clase Cuenta

        menu.depositar(cuenta); // Llamada al método depositar de la clase Menu, pasando como parámetro el objeto cuenta de la clase Cuenta
        menu.retirar(cuenta); // Llamada al método retirar de la clase Menu, pasando como parámetro el objeto cuenta de la clase Cuenta
        menu.consultarDatos(cuenta); // Llamada al método consultarDatos de la clase Menu, pasando como parámetro el objeto cuenta de la clase Cuenta
    }

    private static Cuenta Cuenta() {
        return = Cuenta; 
    }

}