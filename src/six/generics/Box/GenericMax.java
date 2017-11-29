package six.generics.Box;

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
        System.out.println(max(7, 5, 1));
    }
}
