package com.materasystems.curso.ferias.polimorfismo.calculadora.printers;

import javax.swing.*;

/**
 * Created by rochapaulo on 24/01/17.
 */
public class SwingOutputPrinter extends OutputPrinter {

    @Override
    public void print(String message) {
        JFrame frame = new JFrame("SwingOutputPrinter");
        JOptionPane.showMessageDialog(frame, message, "SwingOutputPrinter", JOptionPane.INFORMATION_MESSAGE);
    }

}
