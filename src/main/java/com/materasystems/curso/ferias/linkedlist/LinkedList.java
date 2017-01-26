/*
 * MATERA Systems, Curso de Férias 2017 - Maringá
 */
package com.materasystems.curso.ferias.linkedlist;

import java.io.PrintStream;

/**
 * LinkedList
 * 
 * @author rochapaulo
 * @since 2017
 *
 */
public class LinkedList<T> {

    /**
     * LinkedList internal structure, this is used to
     * store user data and bind each node to the next
     * making the list.
     * 
     * @author paulo
     *
     */
    private class Node {
        
        Node(T value) {
            this.value = value;
        }
        
        final T value;
        Node next;
    }
    
    private Node head;
    private Node tail;
    private int size = 0;
    
    /**
     * Add new value
     * 
     * @throws NullPointerException if the argument is null.
     * @param value
     */
    public void add(T value) {
        
        if (value == null) {
            throw new NullPointerException();
        }
        
        if (head == null) {
            head = new Node(value);
            head.next = tail;
            tail = head;
        } else {
            tail.next = new Node(value);
            tail = tail.next;
        }
        
        size++;
    }
    
    /**
     * Removes the element of index
     * 
     * @throws IndexOutOfBoundsException if index is higher then size 
     * or lesser than 0
     * @param index
     */
    public void remove(int index) {
        
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        
        if (index == 0) {

            head = head.next;
            
        } else {
            
            Node previous = null;
            Node current = head;
            while (index > 0) {
                previous = current;
                current = current.next;
                index--;
            }
            previous.next = current.next;
            
        }
        
        size--;
    }

    /**
     * Checks if contains
     * 
     * @throws NullPointerException if value is null.
     * @return
     */
    public boolean contains(T value) {
        
        if (value == null) 
            throw new NullPointerException();
        
        Node current = head;
        while (current != null) {
            if (value.equals(current.value)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    /**
     * Iterate over the list printing each value
     * to the provided stream.
     * 
     * @throws NullPointerException if stream is null.
     * @param stream
     */
    public void printElements(PrintStream stream) {

        if (stream == null) {
            throw new NullPointerException();
        }
        
        int i = 0;
        Node current = head;
        while (current != null) {
            stream.println("index: " + i + " - " + current.value);
            i++;
        }
    }
    
    /**
     * get value from index
     *   
     * @throws IndexOutOfBoundsException if index is higher then size 
     * or lesser than 0
     * @param index
     * @return
     */
    public T get(int index) {
        
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node aux = head;
        while (index > 0) {
            aux = aux.next;
            index--;
        }
        
        return aux.value;
    }
    
    /**
     * Size of the list
     * 
     * @return
     */
    public int size() {
        return size;
    }
    
    /**
     * Checks if list is empty
     * 
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }
    
    /**
     * indexOf value
     * 
     * @param value
     * @return
     */
    public int indexOf(T value) {
        
        if (value == null) 
            throw new NullPointerException();
        
        int idx = 0;
        Node current = head;
        while (current != null) {
            if (value.equals(current.value)) {
                return idx;
            }
            idx++;
            current = current.next;
        }
        return -1;
    }
    
}
