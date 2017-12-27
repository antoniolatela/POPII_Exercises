package lambdaone.MethodReference.CallMethodPassingClassToFunctionalInterface;

public class CallingClass {
    static <T> String callMethodPassigClass(T z, FunctionalI<T> i, T j){
        return i.getValue(z, j);
    }

    public static void main(String[] args) {
        System.out.print(callMethodPassigClass(new ImplementationClass("Ciao"), ImplementationClass::setSquare, new ImplementationClass("Mondo")));
    }
}
