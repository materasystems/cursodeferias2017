/*
 * MATERA Systems, Curso de Férias 2017 - Maringá
 */
package com.materasystems.curso.ferias.linkedlist;

import org.junit.Assert;
import org.junit.Test;

import com.materasystems.curso.ferias.hashtable.BetterHashTable;
import com.materasystems.curso.ferias.hashtable.HashTable;

/**
 * BetterHashTableTest
 * 
 * @author rochapaulo
 * @since 2017
 *
 */
public class BetterHashTableTest {

    @Test
    public void adicionar() {
        
        HashTable<String> hash = new BetterHashTable<>(3);
        
        hash.add("Paulo");
        hash.add("MATERA Systems");
        
        Assert.assertEquals(2, hash.size());
        Assert.assertTrue(hash.contains("Paulo"));
        Assert.assertTrue(hash.contains("MATERA Systems"));
    }
 
    @Test
    public void remover() {
        
        HashTable<String> hash = new BetterHashTable<>(3);
        
        hash.add("Paulo");
        hash.add("MATERA Systems");
        hash.remove("Paulo");
        
        Assert.assertEquals(1, hash.size());
        
        Assert.assertFalse(hash.contains("Paulo"));
        Assert.assertTrue(hash.contains("MATERA Systems"));
    }
    
    @Test
    public void hashConflict() {
        
        HashTable<String> hash = new BetterHashTable<>(2);
        
        hash.add("MATERA Systems");
        hash.add("Paulo");
        
        Assert.assertEquals(2, hash.size());
        Assert.assertTrue(hash.contains("Paulo"));
        Assert.assertTrue(hash.contains("MATERA Systems"));
        
        hash.add("Evandro");
        
        Assert.assertEquals(3, hash.size());
        Assert.assertTrue(hash.contains("Paulo"));
        Assert.assertTrue(hash.contains("Evandro"));
        Assert.assertTrue(hash.contains("MATERA Systems"));
    }
    
    @Test
    public void verifySize() {
        
        HashTable<String> hash = new BetterHashTable<>(2);
        
        Assert.assertTrue(hash.isEmpty());
        Assert.assertEquals(0, hash.size());
        
        hash.add("MATERA Systems");
        hash.add("Paulo");
        
        Assert.assertFalse(hash.isEmpty());
        Assert.assertEquals(2, hash.size());
        
        hash.remove("Paulo");
        
        Assert.assertFalse(hash.isEmpty());
        Assert.assertEquals(1, hash.size());
    }
    
    @Test
    public void contains() {
     
        HashTable<String> hash = new BetterHashTable<>(2);
        hash.add("MATERA Systems");
        hash.add("Evandro");
        
        Assert.assertFalse(hash.contains("Paulo"));
        Assert.assertTrue(hash.contains("Evandro"));
    }
    
    @Test
    public void isFull() {
     
        HashTable<String> hash = new BetterHashTable<>(2);
        
        Assert.assertFalse(hash.isFull());
        
        hash.add("MATERA Systems");
        
        Assert.assertFalse(hash.isFull());
        
        hash.add("Evandro");
        
        Assert.assertFalse(hash.isFull());
    }
    
}
