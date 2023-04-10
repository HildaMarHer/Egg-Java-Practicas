package guia7_ejercicio14;

import java.util.Scanner;

/**
 *
 * @author Hilda MarHer
 */
public class Guia7_Ejercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar = "si";
        
        while (continuar.equalsIgnoreCase("si")) {
            
            System.out.print("Ingrese la cantidad de euros que desea convertir: ");
            double euros = sc.nextDouble();
            sc.nextLine(); // Limpiamos el buffer de lectura
            
            // Menú para elegir divisa
            System.out.println("Elige la divisa a la que quieres convertir:");
            System.out.println("1. Libras");
            System.out.println("2. Dólares");
            System.out.println("3. Yenes");
            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiamos el buffer de lectura
            
            // Conversión de divisa y muestra de resultado
            switch (opcion) {
                case 1:
                    convertirDivisa(euros, "libras");
                    break;
                case 2:
                    convertirDivisa(euros, "dólares");
                    break;
                case 3:
                    convertirDivisa(euros, "yenes");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
            
            // Preguntamos si desea realizar otra conversión
            System.out.println("¿Desea realizar otra conversión? (si/no)");
            continuar = sc.nextLine();
        }
        
        sc.close();
    }
    
    public static void convertirDivisa(double euros, String divisa) {
        double resultado = 0;
        
        switch (divisa.toLowerCase()) {
            case "libras":
                resultado = euros * 0.86;
                System.out.printf("%.2f euros equivalen a %.2f libras\n", euros, resultado);
                break;
            case "dólares":
                resultado = euros * 1.28611;
                System.out.printf("%.2f euros equivalen a %.2f dólares\n", euros, resultado);
                break;
            case "yenes":
                resultado = euros * 129.852;
                System.out.printf("%.2f euros equivalen a %.2f yenes\n", euros, resultado);
                break;
            default:
                System.out.println("Divisa no soportada");
                break;
        }
    }

}