package Four.pradicateexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MyClass {

    static void test (int i){
        System.out.print(i + " ");
    }

    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();

        lst.add(1);        lst.add(2);        lst.add(3);

/*        for (Integer i: lst){
            System.out.print(i + " ");
        }
        System.out.println();
        lst.forEach(x-> System.out.print(x + " "));
        System.out.println();
*/
        lst.forEach(x -> test(x));

        lst.forEach(System.out::print);
        lst.removeIf(x -> x == 2);
        System.out.println();
        lst.removeIf(x -> x % 2 == 0);

        lst.forEach(System.out::print);




    }
}
