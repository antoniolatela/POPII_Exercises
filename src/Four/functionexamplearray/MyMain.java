package Four.functionexamplearray;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class MyMain {
    public static void main(String[] args) {
        int [] intArray = {1,2,18,4,5};
        Integer [] intArray1 = {1,2,18,4,5};

        Random r = new Random();


        for (int i=0; i<intArray.length; i++){
            intArray1[i]=(r.nextInt())%10;
        }
        //printIt(intArray);
        //Arrays.sort(intArray);
        //printIt(intArray);

        //Comparator mc = new MyComparator();
        /*printIt1(intArray1);
        Arrays.sort(intArray1, new MyComparator());
        printIt1(intArray1);
        */
        printIt1(intArray1);

        Arrays.sort(intArray1, (x,y) ->x - y);//asc order
        printIt1(intArray1);

        Arrays.sort(intArray1, (x,y) ->y - x);//desc order
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
}

