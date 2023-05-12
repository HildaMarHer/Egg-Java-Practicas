/*Clase Date
11. Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
import java.util.Date;
import java.util.Scanner;

public class DateExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dia;
        do {
            System.out.print("Ingrese el día (1 al 31): ");
            dia = scanner.nextInt();
            if (dia < 1 || dia > 31) {
                System.out.println("El número ingresado no es válido. Favor de ingresar un día válido");
            }
        } while (dia < 1 || dia > 31);

        int mes;
        do {
            System.out.print("Ingrese el mes (1 al 12): ");
            mes = scanner.nextInt();
            if (mes < 1 || mes > 12) {
                System.out.println("El número ingresado no es válido. Favor de ingresar un mes válido");
            }
        } while (mes < 1 || mes > 12);
        System.out.print("Ingrese el año: ");
        int anio = scanner.nextInt();

        Date fecha = new Date(anio - 1900, mes - 1, dia);
        Date fechaActual = new Date();
        System.out.println("La fecha ingresada es: " + fecha);
        System.out.println("Han transcurrido " + ((fechaActual.getTime() - fecha.getTime()) / 31536000000L) + " años desde la fecha ingresada hasta la fecha actual.");
        scanner.close();
    }
}
