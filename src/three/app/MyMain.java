package three.app;

import three.firstpackage.silly;
import three.spec.MyInterface;

public class MyMain {
    public static void main(String[] args) {
        MyInterface my = new silly();
        System.out.println(my.message("Hi"));

        MyInterface my2 = new three.secondpackage.silly();
        System.out.println(my2.message("Hi"));

        MyInterface my3 = new silly();
        System.out.println(my3.nothingVeryInteresting());

        my3.thing();
        System.out.println(MyInterface.aMethod());

    }
}
