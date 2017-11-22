package Four.functionexample;

import java.util.function.Function;

public class MyFunction<T,R> implements Function<T,R>{

    @Override
    public R apply(T t) {
        return (R)t;
    }

}
