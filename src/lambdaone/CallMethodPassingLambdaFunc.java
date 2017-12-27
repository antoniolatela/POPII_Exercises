package lambdaone;

import lambdaone.sublambda.*;

public class CallMethodPassingLambdaFunc {
    static void printStr (YetAnotherl2 y, String s){
        System.out.println(y.test2(s));
    }

    public static void main(String[] args) {
        YetAnotherl2 y = (x) -> "Here I'm -> " + x;
        printStr(y, "anto");
        printStr((x) ->  {
            System.out.println("inside method signature");
            return x;}, "anto");
    }
}
