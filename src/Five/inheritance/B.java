package Five.inheritance;

public class B extends A {

    public B(){
//        super();//implicit constructor!
        System.out.println("Cons B " + getClass());
    }



    public static String myMethod(){
        return "From B";
    }
}
