package uk.bbk.popii.firslesson;

public class HelloWorld extends FirstClass{
    private String testString;

    public static void main(String a[]){
        HelloWorld hw = new HelloWorld();
        System.out.println(hw.testString="hi world!!!!!");
        System.out.println(hw);
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
