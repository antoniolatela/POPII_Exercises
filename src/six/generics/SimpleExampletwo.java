package six.generics;

import java.util.ArrayList;
import java.util.List;

public class SimpleExampletwo<x> {
    x e;

    private void test(x o){
        o.toString();
    }



    public static void main(String[] args) {
        List<Person> l = new ArrayList<>();
        l.add(new Person("a",1));

        for (Object o: l){
            System.out.println(((Person)o).getName());
        }

        for (Person o: l){
            System.out.println(o.getName());
        }


        System.out.println(l);
        printAgain(l);
        //test(l);
    }

    public static void printAgain(List<?> list){
        list.forEach(System.out::println);
    }
}
