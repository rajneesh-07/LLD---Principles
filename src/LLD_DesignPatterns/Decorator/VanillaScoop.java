package LLD_DesignPatterns.Decorator;

public class VanillaScoop implements IceCream{
        private IceCream iceCream;
        private VanillaScoop vanillaScoop;
    public VanillaScoop(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        return iceCream.getCost() + 40;
       }

       @Override
    public String getDesc() {
            return iceCream.getDesc() + ", Vanilla Scoop selected";
        }
    }

