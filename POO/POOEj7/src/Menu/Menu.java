package Menu;

public class Main {
    public static void main(String[] args) {
        // Ejecutar el menú
        Menu.main(args);

        // Ejecutar un método en la clase ServicioPersona
        ServicioPersona.metodo();

        // Crear una instancia de la clase Persona en el paquete identidad y utilizar sus métodos
        Persona persona = new Persona("Juan", 25, 'H', 80.0, 1.80);
        System.out.println(persona.getNombre());
        System.out.println(persona.calcularIMC());
    }
}
