package com.F.DesignDataStructure;

// ENTRY-CLASS
class Entry<K, V> {
    K key;
    V value;
    Entry next;

    public Entry(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }
}



//DRIVE CLASS
public class HashMap<K, V> {
    private static final int INITIAL_SIZE =1<<4; // 16(DEFAULT)
    private static final int MAXIMUM_CAPACITY = 1<<30;

    Entry[] hashTable;
    public HashMap(){
        hashTable = new Entry[INITIAL_SIZE];
    }

    public HashMap(int cap){
        int tableSize = tableSizeFor(cap);
        hashTable = new Entry[tableSize];
    }

    public final int tableSizeFor(int cap){
        int n = cap-1;
        n|=n>>1;
        n|=n>>2;
        n|=n>>4;
        n|=n>>8;
        n|=n>>16;
        return (n<0)?1:(n>=MAXIMUM_CAPACITY)?MAXIMUM_CAPACITY:n+1;
    }

    public void put(K key, V value){
        int hashCode = key.hashCode()%hashTable.length;
        Entry entryNode = hashTable[hashCode];

        if(entryNode == null){
            Entry newEntryNode = new Entry(key, value);
            hashTable[hashCode] = newEntryNode;
        } else{
            Entry previousEntryNode = entryNode;
            while(entryNode != null){
                if(entryNode == key){
                    entryNode.value = value;
                    return;
                }
                previousEntryNode = entryNode;
                entryNode = entryNode.next;
            }
            Entry newEntryNode = new Entry(key, value);
            previousEntryNode.next = newEntryNode;
        }
    }

    public V get(K key) {
        int hashCode = key.hashCode()%hashTable.length;
        Entry entryNode = hashTable[hashCode];
        while (entryNode != null){
            if(entryNode.key.equals(key)){
                return (V)entryNode.value;
            }
            entryNode = entryNode.next;
        }
        return null;
    }
}



