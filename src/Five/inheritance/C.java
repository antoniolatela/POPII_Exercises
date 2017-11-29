package Five.inheritance;

public class C extends B{



    private int i;


    public C(){
//        super();//implicit constructor!
        System.out.println("Cons C " + getClass());
    }

    public C(int i){
        System.out.println("Setting A!");
        setI(i);
    }

    public static String myMethod(){
        return "From C";
    }

//getter and setter below
    private int getI() {
        return i;
    }

    private void setI(int i) {
        this.i = i;
    }

/*    @Override
    public String toString() {
        return "C{" +
                "i=" + i +
                '}';
    }
*/}
