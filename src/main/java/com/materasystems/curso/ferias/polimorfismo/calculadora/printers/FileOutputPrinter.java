package com.materasystems.curso.ferias.polimorfismo.calculadora.printers;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by rochapaulo on 24/01/17.
 */
public class FileOutputPrinter extends OutputPrinter {

    @Override
    public void print(String message) {
        try {
            PrintWriter writer = new PrintWriter("calculadora-" + System.currentTimeMillis() + ".out", "UTF-8");
            writer.println(message);
            writer.close();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

}
