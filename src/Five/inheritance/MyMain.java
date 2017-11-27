package Five.inheritance;

public class MyMain {
    public static void main(String[] args) {
        //A is generic type
        //C is a specific type of A
        A a = new A();
        System.out.println(Base.myOtherThing());
        System.out.println(a.myThing());
        System.out.println(a.myString());
        System.out.println(a.myMethod());

    }
}
