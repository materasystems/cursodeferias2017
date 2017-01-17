/*
 * MATERA Systems, Curso de Férias 2017 - Maringá
 */
package com.materasystems.curso.ferias;

/**
 * Gerador de dados
 * 
 * @author rochapaulo
 * @since 2017
 * 
 */
public class DataGenerator {

    private DataGenerator() {
        super();
    }

    public static int[] sq(int s, final int e) {
        return c(s, e, new int[e - s + 1]);
    }

    private static int[] c(int s,final int e, final int[] o) {
        if (s == e) { o[e-s] = e; return o; } 
        else { o[s-s] = s; return c(++s, e, o); }
    }
    
}
