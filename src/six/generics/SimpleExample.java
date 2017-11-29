package six.generics;

import java.util.ArrayList;
import java.util.List;

public class SimpleExample {
    public static void main(String[] args) {
        List l = new ArrayList(); //row datatype -> no specification on java types
        l.add(3); //auto-boxed
        l.add("xyz");
        l.add(new Person ("",2));

        for (Object o: l){
            System.out.println(o); //default toString() method
        }
    }
}
