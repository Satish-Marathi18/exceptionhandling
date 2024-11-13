package exceptionhandling;

public class InsufficientFundsException extends Exception{
    private String message;

    InsufficientFundsException(String message) {
        this.message = message;
    }

    @Override 
    public String getMessage(){
        return message;
    }
}
