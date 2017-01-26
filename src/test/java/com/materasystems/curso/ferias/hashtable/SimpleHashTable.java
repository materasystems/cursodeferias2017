/*
 * MATERA Systems, Curso de Férias 2017 - Maringá
 */
package com.materasystems.curso.ferias.hashtable;

/**
 * SimpleHashTable
 * 
 * @author rochapaulo
 * @since 2017
 *
 */
public class SimpleHashTable<T> implements HashTable<T> {

    private static final int DEFAULT_NUMBER_OF_BUCKETS = 10;
    private final Object[] buckets;
    private int size = 0;
    
    public SimpleHashTable() {
        this(DEFAULT_NUMBER_OF_BUCKETS);
    }
    
    public SimpleHashTable(int numberOfBuckets) {
        buckets = new Object[numberOfBuckets];
    }
    
    public void add(T value) {
        
        int bucket = Math.abs(value.hashCode() % buckets.length);
        if (buckets[bucket] == null) {
            size++;
        }
        buckets[bucket] = value;
    }
 
    public boolean contains(T value) {
        
        int bucket = value.hashCode() % buckets.length;
        return buckets[bucket] != null && buckets[bucket].equals(value);
    }
    
    public void remove(T value) {
        
        int bucket = value.hashCode() % buckets.length;
        buckets[bucket] = null;
        size--;
    }
    
    public int size() {
        return size;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == buckets.length;
    }
    
}
