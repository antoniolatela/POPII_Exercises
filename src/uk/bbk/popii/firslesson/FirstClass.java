package uk.bbk.popii.firslesson;

public class FirstClass {
    public void printa () {
        for (int i = 0; i<5; i++) {
            System.out.println(i+" Hi Ant");
        }
        if (true) System.out.println("Hi Ant Final");

        int i = 0;
        while (i < 5) {
            System.out.println(i++ +" Hi Ant");
        }
        i = 0;
        do {
            System.out.println(i++ + " Hi Ant");
        } while (i < 5);
    }

}


