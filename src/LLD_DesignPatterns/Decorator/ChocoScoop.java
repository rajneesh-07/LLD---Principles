package LLD_DesignPatterns.Decorator;

public class ChocoScoop implements IceCream{
        private IceCream iceCream;
        private ChocoScoop chocoScoop;
    public ChocoScoop(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        return iceCream.getCost() + 60;
       }

       @Override
    public String getDesc() {
            return iceCream.getDesc() + ", Choco Scoop selected";
        }
    }

