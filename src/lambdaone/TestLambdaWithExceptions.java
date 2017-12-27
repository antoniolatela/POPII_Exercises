package lambdaone;

import lambdaone.exceptions.*;
import lambdaone.sublambda.*;


public class TestLambdaWithExceptions {
    private int testLWithExceptions(IWhitExceptions i, String s) throws SringNotNullException{
        return i.printS(s);
    }

    public static void main(String[] args) throws SringNotNullException {

        IWhitExceptions test = (x) -> {
            if (x == null) {throw new SringNotNullException();}
            return 1;
        };
        TestLambdaWithExceptions t = new TestLambdaWithExceptions();
        System.out.println(t.testLWithExceptions(test, "ariciao"));

    }
}
