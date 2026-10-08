package concurrency.StreamsAndLambdas;

 @FunctionalInterface // just for readability '@FunctionalInterface' --> Used when an interface contains only one method
 public interface Validator {
    boolean validate();

}
