package main.java.employeeLab.exception;

public class ValidationException extends Exception {
    public ValidationException() {
        super("Salary is not acceptable");
    }

    public ValidationException(String detailedMessage){
        super(detailedMessage);
    }


}
