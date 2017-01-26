/*
 * MATERA Systems, Curso de Férias 2017 - Maringá
 */
package com.materasystems.curso.ferias.hashtable;

import com.materasystems.curso.ferias.linkedlist.LinkedList;

/**
 * BetterHashTable
 * 
 * @author rochapaulo
 * @since 2017
 *
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public class BetterHashTable<T> implements HashTable<T> {

    private static final int DEFAULT_NUMBER_OF_BUCKETS = 10;
    private LinkedList[] buckets;
    private int size;
    
    public BetterHashTable() {
        this(DEFAULT_NUMBER_OF_BUCKETS);
    }
    
    public BetterHashTable(int numberOfBuckets) {
        buckets = new LinkedList[numberOfBuckets];
    }
    
    public void add(T value) {
        
        int index = value.hashCode() % buckets.length;
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }
        buckets[index].add(value);
        size++;
    }

    public void remove(T value) {
        
        final int index = value.hashCode() % buckets.length;
        LinkedList<T> bucketValues = (LinkedList<T>) buckets[index];
        
        final int deleteIndex = bucketValues.indexOf(value);
        bucketValues.remove(deleteIndex);
        size--;
    }

    public boolean contains(T value) {
        
        final int index = value.hashCode() % buckets.length;
        return buckets[index] != null && buckets[index].contains(value);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return false;
    }
    
}
