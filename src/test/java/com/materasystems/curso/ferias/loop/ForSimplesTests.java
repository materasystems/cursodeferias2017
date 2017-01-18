/*
 * MATERA Systems, Curso de Férias 2017 - Maringá
 */
package com.materasystems.curso.ferias.loop;

import org.junit.Assert;
import org.junit.Test;

import com.materasystems.curso.ferias.loop.ForSimples;
import com.materasystems.curso.ferias.util.Expectations;

/**
 * Suite de testes para exercitar o uso do for simples
 * 
 * @author rochapaulo
 * @since 2017
 * 
 */
public class ForSimplesTests {

    private static final int DELTA = 0;
    private static final int[] SEQUENCIA_25_A_500 = Expectations.sq(25, 500);
    private static final int[] NUMEROS_PARES_0_A_20 = new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };    
    
    private final ForSimples forSimples = new ForSimples();
    
    /**
     * Implementar o método da classe #ForSimples para filtrar
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
        int[] resultado = forSimples.filtraPares(entrada);
        
        Assert.assertArrayEquals(new int[] { 0, 2, 4, 6, 8 }, resultado);
    }
    
    /**
     * Implementar o método da classe #ForSimples para filtrar
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
        int[] resultado = forSimples.filtraMaioresOuIguais(entrada, 10);
        
        Assert.assertArrayEquals(new int[] { 20, 60, 35 }, resultado);
    }
    
    /**
     * Implementar o método da classe #ForSimples para filtrar todos
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
        int[] resultado = forSimples.filtraMaioresOuIguais(entrada, -20);
        
        Assert.assertArrayEquals(new int[] { 20, 3, 60, 5, 0, 35, -20 }, resultado);
    }
    
    /**
     * Implementar o método da classe #ForSimples para filtrar todos
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
        int[] resultado = forSimples.filtraMenores(entrada, -250);
        
        Assert.assertArrayEquals(new int[] { -2000 }, resultado);
    }
    
    /**
     * Implementar o método da classe #ForSimples para filtrar todos
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
        
        int[] resultado = forSimples.filtraMenores(entrada, -10000);
        
        Assert.assertArrayEquals(new int[] { }, resultado);
    }
    
    /**
     * Implementar o método da classe #ForSimples para transformar
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
        String[] resultado = forSimples.transformaUsandoPrefixo(entrada, "O Número é: ");
        
        Assert.assertArrayEquals( 
                new String[] { "O Número é: 0", "O Número é: 1", "O Número é: 2", "O Número é: 3" }, resultado);
    }
    
    /**
     * Implementar o método da classe #ForSimples para transformar os elementos
     * em Double.
     * 
     * Dica:
     *  int Integer.parseInt(String argumento)
     *  double Double.parseDouble(String argumento)
     *  float Float.parseFloat(String argumento)
     *  
     */
    @Test
    public void transformarStringsEmDoubles() {
        
        String[] entrada = new String[] { "-50.0001", "50.2", "-992.665", "25", "3000001.0251" };
        double[] resultado = forSimples.transformarEmDouble(entrada);
        
        Assert.assertArrayEquals(new double[] { -50.0001, 50.2, -992.665, 25.0, 3000001.0251 }, resultado, DELTA);
    }
    
    /**
     * Implementar o método da classe #ForSimples para gerar a sequencia
     * de numeros inteiros de 25 até 500
     * 
     */
    @Test
    public void listarNumerosEntre25a500() {
        
        int[] resultado = forSimples.gerarNumerosEntre(25, 500);
        
        Assert.assertArrayEquals(SEQUENCIA_25_A_500, resultado);
    }
    
    /**
     * Implementar o método da classe #ForSimples e listar
     * todos elementos pares iniciando em zero até 20.
     * 
     */
    @Test
    public void listarTodosNumerosParesDe0a20() {
        
        int[] resultado = forSimples.gerarNumerosPares(0, 20);
        
        Assert.assertArrayEquals(NUMEROS_PARES_0_A_20, resultado);
    }
    
    /**
     * Implementar o método da classe #ForSimples para encontrar
     * o índice da palavra JAVA no array elementos.
     * 
     */
    @Test
    public void encontrarPosicaoDaPalavraJAVA() {
        
        String[] elementos = new String[5];
        elementos[0] = "Desenvolvimento";
        elementos[1] = "Curso";
        elementos[2] = "JAVA";
        elementos[3] = "Férias";
        elementos[4] = "2017";
        
        int posicao = forSimples.getPosicao("JAVA", elementos);
        
        Assert.assertEquals(2, posicao);
    }
    
    /**
     * Implementar o método da classe #ForSimples para encontrar
     * o índice da palavra 2016 no array elementos.
     * 
     */
    @Test
    public void elementoNaoEncontrado() {
        
        String[] elementos = new String[5];
        elementos[0] = "Desenvolvimento";
        elementos[1] = "Curso";
        elementos[2] = "JAVA";
        elementos[3] = "Férias";
        elementos[4] = "2017";
        
        int posicao = forSimples.getPosicao("2016", elementos);
        
        Assert.assertEquals(-1, posicao);
    }
    
}
