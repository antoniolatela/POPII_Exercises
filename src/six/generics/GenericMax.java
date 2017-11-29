package six.generics;

public class GenericMax {

    private static <T extends Comparable<T>> T max(T x, T y, T z){

        T max = x;
        if (y.compareTo(x)>0){
            max = y;
        }
        if (z.compareTo(y)>0) {
            max=z;
        }
        return max;
    }

    public static void main(String[] args) {
        Person p1 = new Person("a",1);
        Person p2 = new Person("b",1);
        Person p3 = new Person("c",1);
        System.out.println(max(1, 2, 3));

        //System.out.println(max(p1, p2, p3));
    }
}
