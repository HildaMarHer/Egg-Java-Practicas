package pooej4;

/**
 *
 * @author Hilda MarHer
 * @GitHub https://github.com/HildaMarHer
 *
 */
public class POOEj4 {

    public static void main(String[] args) {
   
        Rectangulo rectangulo = new Rectangulo();
        System.out.println("La superficie del rectángulo es: " + rectangulo.calcularSuperficie());
        System.out.println("El perímetro del rectángulo es: " + rectangulo.calcularPerimetro());
        System.out.println("El dibujo del rectángulo es:");
        rectangulo.dibujarRectangulo();

    }
}
