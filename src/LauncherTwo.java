/**
 * docs!
 *
 * Javadoc
 */


public class LauncherTwo {
    public static void main (String args[]){

        //System.out.println(Launcher.getIntStatic(8));
        //Launcher.main(null);

        Launcher louncher = new Launcher();
        System.out.println(louncher.getIntNonStatic(2));
    }

}

//access modifiy Private, protected, public, "package" -> without nothing
// if private can be called only by the class
// protected can be called only by the class