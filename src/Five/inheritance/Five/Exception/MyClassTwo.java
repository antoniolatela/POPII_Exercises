package Five.inheritance.Five.Exception;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MyClassTwo {
    public static void main(String[] args) {

        try (Scanner c = new Scanner(System.in);) {
        try {
            System.out.print("insert: ");
            System.out.println("---> " + c.nextInt());
        } catch (Throwable e) {
            System.out.println("-> " + e);
        }}
        finally {
            System.out.println("Hi!");
        }
    }
}
