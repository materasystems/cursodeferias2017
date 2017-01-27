package com.materasystems.curso.ferias.dojo;

import org.junit.Assert;
import org.junit.Test;

import com.materasystems.curso.ferias.utils.StackOverflowException;
import com.materasystems.curso.ferias.utils.StackUnderflowException;

/**
 * @author rochapaulo
 * @since 2017
 *
 */
public class StackTest {

    @Test
    public void pushOneElement() {
        
        Stack stack = new Stack(1);
        stack.push(1);
        
        Assert.assertEquals(1, stack.size());
    }
    
    @Test
    public void pushFourElements() {
        
        Stack stack = new Stack(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        
        Assert.assertEquals(4, stack.size());
    }
    
    @Test
    public void emptyStack() {
        
        Stack stack = new Stack(2);
        stack.push(1);
        
        Assert.assertFalse(stack.isFull());
    }
    
    @Test(expected = StackOverflowException.class)
    public void fullStack() {
        
        Stack stack = new Stack(2);
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
    }
    
    @Test
    public void pollElement() {
        
        Stack stack = new Stack(2);
        stack.push(1);
        stack.push(5);
        
        Assert.assertEquals(2, stack.size());
        
        int top = stack.poll();
        
        Assert.assertEquals(5, top);
        Assert.assertEquals(2, stack.size());
    }
    
    @Test
    public void popElement() {
       
        Stack stack = new Stack(2);
        stack.push(1);
        stack.push(5);
        
        Assert.assertEquals(2, stack.size());
        
        int top = stack.pop();
        
        Assert.assertEquals(5, top);
        Assert.assertEquals(1, stack.size());
        
    }
    
    @Test
    public void pollPopElement() {
        
        Stack stack = new Stack(2);
        stack.push(1);
        stack.push(5);
        
        int top = stack.poll();
        Assert.assertEquals(5, top);
        
        top = stack.poll();
        Assert.assertEquals(5, top);
        
        top = stack.pop();
        Assert.assertEquals(5, top);
        
        top = stack.poll();
        Assert.assertEquals(1, top);
        
    }
    
    @Test(expected = StackUnderflowException.class)
    public void popEmptyStack() {
        
        Stack stack = new Stack(2);
        stack.push(1);
        stack.push(5);
        
        stack.pop();
        stack.pop();
        stack.pop();
    }
    
}
