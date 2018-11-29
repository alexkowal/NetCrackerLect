package Generics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MyClass {
    public static void main(String[] args) {
        System.out.println(new ArrayList<String>().getClass() == new ArrayList<Integer>().getClass());

    }
}


class Storage<T> {
    T t;

    public T get() {
        return t;
    }

    Storage(T type) {
        this.t = type;
    }
}