import map.MyHashMap;
import map.MyMap;
import set.MyHashSet;
import set.MySet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создан новый ассоциативный массив");
        MyMap<String, Integer> classes = new MyHashMap<>();
        classes.put("class1", 16);
        classes.put("class1", 14);
        classes.put("class2", 20);
        System.out.println("Добавлен новый класс (class1): " + classes.get("class1"));
        System.out.println("Добавлен новый класс (class2): " + classes.get("class2"));
//        System.out.println(classes.get("class3")); throws Exception
//        classes.remove("class3"); throws Exception
        System.out.println("Удален класс (class1); Значение = " + classes.remove("class1"));
        System.out.println("Итоговый ассоциативный массив = " + classes);
        System.out.println("Ассоциативный массив содержит class1: " + classes.contains("class1"));
        System.out.println("Ассоциативный массив содержит class2: " + classes.contains("class2"));

        System.out.println();
        System.out.println("Создано новое множество");
        MySet<String> classes1 = new MyHashSet<>();
        System.out.println("Добавлен новый класс (class1) = " + classes1.add("class1"));
        System.out.println("Добавлен новый класс (class2) = " + classes1.add("class2"));
        System.out.println("Добавлен новый класс (class2) = " + classes1.add("class2"));
        System.out.println("Удален класс (class1) = " + classes1.remove("class1"));
        System.out.println("Удален класс (class3) = " + classes1.remove("class3"));
        System.out.println("Итоговое множество = " + classes1);
        System.out.println("Множество содержит class1: " + classes1.contains("class1"));
        System.out.println("Множество содержит class2: " + classes1.contains("class2"));

        MySet<String> classes2 = new MyHashSet<>();
        classes2.add("class1");
        classes2.add("class2");
        System.out.println("Создано новое множество class2 = " + classes2);
        System.out.println("Разница class1 и class2: " + classes1.diff(classes2));
        System.out.println("Объединение class1 и class2: " + classes1.union(classes2));
        System.out.println("Пересечение class1 и class2: " + classes1.intersect(classes2));
    }
}
