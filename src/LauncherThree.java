import java.util.Random;

/**
 * docs!
 *
 * Javadoc
 */


public class LauncherThree {
    public static void main (String args[]){

        //System.out.println(Launcher.getIntStatic(8));
        //Launcher.main(null);
        Random r = new Random();
        for (int i = 0; i< 100; i++){
            System.out.println(r.nextInt(100));
        }
    }

}

//access modifiy Private, protected, public, "package" -> without nothing
// if private can be called only by the class
// protected can be called only by the class