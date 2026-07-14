package Collections.List.program4;

import java.util.ArrayList;

public class NumberArrayList {
    public static void main(String[] args) {

        ArrayList<Number> list = new ArrayList<>();

        list.add(10);          // Integer
        list.add(25.5);        // Double
        list.add(12.8f);       // Float
        list.add(150L);        // Long
        list.add((short) 20);  // Short
        list.add((byte) 5);    // Byte

        System.out.println("Number ArrayList:");

        for (Number num : list) {
            System.out.println(num);
        }
    }
}
