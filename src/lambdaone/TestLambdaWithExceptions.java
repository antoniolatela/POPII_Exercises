package lambdaone;

import lambdaone.exceptions.*;
import lambdaone.sublambda.*;


public class TestLambdaWithExceptions {
    static void testLWithExceptions(IWhitExceptions i, String s) throws SringNotNullException{
        i.printS(s);
    }

    public static void main(String[] args) throws SringNotNullException {

        IWhitExceptions test = (x) -> {
            if (x == null) {throw new SringNotNullException();}
            System.out.println(x);
        };

        testLWithExceptions(test, "ariciao");

    }
}
