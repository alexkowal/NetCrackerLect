package Generics;

public class Fruit {
    public static void main(String[] args) throws ClassNotFoundException {
        Fruit fruit = new Fruit();
        System.out.println(Class.forName("Fruit"));
    }
}
