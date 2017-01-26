/*
 * MATERA Systems, Curso de Férias 2017 - Maringá
 */
package com.materasystems.curso.ferias.hashtable;

/**
 * HashTable
 * 
 * @author rochapaulo
 * @since 2017
 *
 */
public interface HashTable<T> {

    void add(T value);
    void remove(T value);
    boolean contains(T value);
    int size();
    boolean isEmpty();
    boolean isFull();
    
}
