package set;

import map.MyHashMap;
import map.MyMap;
import map.iterator.MapIterator;

import java.util.Arrays;
import java.util.Objects;

public class MyHashSet<E> implements MySet<E> {

    protected MyMap<E, Object> map;

    public MyHashSet() {
        this.map = new MyHashMap<>();

    }

    @Override
    public boolean add(E elem) {
        if (!contains(elem)) {
            this.map.put(elem, null);
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(E elem) {
        if (this.contains(elem)) {
            this.map.remove(elem);
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(E elem) {
        return this.map.contains(elem);
    }

    @Override
    public MySet<E> intersect(MySet<E> set) {
        MySet<Object> result = new MyHashSet<>();
        MapIterator iterator1 = (MapIterator) this.map.iterator();

        while (iterator1.hasNext()) {
            E elem = (E) iterator1.next().getKey();
            if (set.contains(elem)) {
                result.add(elem);
            }
        }

        return (MySet<E>) result;
    }

    @Override
    public MySet<E> union(MySet<E> set) {
        MySet<Object> result = new MyHashSet<>();
        MapIterator iterator1 = (MapIterator) this.map.iterator();
        MapIterator iterator2 = (MapIterator) ((MyHashSet<E>)(set)).map.iterator();

        result.add(iterator1.next().getKey());
        while (iterator1.hasNext()) {
            result.add(iterator1.next().getKey());
        }

        result.add(iterator1.next().getKey());
        while (iterator2.hasNext()) {
            result.add(iterator2.next().getKey());
        }

        return (MySet<E>) result;
    }

    @Override
    public MySet<E> diff(MySet<E> set) {
        MySet<Object> result = new MyHashSet<>();
        MapIterator iterator1 = (MapIterator) this.map.iterator();
        MapIterator iterator2 = (MapIterator) ((MyHashSet<E>)(set)).map.iterator();

        while (iterator1.hasNext()) {
            result.add(iterator1.next().getKey());
        }

        while (iterator2.hasNext()) {
            result.remove(iterator2.next().getKey());
        }

        return (MySet<E>) result;
    }

    @Override
    public String toString() {
        return map.toString();
    }
}
