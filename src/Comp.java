import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class Comp {

    public static void main(String args[]) {
        String[] mas = new String[10];
        for (int i = 0; i < 10; i++)
            mas[i] = "" + (i * (int) ((Math.random() * 100)));
        for (String s : mas)
            System.out.println(s);
        System.out.println();
       /* Arrays.sort(mas, (String s1, String s2) -> Integer.compare(s1.length(), s2.length()));
        for (String s : mas)
            System.out.println(s);
*/
       /*HashSet s = (HashSet) Arrays.stream(mas).filter((String s1) -> s1.length() < 5).collect(Collectors.toSet());
        for (Object o : s) {
            System.out.println(o);
        }*/




        BiFunction<String, String, Integer> compareFunc = (String s1, String s2) -> Integer.compare(s1.length(), s2.length());

    }
}
