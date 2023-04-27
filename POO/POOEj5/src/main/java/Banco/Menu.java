package Banco;

import java.util.Scanner;

/**
 *
 * @Hilda MarHer
 * @GitHub https://github.com/HildaMarHer
 *
 */
public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();
        int opcion = 0;

        do {
            System.out.println("==== MENÚ DE OPCIONES ====");
            System.out.println("1. Ingresar datos de la cuenta");
            System.out.println("2. Consultar saldo");
            System.out.println("3. Realizar depósito");
            System.out.println("4. Realizar retiro");
            System.out.println("5. Realizar extracción rápida");
            System.out.println("6. Consultar datos de la cuenta");
            System.out.println("0. Salir");

            System.out.print("\nIngrese una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    cuenta = cuenta.crearCuenta();
                    break;
                case 2:
                    cuenta.consultarSaldo();
                    break;
                case 3:
                    System.out.print("Ingrese el monto a depositar: ");
                    double montoDeposito = sc.nextDouble();
                    cuenta.ingresar(montoDeposito);
                    System.out.println("Depósito realizado con éxito.");
                    break;
                case 4:
                    System.out.print("Ingrese el monto a retirar: ");
                    double montoRetiro = sc.nextDouble();
                    cuenta.retirar(montoRetiro);
                    System.out.println("Retiro realizado con éxito.");
                    break;
                case 5:
                    System.out.print("Ingrese el monto a retirar (no más del 20% del saldo actual): ");
                    double montoExtraccion = sc.nextDouble();
                    cuenta.extraccionRapida(montoExtraccion);
                    break;
                case 6:
                    cuenta.consultarDatos();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, por favor ingrese una opción válida.");
            }
        } while (opcion != 0);

        sc.close();
    }
    public void mostrarMenu() {
    }

    public void consultarDatos(Cuenta cuenta) {
    }

    public void retirar(Cuenta cuenta) {
    }

    public void depositar(Cuenta cuenta) {
    }
    
}
