

package lambdaone;

public class LambdaDemo {
    public static void main(String args[]) {
// A lambda expression that tests if a number is even.
        YetAntherI isEven = (n) -> (n % 2) == 0;
        if (isEven.test(10))
            System.out.println("10 is even");
        if (!isEven.test(9))
            System.out.println("9 is not even");
// Now, use a lambda expression that tests if a number
// is non-negative.
        YetAntherI isNonNeg = (n) -> n >= 0;
        if (isNonNeg.test(1))
            System.out.println("1 is non-negative");
        if (!isNonNeg.test(-1))
            System.out.println("-1 is negative");
        //int x = ()->1;
    }
}