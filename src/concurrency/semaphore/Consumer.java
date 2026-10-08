package concurrency.semaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{

    private Queue<Shirt> store;
    private String name;
    private Semaphore semaProducer;
    private Semaphore semaConsumer;

    public Consumer(Queue<Shirt> store, String name,Semaphore semaProducer,
                    Semaphore semaConsumer) {

        this.store = store;
        this.name = name;
        this.semaProducer = semaProducer;
        this.semaConsumer = semaConsumer;
    }

//    public void run(){
//        while(true){
//            System.out.println("Current size : " + store.size() +
//                    ", removed by Consumer : " + name);
//            if(store.size() > 0){
//                store.remove();
//            }
//        }

    public void run(){
        while(true){
            try {
                semaConsumer.acquire(); // Decreases the keys for consumers
                System.out.println("Current size : " + store.size() +
                        ", removed by Consumer : " + name);
                store.remove(); // Increases the keys for producers
                semaProducer.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
