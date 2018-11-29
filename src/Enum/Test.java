package Enum;
interface Temperable {
    int getTemp();
}

public class Test {

    enum Temp implements Temperable {
        COLD(-10),
        WARM(10),
        HOT(20);

        int value;

        Temp(int value) {
            System.out.println("enum created");
            this.value = value;
        }

        @Override
        public int getTemp() {
            return value;
        }

    }

    public static void main(String[] args) {
        Temperable t = Temp.valueOf("HOT");
        System.out.println(t.getTemp());

    }
}
