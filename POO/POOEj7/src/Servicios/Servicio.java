package Servicio;

import identidad.Persona;

public class ServicioPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona("Ana", 25, 'M', 50.5, 1.65);
        Persona p2 = new Persona("Juan", 35, 'H', 80.0, 1.80);
        Persona p3 = new Persona("Lucía", 17, 'M', 45.0, 1.55);
        Persona p4 = new Persona();
        p4.crearPersona();

        Persona[] personas = {p1, p2, p3, p4};

        int porDebajo = 0;
        int enPesoIdeal = 0;
        int porEncima = 0;
        int mayoresDeEdad = 0;
        int menoresDeEdad = 0;

        for (Persona p : personas) {
            int imc = p.calcularIMC();
            boolean esMayor = p.esMayorDeEdad();

            if (imc == -1) {
                porDebajo++;
            } else if (imc == 0) {
                enPesoIdeal++;
            } else {
                porEncima++;
            }

            if (esMayor) {
                mayoresDeEdad++;
            } else {
                menoresDeEdad++;
            }
        }

        double porcDebajo = (porDebajo * 100.0) / personas.length;
        double porcEnPesoIdeal = (enPesoIdeal * 100.0) / personas.length;
        double porcEncima = (porEncima * 100.0) / personas.length;
        double porcMayoresDeEdad = (mayoresDeEdad * 100.0) / personas.length;
        double porcMenoresDeEdad = (menoresDeEdad * 100.0) / personas.length;

        System.out.println("Porcentaje de personas por debajo de su peso ideal: " + porcDebajo + "%");
        System.out.println("Porcentaje de personas en su peso ideal: " + porcEnPesoIdeal + "%");
        System.out.println("Porcentaje de personas por encima de su peso ideal: " + porcEncima + "%");
        System.out.println("Porcentaje de personas mayores de edad: " + porcMayoresDeEdad + "%");
        System.out.println("Porcentaje de personas menores de edad: " + porcMenoresDeEdad + "%");
    }
}
