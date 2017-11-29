package Five.inheritance;

import three.spec.MyInterface;

/**
 * @author Ant
 */

public class MyMain {
    public static void main(String[] args) {
        //A is generic type
        //C is a specific type of A
        A a = new C(11);
        //System.out.println(Base.myOtherThing());
        //System.out.println(((A)a).myThing());
        //System.out.println(((B)a).myString());
        //System.out.println(a.myMethod());
        //A b = new B();

        //System.out.println(b.myMethod());//Dynamic dispatch because the method is static -> managed as function!
        System.out.println(a); //call all constructor of all classes up to A()
        //MyMain mm = new MyMain();
        //System.out.println(mm);

    }
}
