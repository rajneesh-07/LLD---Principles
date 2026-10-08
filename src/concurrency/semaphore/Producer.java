package concurrency.semaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{

    private Queue<Shirt> store;
    private String name;
    private int maxSize;
    private Semaphore semaProducer;
    private Semaphore semaConsumer;

    public Producer(Queue<Shirt> store, String name,int maxtSize,Semaphore semaProducer,
                    Semaphore semaConsumer) {
        this.maxSize = maxtSize;
        this.store = store;
        this.name = name;
        this.semaProducer = semaProducer;
        this.semaConsumer = semaConsumer;

    }

    public void run(){
        while(true){
            try {
                semaProducer.acquire(); // Decreases the keys for producers
                System.out.println("Current size : " + store.size() +
                        ", added by Producer : " + name);
                store.add(new Shirt());
                semaConsumer.release(); // increases the number of keys for consumers

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
