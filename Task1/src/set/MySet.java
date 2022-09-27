package set;

public interface MySet<E> {

    boolean add(E elem);
    boolean remove(E elem);
    boolean contains(E elem);
    MySet<E> intersect(MySet<E> set);
    MySet<E> union(MySet<E> set);
    MySet<E> diff(MySet<E> set);
}