package Five.inheritance.Five.Exception;

import java.io.IOException;

public class MyClass {
    public static void main(String[] args) throws Exception{
        //throw new IOException();
        //throw new RuntimeException();
        try {
            throw new Exception();
        } catch (Exception e){
            throw e;
        }

    }
}
