package com.materasystems.curso.ferias.polimorfismo.calculadora.executor;

import com.materasystems.curso.ferias.polimorfismo.calculadora.Calculator;
import com.materasystems.curso.ferias.polimorfismo.calculadora.printers.OutputPrinter;
import com.materasystems.curso.ferias.polimorfismo.calculadora.printers.SwingOutputPrinter;

import java.util.Scanner;

/**
 * Created by rochapaulo on 23/01/17.
 */
public class Entrypoint {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        final Calculator calculadora = new Calculator();

        calculadora.showOperations();

        System.out.print(">_");
        Integer operation = scanner.nextInt();

        calculadora.setOperation(operation);

        System.out.print("Operando 1: ");
        Double operando1 = scanner.nextDouble();

        System.out.print("Operando 2: ");
        Double operando2 = scanner.nextDouble();

        Double resultado = calculadora.calculate(operando1, operando2);

        String message = "O resultado da operação " + calculadora.getActiveOperation()
                + "[" + operando1 + ", " + operando2 + "] é = " + resultado;

        OutputPrinter printer = new OutputPrinter();
        printer.print(message);

//        printer = new FileOutputPrinter();
//        printer.print(message);

        printer = new SwingOutputPrinter();
        printer.print(message);


        System.exit(0);
    }

}