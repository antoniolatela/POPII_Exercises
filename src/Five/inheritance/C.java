package Five.inheritance;

public class C extends B{
    @Override
    public String myMethod(){
        return getClass() + ">>";
    }
}
