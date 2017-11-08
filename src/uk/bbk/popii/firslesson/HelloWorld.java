package uk.bbk.popii.firslesson;

public class HelloWorld extends FirstClass{
    public static void main(String a[]){
        HelloWorld hw = new HelloWorld();
        //hw.inherit();
        hw.printa(1);

    }

    public void inherit(){
        printa();
    }

    public void printa(int i){
        System.out.println("Hello World!");
    }
}
