package three;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList();
        for(int i=1; i<=5; i++){
            l.add(i);
        }

        //Integer i = 0;
        System.out.println(l);
        System.out.println(l.size());

        for (Integer i: l){
            System.out.print(i);
        }
    }
}
