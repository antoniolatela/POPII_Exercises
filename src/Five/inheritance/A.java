package Five.inheritance;

public class A implements Base {
    @Override
    public String myString() {
        return null;
    }

    public String myMethod(){
        return getClass() + "";
    }
}
