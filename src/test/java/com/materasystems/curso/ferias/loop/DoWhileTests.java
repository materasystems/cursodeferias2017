/*
 * MATERA Systems, Curso de Férias 2017 - Maringá
 */
package com.materasystems.curso.ferias.loop;

import org.junit.Assert;
import org.junit.Test;

import com.materasystems.curso.ferias.util.Expectations;

/**
 * Suite de testes para exercitar o uso do loop DoWhile
 * 
 * @author rochapaulo
 * @since 2017
 * 
 */
public class DoWhileTests {

    private static final int[] TABUADA_DO_DOIS = new int[]{ 0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
    private static final int[] TABUADA_DO_NOVE = new int[]{ 0, 9, 18, 27, 36, 45, 54, 63, 72, 81, 90};
    private static final int SOMA_ENESIMO_10 = Expectations.pa(10);
    private static final int SOMA_ENESIMO_50 = Expectations.pa(50);
    
    private final DoWhile doWhile = new DoWhile();
    
    /**
     * Implementar o método getTabuada da classe #DoWhile
     * para calcular a tabuada do dois.
     * 
     */
    @Test
    public void tabuadaDoDois() {
        
        int[] tabuadaDoDois = doWhile.getTabuada(2);
        Assert.assertArrayEquals(TABUADA_DO_DOIS, tabuadaDoDois);
    }
    
    /**
     * Implementar o método getTabuada da classe #DoWhile
     * para calcular a tabuada do nove.
     * 
     */
    @Test
    public void tabuadaDo9() {
        
        int[] tabuadaDoNove = doWhile.getTabuada(9);
        Assert.assertArrayEquals(TABUADA_DO_NOVE, tabuadaDoNove);
    }
 
    /**
     * Implementar o método somaTotal da classe #DoWhile
     * para calcular a soma de 1 até 10;
     * 
     */
    @Test
    public void calculaPA10() {
        
        int somaEnesimo = doWhile.somaTotal(10);
        Assert.assertEquals(SOMA_ENESIMO_10, somaEnesimo);
    }
 
    /**
     * Implementar o método somaTotal da classe #DoWhile
     * para calcular a soma de 1 até 50;
     * 
     */
    @Test
    public void calculaPA50() {
        
        int somaEnesimo = doWhile.somaTotal(50);
        Assert.assertEquals(SOMA_ENESIMO_50, somaEnesimo);
    }
    
}
