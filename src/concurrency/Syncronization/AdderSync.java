package concurrency.Syncronization;

public class AdderSync implements Runnable{

    private Count count;

    public AdderSync(Count count) {
        this.count = count;
    }


    // We can use synchronized as method or some block of code
    // This is for method

    /*
    @Override
    public synchronized void run(){
        for(int i = 1; i<=10000; i++){
            count.val++;
        }
    }

     */

    // We can use synchronized as method or some block of code
    // This is for block of code
    @Override
    public synchronized void run(){
        for(int i = 1; i<=10000; i++){
            synchronized (count){
            count.val++;
                }
        }
    }
}
