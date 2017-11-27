package Five.inheritance;

public class C extends B{

    public C(){
        System.out.println("Cons C " + getClass());
    }

    @Override
    public String myMethod(){
        return getClass() + ">>";
    }
}
