/*
 * MATERA Systems, Curso de Férias 2017 - Maringá
 */
package com.materasystems.curso.ferias.linkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author rochapaulo
 * @since 2017
 *
 */
public class LinkedListTest {

    @Test
    public void empty() {
     
        LinkedList<String> list = new LinkedList<>();
        Assert.assertEquals(0, list.size());
        Assert.assertTrue(list.isEmpty());
    }
    
    @Test
    public void adicionar() {
        
        LinkedList<String> list = new LinkedList<>();
        list.add("Paulo");
        list.add("Evandro");
        list.add("MATERA Systems");

        Assert.assertEquals(3, list.size());
        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void remover() {
        
        LinkedList<String> list = new LinkedList<>();
        list.add("Paulo");
        list.add("Evandro");
        list.add("MATERA Systems");
        
        Assert.assertEquals(3, list.size());
        
        list.remove(2);
        
        Assert.assertEquals(2, list.size());
        
        Assert.assertTrue(list.contains("Evandro"));
        Assert.assertTrue(list.contains("Paulo"));
    }
    
    @Test
    public void contains() {
        
        LinkedList<String> list = new LinkedList<>();
        list.add("Paulo");
        list.add("Evandro");
        list.add("MATERA Systems");
        
        Assert.assertTrue(list.contains("Evandro"));
        Assert.assertTrue(list.contains("MATERA Systems"));
        Assert.assertTrue(list.contains("Paulo"));
        
        Assert.assertFalse(list.contains("Existo#SQN"));
    }
 
    @Test
    public void getElement() {
        
        LinkedList<String> list = new LinkedList<>();
        list.add("Paulo");
        list.add("Evandro");
        list.add("MATERA Systems");
        
        Assert.assertEquals("MATERA Systems", list.get(2));
        Assert.assertEquals("Evandro", list.get(1));
        Assert.assertEquals("Paulo", list.get(0));
    }
    
    @Test
    public void indexOfElementFound() {
        
        LinkedList<String> list = new LinkedList<>();
        list.add("Paulo");
        list.add("Evandro");
        list.add("MATERA Systems");
        
        Assert.assertEquals(1, list.indexOf("Evandro"));
    }
    
    @Test
    public void indexOfElementNotFound() {
        
        LinkedList<String> list = new LinkedList<>();
        list.add("Paulo");
        list.add("Evandro");
        list.add("MATERA Systems");
        
        Assert.assertEquals(-1, list.indexOf("Maringá"));
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void accessNegativeIndex() {
        
        LinkedList<String> list = new LinkedList<>();
        list.get(-1);
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void accessIndexHigherThanSize() {
        
        LinkedList<String> list = new LinkedList<>();
        list.add("Paulo");
        list.get(1);
    }
    
    @Test(expected = NullPointerException.class)
    public void printElementsNullStream() {
        
        LinkedList<String> list = new LinkedList<>();
        list.printElements(null);
    }
    
    @Test(expected = NullPointerException.class)
    public void containsNullReference() {
        
        LinkedList<String> list = new LinkedList<>();
        list.contains(null);
    }
    
    @Test(expected = NullPointerException.class)
    public void addNullReference() {
        
        LinkedList<String> list = new LinkedList<>();
        list.add(null);
    }
    
}
