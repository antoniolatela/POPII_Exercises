package Five.inheritance;

public class B extends A {
    @Override
    public String myMethod(){
        return getClass() + ">";
    }
}
