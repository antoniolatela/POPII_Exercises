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

    public static void main(String[] args) {
        List<Integer> intSeq = Arrays.asList(1,2,3,4);

        for (int i: intSeq){
            System.out.println(i);
        }
    }
}
