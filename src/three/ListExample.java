package three;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List l = new ArrayList();
        for(int i=1; i<=5; i++){
            l.add(i);
        }
        System.out.println(l);
    }
}
