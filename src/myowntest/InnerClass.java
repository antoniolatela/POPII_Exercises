package myowntest;

public class InnerClass {
    private int i;

    InnerClass(int i){
        this.i = i;
    }

    public void addOne () {
        this.i += 1;
        firstinner fi = new firstinner();
    }

    static class firstinner {
        {
            System.out.println("inner " );
        }
        static void test(){

        }
    }

}

 class exe {
     public static void main(String[] args) {
         InnerClass ic = new InnerClass(1);
         ic.addOne();
         InnerClass.firstinner.test();
     }
}