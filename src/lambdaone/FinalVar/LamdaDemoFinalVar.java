package lambdaone.FinalVar;

public class LamdaDemoFinalVar {
    private int  num = 10;

    private void test() {
        int num1 = 10;

        MyFunc myLambda = (n) -> {
            // This use of num is OK. It does not modify num.
            int v = num + (Integer) n;
            // However, the following is illegal because it attempts
            // to modify the value of num.
            num++;
            System.out.println(v - num);
            return v;
        };
        myLambda.getVal(9);
    }
    public static void main(String args[]) {
        // A local variable that can be captured.
        LamdaDemoFinalVar l = new LamdaDemoFinalVar();

        MyFunc myLambda = (n) -> {
            // This use of num is OK. It does not modify num.
            int v = l.num + (Integer) n;
            // However, the following is illegal because it attempts
            // to modify the value of num.
            l.num++;
            System.out.println(v - l.num);
            return v;
        };
        myLambda.getVal(7);
        l.test();
        // The following line would also cause an error, because
        // it would remove the effectively final status from num.
        //num = 9;
    }
}