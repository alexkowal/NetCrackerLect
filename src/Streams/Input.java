package Streams;

import java.io.*;
import java.util.ArrayList;

public class Input {

    public static void main(String[] args) throws IOException {
        FileInputStream fs = new FileInputStream("test.txt");
        /*ArrayList<Byte> list = new ArrayList<>();
        list.add((byte) fs.read());
        for (Byte aByte : list) {
            System.out.println(aByte);
        }
        */
        FileOutputStream os = new FileOutputStream("test.txt");
        byte[] mas = {0x48, 0x65, 0x6c, 0x6c, 0x6f};
        for (byte b : mas)
            os.write(b);
        DataOutputStream ds = new DataOutputStream(os);
        ds.writeChar('5');
    }
}