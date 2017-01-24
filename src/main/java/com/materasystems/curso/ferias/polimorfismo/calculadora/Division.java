package com.materasystems.curso.ferias.polimorfismo.calculadora;

/**
 * Created by rochapaulo on 23/01/17.
 */
class Division extends Operation {

    @Override
    public double apply(double a, double b) {
        if (b < 0) {
            throw new IllegalArgumentException("Division by 0");
        }
        return a / b;
    }

    @Override
    public String toString() {
        return "Division";
    }

}
