package lambdaone.MethodReference.StaticMethod;

public class CallStaticMethod {
    static int callLambda(GetSquare gs, int i){
        return gs.Square(i);
    }

    public static void main(String[] args) {
        System.out.println(callLambda(StaticMethod::getSquare, -7));
    }
}
