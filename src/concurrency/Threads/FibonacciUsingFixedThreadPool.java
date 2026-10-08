package concurrency.Threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FibonacciUsingFixedThreadPool implements Callable<Integer> {


    private int n;

    public FibonacciUsingFixedThreadPool(int n){

        this.n = n;

    }
//    public int fib(int n){
//        if(n <= 1){
//            return n;
//        }
//        return fib(n-1) + fib(n-2);
//    }
    @Override
    public Integer call() throws Exception {
        System.out.println(n + "From thread "+ Thread.currentThread().getName());
        if (n <= 1) return n;
        ExecutorService executorService =
                Executors.newFixedThreadPool(2);

        Future< Integer> ans1 = executorService.submit(new FibonacciUsingFixedThreadPool(n-1));
        Future <Integer> ans2 = executorService.submit(new FibonacciUsingFixedThreadPool(n-2));

        int a = ans1.get();
        int b = ans2.get();

        return a+b ;
    }
    }
