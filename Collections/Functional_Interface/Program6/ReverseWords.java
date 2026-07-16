package Collections.Functional_Interface.Program6;
import java.util.*;
import java.util.function.Consumer;
public class ReverseWords {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(
                Arrays.asList("Java","Python","C","Spring","HTML",
                        "CSS","React","SQL","Git","Docker"));

        Consumer<ArrayList<String>> c = l -> {
            for(int i=0;i<l.size();i++)
                l.set(i,new StringBuilder(l.get(i)).reverse().toString());
        };

        c.accept(list);

        System.out.println(list);
    }
}
