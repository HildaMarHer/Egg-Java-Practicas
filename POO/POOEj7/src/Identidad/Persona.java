package Identidad;

public class Persona {
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearPersona() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre:");
        this.nombre = sc.nextLine();
        System.out.println("Introduce la edad:");
        this.edad = sc.nextInt();
        System.out.println("Introduce el sexo (H, M, O):");
        this.sexo = sc.next().charAt(0);
        while (this.sexo != 'H' && this.sexo != 'M' && this.sexo != 'O') {
            System.out.println("Sexo no válido. Introduce el sexo (H, M, O):");
            this.sexo = sc.next().charAt(0);
        }
        System.out.println("Introduce el peso en kg:");
        this.peso = sc.nextDouble();
        System.out.println("Introduce la altura en m:");
        this.altura = sc.nextDouble();
    }

    public int calcularIMC() {
        double imc = this.peso / Math.pow(this.altura, 2);
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }
}
