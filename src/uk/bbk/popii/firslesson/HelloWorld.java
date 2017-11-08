package uk.bbk.popii.firslesson;

public class HelloWorld extends FirstClass{
    public static void main(String a[]){
        HelloWorld hw = new HelloWorld();
        hw.inherit();
        hw.printa(1);

    }

    private void inherit(){
        printa();
    }

    protected void printa(int i){
        System.out.println("Hello World!");
    }
}
