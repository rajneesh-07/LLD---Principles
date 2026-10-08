package LLD_DesignPatterns.Builder.WithInnerClass;

public class InvalidNameStudentException extends RuntimeException{

    public InvalidNameStudentException(){}

    public InvalidNameStudentException(String message){
        super(message);
    }

    public InvalidNameStudentException(String message, Throwable cause){
        super(message,cause);
    }
}
