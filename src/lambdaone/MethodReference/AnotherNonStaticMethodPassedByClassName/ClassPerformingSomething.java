package lambdaone.MethodReference.AnotherNonStaticMethodPassedByClassName;

public class ClassPerformingSomething {
        private int hTemp;
        public ClassPerformingSomething(int ht) {
            hTemp = ht;
        }
        // Return true if the invoking HighTemp object has the same
        // temperature as ht2.
        public boolean sameTemp(ClassPerformingSomething ht2) {
            return hTemp == ht2.hTemp;
        }
        // Return true if the invoking HighTemp object has a temperature
        // that is less than ht2.
        public boolean lessThanTemp(ClassPerformingSomething ht2) {
            return hTemp < ht2.hTemp;
        }
    }
