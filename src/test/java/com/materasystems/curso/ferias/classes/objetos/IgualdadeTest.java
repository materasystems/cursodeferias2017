/*
 * MATERA Systems, Curso de Férias 2017 - Maringá
 */
package com.materasystems.curso.ferias.classes.objetos;

import com.materasystems.curso.ferias.objetos.Carro;
import com.materasystems.curso.ferias.objetos.Marca;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author rochapaulo
 * @since 2017
 *
 */
public class IgualdadeTest {

    @Test
    public void objetosDevemSerIguais() {

        Carro c1 = new Carro(Marca.CHEVROLET, 180);
        Carro c2 = new Carro(Marca.CHEVROLET, 180);

        Assert.assertEquals(c1, c2);
    }

    @Test
    public void objetosDevemSerDiferentes() {

        Carro c1 = new Carro(Marca.CHEVROLET, 180);
        Carro c2 = new Carro(Marca.FORD, 220);

        Assert.assertNotEquals(c1, c2);
    }

}
