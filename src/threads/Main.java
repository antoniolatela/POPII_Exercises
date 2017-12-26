package threads;

public class Main {
    public static void main(String[] args) {
        MyThing mt = new MyThing("thread 1!", 500);
        Thread t = new Thread(mt);
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();
        //System.out.println("Main");
        Thread t2 = new Thread(new MyThing("thread 2!", 1000));
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();
        System.out.println(t2.getName());

    }
}
