package concurrency.StreamsAndLambdas;

public class StatusNodeValidator implements Validator{

    @Override
    public boolean validate(){
        System.out.println("Validating status node");
        return true;

    }
}
