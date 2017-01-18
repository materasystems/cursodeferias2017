/*
 * MATERA Systems, Curso de Férias 2017 - Maringá
 */
package com.materasystems.curso.ferias.util;

import java.util.Arrays;

/**
 * Gerador de dados
 * 
 * @author rochapaulo
 * @since 2017
 * 
 */
public class Expectations {

    private Expectations() {
        super();
    }

    public static int[] sq(int s, final int e) {
        int offset = e % (e - s);
        return c(s, e, new int[e - s + 1], offset > 0 ? offset : s);
    }

    private static int[] c(int s,final int e, final int[] o, final int offset) {
        if (s == e) { o[e-offset] = e; return o; }
        else { o[s-offset] = s; return c(++s, e, o, offset); }
    }
    
    public static int pa(int nsimo) {
        return ((1 + nsimo) * nsimo) / 2;
    }

}
