package three.spec;

public interface MyInterface {
    String message(String s);
    int nothingVeryInteresting();
    void thing();
    //includes code usefull to Interface
    static String aMethod(){
        return "Hi!!!!";
    }

    default String somethingElse(){
        return "something else";
    }

    void other();
}
