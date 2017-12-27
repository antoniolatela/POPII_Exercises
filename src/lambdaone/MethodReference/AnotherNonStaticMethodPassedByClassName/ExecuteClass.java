package lambdaone.MethodReference.AnotherNonStaticMethodPassedByClassName;

    public class ExecuteClass {
        // A method that returns the number of occurences
        // of an object for which some criteria, as specified by
        // the MyFunc parameter, is true.
         <T> int counter(T[] vals, ILambdaMethod<T> f, T v) {
            int count = 0;
            for (int i = 0; i < vals.length; i++)
                if (f.func(vals[i], v))
             count++;
            return count;
        }
        public static void main(String args[]) {
            int count;
            // Create an array of HighTemp objects.
            ClassPerformingSomething[] weekDayHighs = { new ClassPerformingSomething(89), new ClassPerformingSomething(82),
                    new ClassPerformingSomething(90), new ClassPerformingSomething(89), new ClassPerformingSomething(89),
                    new ClassPerformingSomething(91), new ClassPerformingSomething(84), new ClassPerformingSomething(83) };
            // Use counter() with arrays of the class HighTemp.
            // Notice that a reference to the instance method
            // sameTemp() is passed as the second argument.
            ExecuteClass e = new ExecuteClass();
            count = e.counter(weekDayHighs, ClassPerformingSomething::sameTemp, new ClassPerformingSomething(89));

            System.out.println(count + " days had a high of 89");
            // Now, create and use another array of HighTemp objects.
        }
    }

