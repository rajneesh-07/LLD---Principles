package concurrency.basic;

public class Main {
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        System.out.println("Hello world from thread : " +
                Thread.currentThread().getName());

        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread t = new Thread(helloWorldPrinter);
        t.start();

        for(int i = 1; i<=100; i++){
            NumberPrinter np = new NumberPrinter(i);
            Thread th = new Thread(np);  // creation of thread
            th.start();
        }
    }
}

// java by default  -> single threaded -> that is "main thread"

// print Hello World from a different thread -> instead main

//creat class for the task
// implement runnable interface in the class
// implement your task inside the run() method

// Execution
//create an object of the task class
//using task class object you crate a thread
//start the thread


// print 1 - 100, each with a different thread
//