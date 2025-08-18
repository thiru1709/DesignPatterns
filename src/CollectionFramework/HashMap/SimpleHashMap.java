package CollectionFramework.HashMap;

import java.security.PublicKey;
import java.util.Objects;

public class SimpleHashMap<K,V> {

    private static class Node<K,V>{
        final K key;
        V value;
        Node<K,V> next;

        Node(K key,V value){
            this.key = key;
            this.value = value;
            this.next = null;
        }

    }

    private Node<K,V>[] buckets;
    private static final int INITIAL_CAPACITY = 16;

    public SimpleHashMap(){
        this.buckets = new Node[INITIAL_CAPACITY];
    }

    private int getBucketIndex(K key){
        return key.hashCode() & buckets.length-1;
    }

    public void put(K key, V value){
        int index = getBucketIndex(key);
        Node<K,V> existing = buckets[index];

        if(existing == null){
            buckets[index] = new Node<>(key,value);
        }else{
            Node<K,V> current = existing;
            while (true){
                if(Objects.equals(current.key,key)){
                    current.value = value;
                    return;
                }
                if(current.next == null) break;
                current = current.next;
            }
            current.next = new Node<>(key, value);
        }
    }

    public V get(K key){
        int index = getBucketIndex(key);
        Node<K,V> current = buckets[index];

        while(current!= null){
            if(Objects.equals(current.key,key)){
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    public boolean remove(K key){
        int index = getBucketIndex(key);
        Node<K,V> current = buckets[index];
        Node<K,V> prev = null;

        while (current!= null){
            if(Objects.equals(current.key,key)){
                if(prev == null){
                    buckets[index] = current.next;
                    return true;
                }
                prev.next = current.next;
                return true;
            }
            prev = current;
            current = current.next;
        }
        return false;
    }
}
