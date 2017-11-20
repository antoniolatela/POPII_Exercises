package three.secondpackage;

import three.spec.MyInterface;

public class silly implements MyInterface{
    @Override
    public String message(String s) {
        return "Second " + s;
    }

    @Override
    public int nothingVeryInteresting() {
        return 99;
    }

    @Override
    public void thing() {

    }

    @Override
    public void other() {

    }

}
