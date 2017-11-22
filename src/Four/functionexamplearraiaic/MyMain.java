package Four.functionexamplearraiaic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class MyMain {

    //public static class MyComparator implements Comparator {
        //@Override

        //public int compare(Object o1, Object o2) {

        //if (o1 instanceof Integer && o2 instanceof Integer) {

        //return (Integer)o2-(Integer)o1;

        //

        //} else {

        //return 0;

        //}

        //}

        public static void main(String[] args) {
        int [] intArray = {1,2,18,4,5};
        Integer [] intArray1 = {1,2,18,4,5};

        Random r = new Random();


        for (int i=0; i<intArray.length; i++){
            intArray1[i]=(r.nextInt())%10;
        }

        Comparator mc = new MyComparator();
        printIt1(intArray1);
        Arrays.sort(intArray1, new MyComparator());
        /*Arrays.sort(intArray1, new Comparator<Integer>() {
            if (o1 instanceof Integer && o2 instanceof Integer) {
                return (Integer)o2-(Integer)o1;

            } else {
                return 0;
            }
        });*/
        printIt1(intArray1);

    }

    public static void printIt1(Integer[] intArray) {
        for (int i: intArray){
            System.out.print(i+ " ");
        }
        System.out.println();

    }
    public static void printIt(int[] intArray) {
        for (int i: intArray){
            System.out.print(i+ " ");
        }
        System.out.println();

    }

        public String getItem() {
            class Node{

            }
            return new Node().toString();
        }

}

