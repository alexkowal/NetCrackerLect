public class Count implements Cloneable {
    int n;

    Count(int i) {
        this.n = i;
    }

    public static void main(String args[]) throws CloneNotSupportedException {

        Integer n = 5;
        Integer n1 = 5;
        Count count1 = new Count(2);

        Count count2 = (Count) (count1.clone());

        System.out.println(count1.hashCode() + " " + count2.hashCode());

        System.out.println(count1.equals(count2));


    }

    @Override
    public String toString() {
        return "Count{" +
                "n=" + n +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}