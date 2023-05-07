package Operacion;
//5/5/2023

/*
 *
 * HILDA MARHER
 *
 */

/*
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */

import Mate.Matematicas;

public class Operaciones {

    private Matematicas matematicas;

public Operaciones(Matematicas matematicas) {
    this.matematicas = matematicas;
}

public double devolverMayor() {
    return Math.max(matematicas.getNum1(), matematicas.getNum2());
}

public double calcularPotencia() {
    double mayor = devolverMayor();
    double menor = Math.min(matematicas.getNum1(), matematicas.getNum2());
    return Math.pow(Math.round(mayor), Math.round(menor));
}

public double calcularRaiz() {
    double menor = Math.min(matematicas.getNum1(), matematicas.getNum2());
    double valorAbsoluto = Math.abs(menor);
    return Math.sqrt(valorAbsoluto);
}
}