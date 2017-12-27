package lambdaone.MethodReference.NonStaticMethod;

public class CallStaticMethod {
    static int callLambda(GetSquare gs, int i){
        return gs.Square(i);
    }

    public static void main(String[] args) {
        StaticMethod sm = new StaticMethod();
        System.out.println(callLambda(sm::getSquare, -7));
    }
}
