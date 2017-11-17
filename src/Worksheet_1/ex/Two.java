package Worksheet_1.ex;

import java.util.Scanner;

/**
 * Using only the conditional operator, write a program that reads three integers and prints the largest. Repeat with Math.max.
 */

public class Two {
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


}
