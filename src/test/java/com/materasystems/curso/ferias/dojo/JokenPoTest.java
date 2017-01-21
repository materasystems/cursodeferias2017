/*
 * MATERA Systems, Curso de Férias 2017 - Maringá
 */
package com.materasystems.curso.ferias.dojo;

import org.junit.Assert;
import org.junit.Test;
import static com.materasystems.curso.ferias.dojo.JokenPo.*;

/**
 * @author rochapaulo
 * @since 2017
 *
 */
public class JokenPoTest {

    @Test
    public void papelGanhaDePedra() {
        Assert.assertEquals("PAPEL", PEDRA.desafiar(PAPEL));
    }

    @Test
    public void papelPerdeDeTesoura() {
        Assert.assertEquals("TESOURA", PAPEL.desafiar(TESOURA));
    }

    @Test
    public void papelEmpataComPapel() {
        Assert.assertEquals("EMPATE", PAPEL.desafiar(PAPEL));
    }

    @Test
    public void pedraGanhaDeTesoura() {
        Assert.assertEquals("PEDRA", PEDRA.desafiar(TESOURA));
    }

    @Test
    public void pedraPerdeDePapel() {
        Assert.assertEquals("PAPEL", PEDRA.desafiar(PAPEL));
    }

    @Test
    public void pedraEmpateComPedra() {
        Assert.assertEquals("EMPATE", PEDRA.desafiar(PEDRA));
    }

    @Test
    public void tesouraGanhaDePapel() {
        Assert.assertEquals("TESOURA", TESOURA.desafiar(PAPEL));
    }

    @Test
    public void tesouraPerdeDePedra() {
        Assert.assertEquals("PEDRA", TESOURA.desafiar(PEDRA));
    }

    @Test
    public void tesouraEmpateComTesoura() {
        Assert.assertEquals("EMPATE", TESOURA.desafiar(TESOURA));
    }

}
