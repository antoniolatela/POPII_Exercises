
package three.firstpackage;

import three.spec.MyInterface;

public class silly extends AbstractSilly implements MyInterface {
    @Override
    public String message(String s) {
        return "First " +s;
    }

    @Override
    public void other() {

    }
/*    @Override
    public void thing(){
        System.out.println("------");
    }
*/
}
