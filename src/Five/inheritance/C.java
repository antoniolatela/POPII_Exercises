package Five.inheritance;

public class C extends B{

    public C(){
//        super();//implicit constructor!
        System.out.println("Cons C " + getClass());
    }

    @Override
    public String myMethod(){
        return getClass() + ">>";
    }
}
