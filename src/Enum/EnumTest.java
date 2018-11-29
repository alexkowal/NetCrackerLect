package Enum;
interface EnumInterface {
    String getTemp();
}

public class EnumTest {

    enum Temperature implements EnumInterface {
        HOT("100"),
        COLD("-100");
        String val;

        Temperature(String s) {
            this.val = s;
        }

        @Override
        public String getTemp() {
            return val;
        }

    }


    public static void main(String[] args) {
        String s= "s1";
        String s2 = "s1";
        System.out.println();

    }
}
