package Four.functionexample;

import java.util.function.Function;

public class MyClass {
    public static void main(String[] args) {

        MyFunction<Integer, Long> myFunc  = new MyFunction<>();
        System.out.println("givig int return long: " + myFunc.apply(1111));
        System.out.println(myPrint("that's another output: ",  myFunc, 1));
        System.out.println(myPrint("that's another output in lambda: ",  (x ->(long)x), 1));

    }

    public static <T,R> String myPrint(String s, Function<T,R> myF, T x) {
        return s + myF.apply(x);
    }
}
