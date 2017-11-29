package lambdaone;

public interface MyLambdaInterface {
    interface MyNumber {
        double getValue();
    }

    interface StringMan {
        int getValue(String s);
    }

    interface testInt {
        boolean getEven(int i);
    }

    interface blockLambda {
        int numFunc(int i);
    }

    interface myGen<T> {
        //void func1(T t);
        T func2(T t);
    }

}
