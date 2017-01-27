/*
 * MATERA Systems, Curso de Férias 2017 - Maringá
 */
package com.materasystems.curso.ferias.dojo;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author rochapaulo
 * @since 2017
 *
 */
public class WordCounterTest {

    @Test
    public void shouldNotCountWhiteSpaces() {
        
        WordCounter counter = new WordCounter("");

        Assert.assertEquals(0, counter.uniqueWords());
        Assert.assertEquals(0, counter.totalWorlds());
        Assert.assertTrue(counter.aggregateByWord().isEmpty());
    }
    
}
