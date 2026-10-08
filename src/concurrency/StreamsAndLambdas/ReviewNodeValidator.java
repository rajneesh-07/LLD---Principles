package concurrency.StreamsAndLambdas;

public class ReviewNodeValidator implements Validator{

    @Override
    public boolean validate(){
        System.out.println("Review node validator");
        return true;

    }
}
