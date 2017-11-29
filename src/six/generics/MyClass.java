package six.generics;

public class MyClass<E> {
    private E e;

    public static <E> void printArray(E[] in){
        for (E y: in){
            System.out.println(y);
        }
    }

    public static void main(String[] args) {
        String[] s= {"a","b"};
        printArray(s);
    }
}
