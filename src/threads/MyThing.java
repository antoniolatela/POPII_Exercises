package threads;

import static java.lang.Thread.yield;

public class MyThing implements Runnable{
    private String str;
    private int del;

    public MyThing(String s, int delay){
        str = s;
        del = delay;
    }

    public void run(){
        int x = 0;
        try {
            do {
                System.out.println(str + " --- " + x++);
                Thread.sleep(del);
                yield();
            } while (x <= 10);
        } catch (InterruptedException e) {
            System.out.println(e);
        }


    }

}
