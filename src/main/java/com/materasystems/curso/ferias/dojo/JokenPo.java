/*
 * MATERA Systems, Curso de Férias 2017 - Maringá
 */
package com.materasystems.curso.ferias.dojo;

/**
 * @author rochapaulo
 * @since 2017
 *
 */
public enum JokenPo {

    PEDRA   { @Override JokenPo getVencedor() { return PAPEL;   } },
    PAPEL   { @Override JokenPo getVencedor() { return TESOURA; } },
    TESOURA { @Override JokenPo getVencedor() { return PEDRA;   } };

    private static final String EMPATE = "EMPATE";

    public String desafiar(JokenPo jogada) {
        return (equals(jogada)) ? EMPATE : (jogada.equals(getVencedor())) ? jogada.toString() : toString();
    }

    abstract JokenPo getVencedor();

}