package concurrency.Syncronization;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        // For synchronization Problem
        /*
        Count count = new Count(0);
        Adder add = new Adder(count);
        Subtractor subtract = new Subtractor(count);

        Thread addThread = new Thread(add);
        Thread subtractThread = new Thread(subtract);

        addThread.start();
        subtractThread.start();

        addThread.join();// makes the main thread wait until the thread does not complete
        subtractThread.join();

        System.out.println("Count : "+ count.val);

         */

        // Synchronization solution using mutex
        /*
        ReentrantLock mutex = new ReentrantLock();
        Count countmutex = new Count(0);
        AdderMutex adderMutex = new AdderMutex(countmutex, mutex);
        SubtractorMutex subtractorMutex = new SubtractorMutex(countmutex,mutex);

        Thread addThreadmutex = new Thread(adderMutex);
        Thread subtractThreadmutex = new Thread(subtractorMutex);

        addThreadmutex.start();
        subtractThreadmutex.start();

        addThreadmutex.join();// makes the main thread wait until the thread does not complete
        subtractThreadmutex.join();

        System.out.println("Count : "+ countmutex.val);

         */

        // synchronization solution using synchronization keyword
        /*
        Count countSync = new Count(0);
        AdderSync adderSync = new AdderSync(countSync);
        SubtractorSync subtractorSync = new SubtractorSync(countSync);

        Thread addThreadSync = new Thread(adderSync);
        Thread subtractThreadSync = new Thread(subtractorSync);

        addThreadSync.start();
        subtractThreadSync.start();

        addThreadSync.join();// makes the main thread wait until the thread does not complete
        subtractThreadSync.join();

        System.out.println("Count : "+ countSync.val);

         */

        AtomicInteger count = new AtomicInteger(0);
        AdderAtomicInteger adderAtomicInteger = new AdderAtomicInteger(count);
        SubtractorAtomicInteger subtractorAtomicInteger = new SubtractorAtomicInteger(count);

        Thread t1 = new Thread(adderAtomicInteger);
        Thread t2 = new Thread(subtractorAtomicInteger);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count : " + count);

    }
}
