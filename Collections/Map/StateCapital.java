package Collections.Map;

import java.util.Iterator;
import java.util.Properties;

public class StateCapital {
    public static void main(String[] args) {

        Properties p = new Properties();

        p.put("Andhra Pradesh", "Amaravati");
        p.put("Telangana", "Hyderabad");
        p.put("Karnataka", "Bengaluru");

        Iterator<Object> it = p.keySet().iterator();

        while (it.hasNext()) {

            Object key = it.next();
            System.out.println(key + " -> " + p.getProperty((String) key));
        }
    }
}
