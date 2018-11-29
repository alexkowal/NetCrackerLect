import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student {
    String name;
    int age;
    int mark;

    Student(String name, int age, int mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    private int compareTo(Student s2) {
        return Integer.compare(this.name.length(),s2.name.length());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMark() {
        return mark;
    }

    public static void main(String[] args) {
        Student[] mas = new Student[5];
        mas[0] = new Student("Petr", 20, 2);
        mas[1] = new Student("Ivan", 20, 4);
        mas[2] = new Student("Andrey", 19, 3);
        mas[3] = new Student("Ismail", 40, 5);
        mas[4] = new Student("Alexandr", 22, 5);

        ArrayList listofStudents = ((ArrayList) Stream.of(mas).sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList()));
        for (Object listofStudent : listofStudents) {
            System.out.println(listofStudent);

        }
    }

}
