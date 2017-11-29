package lambdaone;

import six.generics.Person;

import java.util.ArrayList;
import java.util.List;

public class MyLambdaTests implements MyLambdaInterface {

        public static void main(String args[]) {
            MyNumber myNum;
                            // declare an interface reference
                            // Here, the lambda expression is simply a constant expression.
                            // When it is assigned to myNum, a class instance is
                            // constructed in which the lambda expression provides an override
                            // of the getValue() method in MyNumber.
            myNum = () -> 123.45;
                            // Call getValue(), which is overridden by the previously assigned
                            // lambda expression.
            System.out.println("A fixed value: " + myNum.getValue());
                            // Here, a more complex expression is used.
            myNum = () -> Math.random() * 100;
                            // These call the lambda expression in the previous line.
            System.out.println("A random value: " + myNum.getValue());
            System.out.println("Another random value: " + myNum.getValue());
                            // A lambda expression must be compatible with the method
                            // defined by the functional interface. Therefore, this won’t work:
                            // myNum = () -> "123.03"; // Error!
            StringMan sm;
            sm = (s) -> s.length();
            String s = "hi";
            System.out.println(sm.getValue(s));
            sm = (x) -> x.length();
            testInt ti = (i) -> i%2==0;
            System.out.println(ti.getEven(123130));
            blockLambda bl;
            bl = (x) -> {
                System.out.println("...");
              return x%8;
            };
            System.out.println(bl.numFunc(123));
            myGen mg;

            mg = (x) -> {
                System.out.println(x.toString());
                Person xx = (Person)x;
                return ((Person) x).getName();
            };

            Person ss = new Person("antonius",1);
            System.out.println(mg.func2(ss));

            myGen<List> list = (x) -> {
                for(Object y : (List)x){
                    System.out.println(y += "a");
                }
            return x;
            };

            myGen<Integer> pippo = (x) -> {
                return x+x;
            };

            List l = new ArrayList();
            //l.add(ss);
            //mg.func2(l);
            System.out.println(mg.func2(1));



        }
    }





