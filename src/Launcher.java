
/**
 * docs!
 *
 * Javadoc
 */


public class Launcher {
    final static int co = 10;

    public static void main (String args[]){
        Student s = new Student(); //calling implicit consturctor

        Student s1 = new Student(12, "antnio");
        System.out.println(co);
        System.out.println(s); //toString is overrided
        System.out.println(s1); //also this one override toString method

    }
    public static int getIntStatic(int i){
        return i+1;
    }

    public int getIntNonStatic(int i){
         return i+1;
     }
}
//access modifiy Private, protected, public, "package" -> without nothing
// if private can be called only by the class
// protected can be called only by the class
// https://docs.oracle.com/javase/9/docs/api/java/lang/Object.html#toString--