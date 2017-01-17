/*
 * MATERA Systems, Curso de Férias 2017 - Maringá
 */
package com.materasystems.curso.ferias.loop;
import org.junit.Assert;
import org.junit.Test;

import com.materasystems.curso.ferias.loop.ForEach;

/**
 * Suite de testes para exercitar o uso do foreach (Loop Aprimorado)
 * 
 * @author rochapaulo
 * @since 2017
 *
 */
public class ForEachTests {

    private final ForEach forEach = new ForEach();
    
    /**
     * Implementar o método da classe ForEach para filtrar
     * todos elementos pares do array de entrada.
     * 
     * Dica: Um número inteiro qualquer é dito par se, ao ser dividido pelo número dois, 
     *       resulta em um número inteiro. A linguagem java possui o operador chamado modulo,
     *       representado por %, este operador retorna o resto da divisão entre os operadores, 
     *       por exemplo 10 % 3 = 1
     * 
     */
    @Test
    public void filtrarNumerosPares() {
        
        int[] entrada = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] resultado = forEach.filtraPares(entrada);
        
        Assert.assertArrayEquals(new int[] { 0, 2, 4, 6, 8 }, resultado);
    }
    
    /**
     * Implementar o método da classe ForEach para filtrar
     * todos elementos maiores que o valor passado como argumento.
     * 
     * Operadores relacionais:
     *  > Maior
     *  < Menor
     *  >= Maior ou Igual
     *  =< Menor ou Igual
     * 
     */
    @Test
    public void filtrarNumerosMaioresQueDez() {
        
        int[] entrada = new int[] { 20, 3, -50, 60, 5, 0, -2000, 35, -20 };
        int[] resultado = forEach.filtraMaioresOuIguais(entrada, 10);
        
        Assert.assertArrayEquals(new int[] { 20, 60, 35 }, resultado);
    }
    
    /**
     * Implementar o método da classe ForEach para filtrar todos
     * elementos maiores ou iguais ao valor passado como argumento.
     * 
     * Operadores relacionais:
     *  > Maior
     *  < Menor
     *  >= Maior ou Igual
     *  =< Menor ou Igual
     * 
     */
    @Test
    public void filtrarNumerosMaioresOuIguaisAMenosVinte() {
        
        int[] entrada = new int[] { 20, 3, -50, 60, 5, 0, -2000, 35, -20 };
        int[] resultado = forEach.filtraMaioresOuIguais(entrada, -20);
        
        Assert.assertArrayEquals(new int[] { 20, 3, 60, 5, 0, 35, -20 }, resultado);
    }
    
    /**
     * Implementar o método da classe ForEach para filtrar todos
     * elementos menores que valor passado como argumento.
     * 
     * Operadores relacionais:
     *  > Maior
     *  < Menor
     *  >= Maior ou Igual
     *  =< Menor ou Igual
     * 
     */
    @Test
    public void filtrarNumerosMenoresQue250() {
        
        int[] entrada = new int[] { 20, 3, -50, 60, 5, 0, -2000, 35, -20 };
        int[] resultado = forEach.filtraMenores(entrada, -250);
        
        Assert.assertArrayEquals(new int[] { -2000 }, resultado);
    }
    
    /**
     * Implementar o método da classe ForEach para filtrar todos
     * elementos menores que valor passado como argumento.
     * 
     * Operadores relacionais:
     *  > Maior
     *  < Menor
     *  >= Maior ou Igual
     *  =< Menor ou Igual
     * 
     */
    @Test
    public void filtraMenoresQueDezMilNegativo() {
        
        int[] entrada = new int[] { 20, 3, -50, 60, 5, 0, -2000, 35, -20 };
        
        int[] resultado = forEach.filtraMenores(entrada, -10000);
        
        Assert.assertArrayEquals(new int[] { }, resultado);
    }
    
    /**
     * Implementar o método da classe ForEach para transformar
     * cada elemento do vetor de entrada em Strings no formato: "O Número é: " + $elemento
     * 
     * Dica: 
     *  Inicialize um vetor do tipo String para armazenar os resultados, este pode ser criado
     *  usando o seguinte comando: String[] resultado = new String[tamanho]
     * 
     */
    @Test
    public void transformarNumeroEmStringUsandoPrefixo() {
        
        int[] entrada = new int[] { 0, 1, 2, 3 };
        String[] resultado = forEach.transformaUsandoPrefixo(entrada, "O Número é: ");
        
        Assert.assertArrayEquals( 
                new String[] { "O Número é: 0", "O Número é: 1", "O Número é: 2", "O Número é: 3" }, resultado);
    }
    
    /**
     * Implementar o método da classe ForEach para transformar os elementos
     * em Inteiros.
     * 
     * Dica:
     *  int Integer.parseInt(String argumento)
     *  double Double.parseDouble(String argumento)
     *  float Float.parseFloat(String argumento)
     *  
     */
    @Test
    public void transformarStringsEmInteiros() {
        
        String[] entrada = new String[] { "-50", "50", "-992", "25", "3000001" };
        int[] resultado = forEach.transformarEmInteiros(entrada);
        
        Assert.assertArrayEquals(new int[] { -50, 50, -992, 25, 3000001 }, resultado);
    }
    
}
