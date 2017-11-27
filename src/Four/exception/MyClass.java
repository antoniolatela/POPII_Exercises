package Four.exception;

public class MyClass {
    public static void main(String[] args) throws Exception{
        try{
            method();
        } catch (Exception e ){
            System.out.println(e);
        }

    }


     private static void method() throws Exception{
        try {
            //int a = 1 / 0;
            throw new Exception("error 1");
        } catch (Exception e){
            //System.out.println("error " + e);
            throw new Exception("error 2");
        } finally {
            //System.out.println("always enter in final both in error and not error");
            throw new Exception("error 3");
        }
    }

}
