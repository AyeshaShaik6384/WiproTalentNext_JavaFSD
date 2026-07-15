package Collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ContactBook {
    public static void main(String[] args) {

        HashMap<String, Integer> contacts = new HashMap<>();

        contacts.put("Rahul", 987654321);
        contacts.put("Ayesha", 912345678);
        contacts.put("John", 998877665);

        System.out.println(contacts.containsKey("Rahul"));
        System.out.println(contacts.containsValue(912345678));

        Iterator<Map.Entry<String, Integer>> it =
                contacts.entrySet().iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
