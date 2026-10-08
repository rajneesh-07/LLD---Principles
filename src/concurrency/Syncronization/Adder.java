package concurrency.Syncronization;

public class Adder implements Runnable{

    private Count count;

    public Adder(Count count){
        this.count = count;
    }

    public void run(){
//        int ad = 0;

        for(int i = 1; i<=10000; i++){
//            System.out.println("Entered in the add method with thread : "+ Thread.currentThread().getName());
            count.val++;
//            ad++;
        }
//        System.out.println("Add : " + ad);
    }
}
