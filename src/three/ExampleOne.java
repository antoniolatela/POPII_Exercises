package three;

public class ExampleOne {
    public static void main (String s[]){
        final int SILLY_NUM = 99;
        int[][] intArray = {{1,2,3,4,5},
                {2,3,4,5,6},
                {7,8,9,1,0},};

        print(intArray);
        intArray[2][0] = 99;
        for (int i=0; i<intArray.length; i++){
                for (int j=0; j<intArray[i].length; j++)
                    intArray[i][j]=SILLY_NUM;
        }

        print(intArray);

        //        System.out.println(intArray[0]);
        /*        for (int i: intArray){
            System.out.printf("%2d", i, i+1);
        }*/
    }

    private static void print(int[][] intArray){
        for (int[] i: intArray){
            for (int ii: i){
                System.out.print(ii + " ");
            }
            System.out.println();
        }
        System.out.println("---------------");

    }
}

