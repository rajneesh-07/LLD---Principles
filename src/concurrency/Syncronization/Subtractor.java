package concurrency.Syncronization;

public class Subtractor implements Runnable{

    private Count count;

    public Subtractor(Count count){
        this.count = count;
    }

    @Override
    public void run() {
//        int sub = 0;
        for (int i = 1; i <= 10000; i++) {
//            System.out.println("Entered in the sub method with thread : "+ Thread.currentThread().getName());

            count.val--;
//            sub++;
        }
//        System.out.println("Subtaract : " + sub);
    }
}
