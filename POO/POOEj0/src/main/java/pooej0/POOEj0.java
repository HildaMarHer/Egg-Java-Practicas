package pooej0;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Hilda MarHer <hherlindo@gmail.com>
 */
public class POOEj0 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //Instanciación utilizando el constructor vacío
        Persona personauno = new Persona();  //sintaxis para crear un objeto. Al oprimir ctrl sobre aluna clase nos lleva a ella.
        Persona personados = new Persona();
        //personauno.setNombre("Hilda");

        personauno.setNombre(leer.nextLine());
        personauno.setApellido(leer.nextLine());
        leer.nextLine();
        personauno.setEstatura(leer.nextFloat());

        System.out.println(personauno.getNombre());

    }
}
