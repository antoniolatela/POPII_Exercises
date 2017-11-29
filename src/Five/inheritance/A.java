package Five.inheritance;

public class A implements Base {

    public A(){
//        super(); //implicit constructor!
        System.out.println("Cons A " + getClass());
    }

    @Override
    public String myString() {
        return null;
    }

    public static String myMethod(){
        return "From A";
    }
}
