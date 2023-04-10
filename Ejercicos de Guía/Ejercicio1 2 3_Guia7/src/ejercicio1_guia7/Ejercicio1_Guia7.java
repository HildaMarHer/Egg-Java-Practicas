
package ejercicio1_guia7;

/**
 *
 * @author hherl
 */
public class Ejercicio1_Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       // String nombre; 
        //int numero; 
        //double decimales; 
        
        /*  Entero  => int => Ej: 0, 1, 35, 120, 44, etc. 
            Decimales => double => Ej: 1.5; 5.8, 35.44; etc
            Booleanos => Boolean => true o false
            Caracteres => char => 'a', 'b', 'l', 'd', 'h'... etc
            Cadena de caracteres / texto => String => "Hola mundo"
            Entero Largo => long => números entre (-9.223.372.036.854.775.808 y 9.223.372.036.854.775.807)
        
        
        La declaración de las variables cuenta de dos partes fudamentales
            tipo de dato + Nombre; (int numero;)*/
        int numero = 27; 
        String nombre = "Hilda";
        char  letra = 'h';
        double temperatura = 27.43;
        boolean  siOno = false; 
        boolean noOsi = true; 
        long largo = 123456789; 
        
        int num1, num2, num3, num4, rs, rr, rm, rd, res1, res2; 
        num1 = 4; 
        num2 = 2;
        num3 = 5; 
        num4 = 3;
        
        int suma = num3 + num4; 
        
        double division = num3 / num4;
        
        boolean comp = num3 < num4; 
        
        num3++; 
         
        rs = num1 + num2; 
        rr = num1 - num2; 
        rm = num1 * num2; 
        rd = num1 / num2; 
        
        
        
        System.out.println("El resultado de la suma es = " + rs);
        System.out.println("El resultado de la resta es = " + rr);
        System.out.println("El resultado de la multiplicación es = " + rm);
        System.out.println("El resultado de la división es = " + rd);
        System.out.println("El resutaldo double es = " + division);
        System.out.printIn("El resultado boolean es =  " +  comp);
        System.out.println("El incremento en el número 3 = " + num3);
        
        //pritnIn sin el In quita el salto de línea
        
 
    }
    
}
