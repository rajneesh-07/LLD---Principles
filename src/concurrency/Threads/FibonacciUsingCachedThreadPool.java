package concurrency.Threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class FibonacciUsingCachedThreadPool implements Callable<Integer> {

    private int n;

    private ExecutorService executorService;

    public FibonacciUsingCachedThreadPool(int n , ExecutorService executorService){
        this.n = n;
        this.executorService = executorService;
    }


    @Override
    public Integer call() throws Exception {

        System.out.println(n + " From Thread : " + Thread.currentThread().getName());
        if(n<= 1) return n;


        Future<Integer> fans1 =
                executorService.submit
                        (new FibonacciUsingCachedThreadPool(n-1, executorService));
        Future<Integer> fans2 =
                executorService.submit
                        (new FibonacciUsingCachedThreadPool(n-2, executorService));
        int ans1 = fans1.get();
        int ans2 = fans2.get();

        return ans1 + ans2;
    }
}
