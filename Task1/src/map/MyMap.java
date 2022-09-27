package map;

import map.iterator.Iterator;

public interface MyMap<K, V> {

    V put(K key, V value);
    V remove(K key);
    V get(K key);
    boolean contains(K key);
    Iterator iterator();
}