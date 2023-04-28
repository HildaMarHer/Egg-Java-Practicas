package POOEj5.Servicio;


import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Servicios servicios = new Servicios();
        Scanner scanner = new Scanner(System.in);
        servicios.crearCuenta();
        int opcion = 0;
        System.out.println("==========================================");
        System.out.println("======= Bienvenido al Banco Egg - FullStack =======");
        System.out.println("==========================================");
        System.out.println("");
         do {
            System.out.println("1. Consultar datos de la cuenta");
            System.out.println("2. Consultar saldo");
            System.out.println("3. Ingresar dinero");
            System.out.println("4. Retirar dinero");
            System.out.println("5. Extracción rápida");
            System.out.println("0. Salir");
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    servicios.consultaCuenta();
                    break;
                case 2:
                    servicios.consultaSaldo();
                    break;
                case 3:
                    servicios.ingresarDinero();
                    break;
                case 4:
                    servicios.retiroDinero();
                    break;
                case 5:
                    servicios.extraccionRapida();
                    break;
                case 0:
                    System.out.println("Gracias por utilizar nuestros servicios.");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 0);
    }
}