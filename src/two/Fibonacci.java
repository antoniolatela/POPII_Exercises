package two;
//1,1,2,3,5,8,13

public class Fibonacci {

    private static long [] fibArray = new long [50];

    static void getFibonacci(int x) {
        int fib = 0;
        int prev = 0;
        for (int i=0; i<=x; i++){
            if (i<=1) {
                System.out.print(i +  " ");
                prev = i;
            } else {
                prev = fib;
                fib = i-1 + prev;
                System.out.print(fib +" ");

            }
        }

    }


    public static int getNumFibonacci (int fibNum){
        if (fibNum <= 1){
            return fibNum;
        }
        else {
            fibNum = getNumFibonacci (fibNum-2)
                    + getNumFibonacci(fibNum-1);
            return fibNum;
        }
    }

    public static void fibonacci (long n){
        fibArray[0] = 1;
        fibArray[1] = 1;

    }
/*    public static long fibonacci(long n){
        long fib = 0;

        if (fibArray[(int)n] != -1) {
            return fibArray[(int)n];
        }


    return 0;
    }
*/
    public static void main(String s[]) {
    long startTime = System.currentTimeMillis();
    System.out.println("Fibonacci Series:");

/*    for (int i = 0; i<10; i++){
        System.out.print(getNumFibonacci(i) + " ");
    }
*/
        getFibonacci(25);
    long stopTime = System.currentTimeMillis();
    System.out.println("time in millisecnds: " + (stopTime-startTime));

    }
        }

