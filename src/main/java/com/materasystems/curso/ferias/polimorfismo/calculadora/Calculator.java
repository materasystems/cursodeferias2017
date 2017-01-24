package com.materasystems.curso.ferias.polimorfismo.calculadora;

/**
 * Created by rochapaulo on 23/01/17.
 */
public class Calculator {

    public static final int SUM = 0;
    public static final int DIVISION = 1;
    public static final int TIMES = 2;
    public static final int REMAINDER = 3;

    private Operation active;
    private final Operation[] operations = new Operation[] {
            new Sum(),
            new Division(),
            new Times(),
            new Remainder()
    };

    public void showOperations() {
        System.out.println("Operações Disponíveis");
        for (int i = 0; i < operations.length; i++) {
            System.out.println((i + 1) + " - " + operations[i]);
        }
    }

    public void setOperation(int operation) {
        if (operation < 0 || operation > operations.length) {
            throw new IllegalArgumentException("Operação inválida");
        }
        active = operations[operation - 1];
    }

    public Operation getActiveOperation() {
        return active;
    }

    public double calculate(double a, double b) {
        if (active == null) {
            throw new IllegalStateException("Escolha uma operação para ser executada primeiro");
        }
        return active.apply(a, b);
    }

}