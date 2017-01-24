package com.materasystems.curso.ferias.polimorfismo.calculadora;

/**
 * Created by rochapaulo on 23/01/17.
 */
class Remainder extends Operation {

    @Override
    public double apply(double a, double b) {
        return a % b;
    }

    @Override
    public String toString() {
        return "Remainder";
    }
}
