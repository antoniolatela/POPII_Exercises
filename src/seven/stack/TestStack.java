package seven.stack;

import seven.stack.Stack;
import seven.stack.arraylistimpl.*;


public class TestStack {
    public static void main(String[] args) {
        Stack<String> stack = new StackImpl();
        String s = "hi";

        stack.push(s);
        if (stack.isEmpty()){
            System.out.println("empty");
        }

        stack = new StackImpl<>();

        if (!s.equals((stack.pop()))) {
            System.out.println("Empty ");
        }

        stack = new StackImpl<>();
        try {
            stack.pop();
            System.out.println("ok");
        } catch (Exception e){

        }

    }
}
