package concurrency.UpDownCasting;

public class SmartTv extends TV{

    public void brightness(){
        System.out.println("Adjust brightness automatically");
    }

    @Override
    public void volume(){
        System.out.println("Adjust volume smartly");
    }
}
