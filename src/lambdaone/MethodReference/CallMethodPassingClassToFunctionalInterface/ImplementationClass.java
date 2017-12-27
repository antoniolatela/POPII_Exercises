package lambdaone.MethodReference.CallMethodPassingClassToFunctionalInterface;

public class ImplementationClass {
    String i;
    public ImplementationClass(String i){
        this.i=i;
    }
    public ImplementationClass(){

    }
    public String setSquare(ImplementationClass ic){
        return i + " -- " + ic.i;
    }
}
