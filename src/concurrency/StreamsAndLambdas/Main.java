package concurrency.StreamsAndLambdas;

public class Main {
    public static void main(String[] args) {

        //Anonymous class demo
        /*
        StatusNodeValidator statusNodeValidator = new StatusNodeValidator();
        statusNodeValidator.validate();

        ReviewNodeValidator reviewNodeValidator = new ReviewNodeValidator();
        reviewNodeValidator.validate();


        // Object of the interface that is called anonymous class
        Validator statusNodeValidatorAC = new Validator() {
            public boolean validate(){
                System.out.println("Anonymous class - status node validator");
                return true;
            }
        };

        Validator reviewNodeValidatorAC = new Validator(){
          public boolean validate(){
              System.out.println("Anonymous class - review node validator");
              return true;
          }
        };

        statusNodeValidatorAC.validate();
        reviewNodeValidatorAC.validate();

         */

        // Syntax for the interface object or the anonymous class
        /*
             InterfaceName objName = new InterfaceName(){
             //Implement all methods for the interface --> Implementation of all methods are mandatory

             public void method1(){
             }

             public void method2(){
             }

             };
         */

        // Lambdas
        // Lambdas -> shorter code for anonymous class implementation, for functional interfaces

        Validator statusNodeValidatorLd = () ->{
            System.out.println("Anonymous class lambda1 - status node validator");
                    return true;
        };
        statusNodeValidatorLd.validate();

        Validator statusNodeValidatorLambda = () -> true;

        statusNodeValidatorLambda.validate();

        //1st option --> Traditional way
        SingleLineValidator singleLineValidator = new SingleLineValidator();
        singleLineValidator.validate();

        //2nd option --> Anonymous class
        Validator singleLineValidatorAc = new Validator(){
            public boolean validate(){
                return StaticValidator.validate();
            }
        };
        singleLineValidatorAc.validate();

        //3rd option --> Using Lambda
        Validator singleLineValidatorLambda = () -> StaticValidator.validate();
        singleLineValidatorLambda.validate();

        // Task -> print hello world from different thread

        //Implemented traditionaly
        HelloWorldPrinter hwp = new HelloWorldPrinter();
        Thread thread = new Thread(hwp);
        thread.start();

        // Implemented using lambda
        Runnable helloWorldPrinter = () ->
                System.out.println("Hello World : " + Thread.currentThread().getName());
        Thread thread1 = new Thread(helloWorldPrinter);
        thread1.start();


        //shorter
        Thread t2 = new Thread(() -> System.out.println("Hello World : " + Thread.currentThread().getName()));
        t2.start();
    }
}
