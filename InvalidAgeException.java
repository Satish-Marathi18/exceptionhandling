package exceptionhandling;

public class InvalidAgeException extends Exception{
    private String message;

    InvalidAgeException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
