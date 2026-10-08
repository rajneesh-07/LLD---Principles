package concurrency.StreamsAndLambdas;

public class SingleLineValidator implements Validator{

    @Override
    public boolean validate(){
        return StaticValidator.validate();
    }

}
