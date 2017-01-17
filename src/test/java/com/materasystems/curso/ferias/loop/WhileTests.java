/*
 * MATERA Systems, Curso de Férias 2017 - Maringá
 */
package com.materasystems.curso.ferias.loop;

import org.junit.Assert;
import org.junit.Test;

/**
 * Suite de testes para exercitar o uso do loop While
 * 
 * @author rochapaulo
 * @since 2017
 * 
 */
public class WhileTests {

    private final While whileSimples = new While();
    
    /**
     * Implementar o método getImpares da classe #While
     * 
     */
    @Test
    public void filtraImpares() {
        
        int[] elementos = new int[] { 0, 1, 2, 3, 4, 5 };
        int[] impares = whileSimples.getImpares(elementos);
        
        Assert.assertArrayEquals(new int[] { 1, 3, 5 }, impares);
    }
    
    /**
     * Implementar o método getMaior da classe #While
     * 
     */
    @Test
    public void getMaior() {
        
        int[] elementos = new int[] { 0, 1, 2, 5, 4, -1 };
        int maior = whileSimples.getMaior(elementos);
        
        Assert.assertEquals(5, maior);
    }
    
    /**
     * Implementar o método getMaior da classe #While
     * 
     */
    @Test
    public void getMaiorArrayVazio() {
        
        int[] elementos = new int[] {};
        int maior = whileSimples.getMaior(elementos);
        
        Assert.assertEquals(Integer.MIN_VALUE, maior);
    }
    
    /**
     * Implementar o método getMenor da classe #While
     * 
     */
    @Test
    public void getMenor() {
        
        int[] elementos = new int[] { 0, 1, 2, 5, 4, -1 };
        int menor = whileSimples.getMenor(elementos);
        
        Assert.assertEquals(-1, menor);
    }
    
    /**
     * Implementar o método getMenor da classe #While
     * 
     */
    @Test
    public void getMenorArrayVazio() {
        
        int[] elementos = new int[] {};
        int menor = whileSimples.getMenor(elementos);
        
        Assert.assertEquals(Integer.MIN_VALUE, menor);
    }
    
}
