package lambdaone.exceptions;

public class SringNotNullException extends Exception{
    private static final long serialVersionUID = 1L;

    public SringNotNullException(){
        super("Stirng could not be null.");
    }
}
