/*c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta*/

/*
 *
 * @author Hilda MarHer <hherlindo@gmail.com>
 * @GitHub https://github.com/HildaMarHer
 *
 */
package POOEj5.Servicio;

import POOEj5.Banco.Cuenta;

import java.util.Scanner;

public class Servicios {
    Cuenta usuario = new Cuenta();
    Scanner leer = new Scanner(System.in);
    //Metodo cuenta, pidiendo datos del usuario.
    public void crearCuenta(){
      boolean dniValido = false;
        while (!dniValido) {
            System.out.println("Ingrese el numero de DNI");
            long dni = leer.nextLong();
            if (String.valueOf(dni).length() == 11) {
                usuario.setDni(dni);
                dniValido = true;
            } else {
                System.out.println("El DNI debe tener 11 digitos");
            }
        }

        boolean cuentaValida = false;
        while (!cuentaValida) {
            System.out.println("Ingrese el numero de cuenta");
            int cuenta = leer.nextInt();
            if (String.valueOf(cuenta).length() >= 6) {
                usuario.setNumeroCuenta(cuenta);
                cuentaValida = true;
            } else {
                System.out.println("La cuenta debe tener al menos 6 digitos");
            }
        }
    }

    //Metodo ingresar. Recibe dinero y se suma al actual.
    public double ingresarDinero(){
        System.out.println("Ingrese el monto a depositar");
        usuario.setIngreso(leer.nextDouble());
        usuario.setSaldoActual(usuario.getSaldoActual() + usuario.getIngreso());
        System.out.println("Su saldo actual es de: " + usuario.getSaldoActual());
        System.out.println("----------------------------------------------------------------------------------------");
        return usuario.getIngreso();

    }

    //Metodo retirar. Se saca dinero, se resta del saldo actual. Si el monto en mayor al saldo actual, el saldo actual será 0.
    public double retiroDinero(){
        System.out.println("Ingrese el monto a retirar");
        usuario.setRetiro(leer.nextDouble());
        if (usuario.getRetiro()==usuario.getSaldoActual()){
            usuario.setSaldoActual(usuario.getRetiro() - usuario.getSaldoActual());
            System.out.println("Se ha retirado el total del dinero de su cuenta.");
            System.out.println("----------------------------------------------------------------------------------------");
        } else if(usuario.getRetiro()< usuario.getSaldoActual()){
            usuario.setSaldoActual(usuario.getSaldoActual() - usuario.getRetiro());
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("Su nuevo saldo es de: " + usuario.getSaldoActual());
        } else {
            System.out.println("No tiene saldo suficiente. Disponible: " + usuario.getSaldoActual());
            System.out.println("----------------------------------------------------------------------------------------");
        }
        return usuario.getRetiro();
    }

    //Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
    public void extraccionRapida(){
        double extraccion = (usuario.getSaldoActual() * 0.20);
        System.out.println("Sólo puedes retirar el 20% de tu saldo actual. Tu saldo es: " + usuario.getSaldoActual());
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Tu saldo disponible para retirar es: " + extraccion );
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Deseas realizar el retiro? (Ingresa 'Si ' para aceptar o 'No' para cancelar y volver al Menú principal");
        String opcion = leer.next();

        if(opcion.equalsIgnoreCase("si")){
            usuario.setSaldoActual(usuario.getSaldoActual() - extraccion);
            System.out.println("Retiro realizado con éxito.");
        } else if(opcion.equalsIgnoreCase("no")){
            System.out.println("Retiro cancelado.");
        } else {
            System.out.println("Regresando al menú principal...");
        }
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Tu saldo actual luego de la extracción es: " + usuario.getSaldoActual());
        System.out.println("----------------------------------------------------------------------------------------");
    }
    //Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    public void consultaSaldo(){
        System.out.println("El saldo de su cuenta es de: " + usuario.getSaldoActual());
        System.out.println("----------------------------------------------------------------------------------------");
    }
    //Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    public void consultaCuenta(){
        System.out.println("=*=*= Estos son los datos que has ingresado.=*=*=");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("El DNI del usuario es: " + usuario.getDni());
        System.out.println("El numero de su cuenta es de: " + usuario.getNumeroCuenta());
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Su saldo actual es de: " + usuario.getSaldoActual());
        System.out.println("----------------------------------------------------------------------------------------");
    }

}
