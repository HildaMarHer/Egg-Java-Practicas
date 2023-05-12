/*
 *
 * HILDA MARHER
 *
 */
package Servicios;

import Identidad.Persona;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ServiciosPersona {
    private static Scanner lector = new Scanner(System.in);

    public Persona crearPersona() {
        System.out.println("Ingrese el nombre de la persona:");
        String nombre = lector.nextLine();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        formatoFecha.setLenient(false); // para evitar el proceso con fechas incorrectas

        Date fechaNacimiento = null;
        while (fechaNacimiento == null) {
            System.out.println("Ingrese la fecha de nacimiento de la persona (en formato dd/MM/yyyy):");
            String leerFecha = lector.nextLine();//Scanner para leer la fecha de nacimiento

        /*Objeto SimpleDateFormat se utiliza para interpretar la fecha en un formato de dd/MM/YYYY
        try-catch utilizado para manejar la posible excepción que podría ocurrir al convertir una
        cadena de fecha en objeto 'Date'. Al capturar una excepción 'ParseException',
        se captura el 'catch', se imprime un mensaje de error en la terminal utilizando con el método
        'getMessage()' del objeto 'PaseException'. Para utilizar estos objetos es importante recordar
        importar la librería 'import java.text.ParseException'
        */
            try {
                fechaNacimiento = formatoFecha.parse(leerFecha);
            } catch (ParseException ex) {
                System.out.println("Error al escribir la fecha. Asegúrese de que esté en el formato dd/MM/yyyy.");
            }
        }
        return new Persona(nombre, fechaNacimiento);
    }

    public int calcularEdad(Date fechaNacimiento) {
        Calendar fechaActual = Calendar.getInstance();
        Calendar fechaNac = Calendar.getInstance();
        fechaNac.setTime(fechaNacimiento);

        int edad = fechaActual.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);

        if (fechaActual.get(Calendar.MONTH) < fechaNac.get(Calendar.MONTH)) {
            edad--;
        } else if (fechaActual.get(Calendar.MONTH) == fechaNac.get(Calendar.MONTH)
                && fechaActual.get(Calendar.DAY_OF_MONTH) < fechaNac.get(Calendar.DAY_OF_MONTH)) {
            edad--;
        }
        return edad;
    }

    public boolean menorQue(Persona persona, Date fechaNacimientoComparacion) {
        int edadPersona = calcularEdad(persona.getFechaNacimiento());
        int edadComparacion = calcularEdad(fechaNacimientoComparacion);
        return edadPersona < edadComparacion;
    }

    public void mostrarPersona(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechaNacimiento = formatoFecha.format(persona.getFechaNacimiento());
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        int edad = calcularEdad(persona.getFechaNacimiento());
        System.out.println("Edad:" + edad);
    }
}
