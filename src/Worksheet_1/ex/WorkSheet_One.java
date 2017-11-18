package Worksheet_1.ex;
/**
 * @author: Antonio Latela
 */

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 * 2 - Using only the conditional operator, write a program that reads three integers and prints the largest. Repeat with Math.max.
 *
 * 3 - Write a program that prints the smallest and largest positive double values. Hint: Look up Math.nextUp in the Java API.
 *
 * 4 - What happens when you cast a double to an int that is larger than the largest possible int value?
 * Please note: to convert from an int to a float use (float)x, where x is defined as an int.
 *
 * 5 - Write a program that computes the factorial n! = 1 × 2 × ... × n, using BigInteger. Compute the factorial of 1000
 *
 * Write a program that reads in two integers between 0 and 4294967295,
 * stores them in int variables, and computes and displays their unsigned sum,
 * difference, product, quotient, and remainder. Do not convert them to long values.
 */


public class WorkSheet_One {
    private Scanner sc = new Scanner(System.in);

    public int getMax() {
        System.out.println("Insert 3 int separed by space or by enter:");
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();
        int max;

        if (two>one){
            if (three>two){
                max = three;
            } else {
                max = two;
            }
        } else if (one < three) {
            max = three;
        } else {
            max = one;
        }
        return max;
    }

    public int getMathMaxMax(){
        System.out.println("Insert 3 int separed by space or by enter:");
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();
        int max;
        return Math.max(Math.max(one, two), three);
    }

    public double[] getMathNextUPDown() {
        System.out.println("Insert 1 double and type enter:");
        double one = sc.nextDouble();
        double[] a = new double[]{Math.nextDown(one), Math.nextUp(one)};;
        return a;
    }

    public int double2Int() {
        System.out.println("Insert 1 double and type enter:");
        double one = sc.nextDouble();
        return (int)one;
    }

    public String Fact1000 () {
        BigInteger bi = BigInteger.valueOf(1);
        for (int i=1; i<=1000; i++){
            bi = bi.multiply(BigInteger.valueOf(i));
        }
        return bi.toString();
    }

    public void intOperations () {
        System.out.println("Insert 2 int separed by space or by enter:");
        Integer one = Integer.parseUnsignedInt(sc.next());
        Integer two = Integer.parseUnsignedInt(sc.next());

        System.out.println("Sum: " + Integer.toUnsignedLong(one+two));
        System.out.println("Dif: " + Integer.toUnsignedLong(one-two));
        System.out.println("Pro: " + Integer.toUnsignedLong(one*two));
        System.out.println("Quo: " + Integer.toUnsignedLong(one/two));
        System.out.println("Mod: " + Integer.toUnsignedLong(one%two));
    }

    public void printNotEmSubStr()    {
        System.out.println("Insert 2 int separed by space or by enter:");
        String[] e = sc.nextLine().split(" ");
        int i = 0;
        for (String s: e){
            System.out.println(++i + "->" + s);
        }
    }

    public double printB32Long() {
        HashMap<String, String> hm = new HashMap<String, String>();
        int i=10;
        for (int x = 0; x<10; x++) {
            hm.put(Integer.toString(x), Integer.toString(x));
        }
        for (char c = 'a'; c <= 'z'; c++, i++) {
            hm.put(Character.toString(c), Integer.toString(i));
        }
        String key = "";
        String rand = "";

        int numChar = Math.abs(new Random().nextInt())%35;

        for (i = 0; i < numChar; i++) {
            int random = Math.abs(new Random().nextInt())%35;
            for (HashMap.Entry<String, String> entry : hm.entrySet()) {
                if (entry.getValue().equals(String.valueOf(random))) {
                    key = entry.getKey();
                    rand += key;
                }
            }

        }
        double result = 0;

        for (i=0; i<rand.length(); i++) {
            int x = (rand.length()-1)-i;
            result += Integer.valueOf(hm.get(rand.charAt(i)+"")) * Math.pow(36, x);
        }
        System.out.println(result);

        return (result);

    }

    public String printUnicode (String s) {
        String hex = "";
        String thex = "";
        int ii = 4;
        for (int i = 0; i < s.length(); i++){
            int cInt = (int)s.charAt(i);
            if (cInt > 127){
                Int2HexOctBin one = new Int2HexOctBin();
                thex = one.int2Boh(cInt).get("0x").toString();
                while (ii>thex.length()) {
                    thex = "0"+thex;
                }
                hex += "\\u" + thex + " ";
            }
        }
        return hex;
    }


}
