package Five.inheritance;

public interface Base {
    final static String THING = "hi";

    String myString();

    default String myThing() { return THING;}

    static String myOtherThing(){return THING+THING;}
}
