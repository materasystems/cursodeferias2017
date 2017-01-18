/*
 * MATERA Systems, Curso de Férias 2017 - Maringá
 */
package com.materasystems.curso.ferias.loop;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * @author rochapaulo
 *
 */
public class MatrizTest {

    private static final int[][] MATRIZ_4_X_4 = 
            new int[][] 
            {
                { -1, -1, -1, -1}, 
                { -1, -1, -1, -1}, 
                { -1, -1, -1, -1}, 
                { -1, -1, -1, -1}
            };
    
    private static final int[][] MATRIZ_4_X_4_VARIOS_VALORES = 
            new int[][] 
            {
                { 40,  2, -5, 10}, 
                { 33, 31, 01, 99}, 
                { -1, 21, 51, -9}, 
                { 32, 34, -3, 20}
            };
            
    private static final int[][] MATRIZ_4_X_4_VARIOS_VALORES_X8 = 
            new int[][] 
            {
                { 320,  16, -40, 80}, 
                { 264, 248, 8, 792 }, 
                { -8, 168, 408, -72}, 
                { 256, 272, -24, 160}
            };
         
    /**
     * Implementar o método criaMatriz da classe #Matriz
     *         
     */
    @Test
    public void criaMatriz() {
    
        int[][] matriz = Matriz.criaMatriz(4, 4);
        Assert.assertArrayEquals(MATRIZ_4_X_4, matriz);
    }
    
    /**
     * Implementar o método getElemento da classe #Matriz
     * 
     */
    @Test
    public void getElemento() {
    
        int elemento = Matriz.getElemento(MATRIZ_4_X_4_VARIOS_VALORES, 2, 3);
        Assert.assertEquals(-9, elemento);
    }
 
    /**
     * Implementar o método multiplicaPor da classe #Matriz
     * 
     */
    @Test
    public void multiplicaMatrizPorOito() {
        
        int[][] resultado = Matriz.multiplicaPor(MATRIZ_4_X_4_VARIOS_VALORES, 8);
        Assert.assertArrayEquals(MATRIZ_4_X_4_VARIOS_VALORES_X8, resultado);
    }
    
}
