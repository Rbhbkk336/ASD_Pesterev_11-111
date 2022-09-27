package map.iterator;

import map.MyHashMap;

public class MapIterator<K, V> implements Iterator<MyHashMap.Node<K, V>> {

    private MyHashMap.Node<K, V>[] nodes;
    private int position = 0;
    private MyHashMap.Node<K, V> cursor;

    public MapIterator(MyHashMap.Node<K, V>[] nodes) {
        this.nodes = nodes;
        this.cursor = null;
    }

    @Override
    public boolean hasNext() {
        if (cursor != null && cursor.getNext() != null) {
            return true;
        }
        else {
            int i = position;
            while (i < nodes.length) {
                if (nodes[i] != null) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    @Override
    public MyHashMap.Node<K, V> next() {
        if (cursor != null && cursor.getNext() != null) {
            MyHashMap.Node<K, V> current = cursor;
            cursor = cursor.getNext();
            return current;
        }
        else {
            while (position < nodes.length) {
                if (nodes[position] != null) {
                    cursor = nodes[position];
                    position++;
                    return cursor;
                }
                position++;
            }
            return cursor;
        }
    }
}
