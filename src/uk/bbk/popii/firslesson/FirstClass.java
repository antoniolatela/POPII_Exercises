package uk.bbk.popii.firslesson;

public class FirstClass {
    public void printa () {
        for (int i = 0; i<100; i++) {
            System.out.println(i+" Hi Ant");
        }
    }
    public static void main(String a[]){
        FirstClass fc = new FirstClass();
        fc.printa();
    }
}


