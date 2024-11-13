package exceptionhandling;

 class NegativeNumberException extends RuntimeException {
    private String message;

    NegativeNumberException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
