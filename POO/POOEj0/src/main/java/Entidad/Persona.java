package Entidad;

/**
 *
 * @author Hilda MarHer <hherlindo@gmail.com>
 * @GitHub https://github.com/HildaMarHer
 *
 */
public class Persona {
    // Atributos
    // Constructores
    // Métodos propios
    //el nombre de la clase siempre debe iniciar con mayúscula, en caso de que sea algo compuesto debe usarse camel 

    /**
     * Atajo de teclado para ingresar a el constructor Alt+insert Ctrl + shif +
     * c para comentar
     */
    public String nombre;
    private String apellido;
    private String nacionalidad;
    private float estatura;

    public Persona() {
    }

    public Persona(String hilda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public float getEstatura() {
        return estatura;
    }

    public String getAll() {
        return nombre + " " + apellido + " " + nacionalidad + " " + estatura;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public void setAll(String nombre, String apellido, String nacionalidad, float estatura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.estatura = estatura;
    }

}
