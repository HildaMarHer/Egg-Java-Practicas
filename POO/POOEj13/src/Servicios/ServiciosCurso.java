/*

 */

package Servicios;

import java.util.Scanner;
import School.Curso;

/*
 * POOEj13
 * Hilda MarHer, Date: 16/5/2023
 */

public class ServiciosCurso {
    public static void cargarAlumnos(Curso curso) {
        Scanner infoA = new Scanner(System.in);
        String[] alumnos = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
            alumnos[i] = infoA.nextLine();
        }
        curso.setAlumnos(alumnos);
    }

    public static Curso crearCurso() {
        Scanner infoCurso = new Scanner(System.in);
        System.out.print("Ingrese el nombre del curso: ");
        String nombreCurso = infoCurso.nextLine();
        System.out.print("Ingrese la cantidad de horas por día: ");
        int cantidadHorasPorDia = infoCurso.nextInt();
        System.out.print("Ingrese la cantidad de días por semana: ");
        int cantidadDiasPorSemana = infoCurso.nextInt();
        System.out.print("Ingrese el turno (mañana o tarde): ");
        String turno = infoCurso.next();
        System.out.print("Ingrese el precio por hora: ");
        double precioPorHora = infoCurso.nextDouble();

        Curso curso = new Curso(nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno, precioPorHora, null);
        cargarAlumnos(curso);

        return curso;
    }

    public static double calcularGananciaSemanal(Curso curso) {
        int cantidadHorasPorDia = curso.getCantidadHorasPorDia();
        double precioPorHora = curso.getPrecioPorHora();
        int cantidadAlumnos = curso.getAlumnos().length;
        int cantidadDiasPorSemana = curso.getCantidadDiasPorSemana();

        return cantidadHorasPorDia * precioPorHora * cantidadAlumnos * cantidadDiasPorSemana;
    }
}