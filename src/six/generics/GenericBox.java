package six.generics;

public class GenericBox<Type> {
    public Type getT() {
        return t;
    }

    public void setT(Type t) {
        this.t = t;
    }

    private Type t;

    public static void main(String[] args) {
        GenericBox<Integer> integerGenericBox = new GenericBox<>();
        GenericBox<String> stringGenericBox = new GenericBox<>();

        integerGenericBox.setT(new Integer(1));
        stringGenericBox.setT("ant");

        System.out.println(integerGenericBox.getT());

    }


}
