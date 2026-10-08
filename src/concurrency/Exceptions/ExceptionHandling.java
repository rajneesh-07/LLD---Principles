package concurrency.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
//        divide(10, 5);
//        readFile();
        takeInput();


        Calculator<Integer, Integer> calculator = new
                Calculator<>(10, 0);
        try {
            calculator.chooseOperation(3, 10, 5);
        }catch(ArithmeticException e){ // catch(ArithmeticException | NullPointerException e) --> we can handle like this also,
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
    }

    public static void divide(int a, int b) {
        System.out.println(a / b); // Arithmetic Exception --> Runtime Exception --> if "b == 0"
    }

    public static void readFile(){
        try {
            FileReader fileReader = new FileReader("SomeFileName.txt"); // FileNotFoundException --> CompileTime Exception
        } catch (FileNotFoundException e){
            System.out.println("File is not present ");
        }
    }

    public static void takeInput(){
        Scanner sc = new Scanner(System.in); // binds with the input I/O
        try {

            String str = sc.next();
            str = null;
            System.out.println(str.length());
        } catch(ArithmeticException e){
            System.out.println("String is null");
        } finally{
            // Used for cleaning up resources
            // Always executes --> no matter what, exceptions happen, handled or not
            System.out.println("Finally block executed");
            sc.close(); //cleaning up scanner resource
        }

    }
}


// Arithmetic Exception --> Runtime Exception || Unchecked Exception
// FileNotFoundException --> CompileTime Exception || Checked Exception