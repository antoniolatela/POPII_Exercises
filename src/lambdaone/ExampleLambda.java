package lambdaone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleLambda {
    /**
     *         (x, y) -> {†return x + y};
                x -> x * x;
                () -> operation...;
     *s
     */
    private static final int var = 10;
    public static void main(String[] args) {
        List<Integer> intSeq = Arrays.asList(1,2,3,4);


        intSeq.forEach(x-> System.out.println(x));//Lambda an anonmous function

        intSeq.forEach(System.out::println);//method reference

        int test = 10;
        intSeq.forEach(((Integer x)->{
            int y = x += 2 + test * var; //local variable capture and static variable
            System.out.println(y);
        }));

        //intSeq.forEach();
        //Classname::staticmethod
        //Classname::new
        //Classname::methodname
        //Classname instanceMethod

        for (int i: intSeq){
//            print(i);
        }
    }

    private static void print (Integer i){
        System.out.println(i);
    }
}
