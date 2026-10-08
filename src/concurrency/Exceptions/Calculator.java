package concurrency.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Calculator<X,Y>{

    private X x;
    private Y y;

    public Calculator(X x, Y y) {
        this.x = x;
        this.y = y;
    }

    public void chooseOperation(int operationType , int a, int b) throws FileNotFoundException, InterruptedException{
        if(operationType == 1){
            divide(a,b);
        }
        else if(operationType == 2 ) {
            add(a, b);
        }
        else{
            throw new CalculatorException("Invalid operation type");
        }
    }

//    Calculator booleanCal = new Calculator(true,true); // Raw data types --> backward compatibility --> NOT RECOMMENDED

    public void print(X x, Y y){
        System.out.println(x);
        System.out.println(y);
    }

    public void printX(X x){
        System.out.println(x);
    }
    public void printY(Y y) {
        System.out.println(y);
    }


        // For exception

        public void add(int a, int b){
            System.out.println("Entered in add method");
            System.out.println(a+b);
            System.out.println("Exit from add method");
        }

        // Divide method without exception handling
    /*
    public void divide(int a , int b){
        System.out.println("Entered Divide method");
        System.out.println(a/b);
        System.out.println("Exit Divide method");
    }

     */

        // Divide method with try catch block --> handling exception inside the methode
    /*
        public void divide(int a , int b){
            System.out.println("Entered Divide method");
            try {
                System.out.println(a / b);
//                String str = null; // NullPointerException
                String str = "Something";
                str.length();
                int[] arr = new int[3];
                arr[3] = 2; // ArrayIndexOutOfBound exception will happen
            } catch(ArithmeticException e){ // catch(ArithmeticException | NullPointerException e) --> we can handle like this also,
                // but in this for any exception same message will be print
                System.out.println("Divide by zero");
                e.printStackTrace();
                System.out.println(e.getMessage());
            }catch(NullPointerException e){
                System.out.println("String is null");
                e.printStackTrace();
                System.out.println(e.getMessage());
            }catch(Exception e){  // Default exception --> if we do not know which type of exception can happen then it will handle that
                // ## This exception should not on the top, bcs every exception will match with this
                System.out.println("Something went wrong");
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
            System.out.println("Exit Divide method");
        }

     */
            // here, just 'throws Exception' can do the job but mentioning the specific exceptions is better for readability
            public void divide(int a, int b) throws FileNotFoundException, InterruptedException { // for compile time exception,
                // if here throws is used then it have to used where from method is called
                System.out.println(a/b); //Arithmetic Exception --> Runtime exception --> no need for any keyword for throwing exception upwards
                FileReader fileReader = new FileReader("someFileName");// FileNotFound exception --> Compile time exception --> using 'throws' to propagate exception upwards is mandatory
                Thread.sleep(100);
            }

            // Runtime exception --> exception propagated upwards automatically --> IMPLICIT
            // Compiletime ecxeption --> either handle with try/catch or propagate upwards using "throws" --> EXPLICIT
        // ClassName objName = new ClassName();
        //---> new ClassName(); --> supported for generics ---> NOT RECOMMENDED
        //---> new CalssName<>(); --> supported for generics ---> RECOMMENDED

    // try --> Inside try block we put the code that can throw an exception
    // catch block --> try to add the possible exception that could be thrown inside the try block
    // catch block --> we put the code that can help us debug our exception easily
    // try will always be present either with 'catch' and 'finally'

}
