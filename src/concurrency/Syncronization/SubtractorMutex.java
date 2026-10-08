package concurrency.Syncronization;

import java.util.concurrent.locks.ReentrantLock;

public class SubtractorMutex implements Runnable{
    private Count count;
    private ReentrantLock mutex;

    public SubtractorMutex(Count count, ReentrantLock mutex){
        this.count = count;
        this.mutex = mutex;
     }


     // In this we use mutex above the for loop hence if in the for loop anything that
    //is only for read that also will not access parallely
//    @Override
//    public void run() {
//
//        mutex.lock();
//        for (int i = 1; i <= 10000; i++) {
//            count.val--;
//        }
//        mutex.unlock();
//    }


    // In this we use mutex inside the for loop hence if in the for loop anything that
    //is only for read that also can access parallely
    @Override
    public void run() {
        for (int i = 1; i <= 10000; i++) {
            mutex.lock();
            count.val--;
            mutex.unlock();
        }

    }
}
