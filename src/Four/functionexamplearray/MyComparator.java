package Four.functionexamplearray;

import java.util.Comparator;

public class MyComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Integer && o2 instanceof Integer) {
            return (Integer)o2-(Integer)o1;

        } else {
            return 0;
        }
    }
}
