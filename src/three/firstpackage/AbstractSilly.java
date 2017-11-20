package three.firstpackage;

import three.spec.MyInterface;

public abstract class AbstractSilly implements MyInterface {

        @Override
        public int nothingVeryInteresting() {
            return 99;
        }

        public void thing(){
            System.out.println("*******");
        }
}
