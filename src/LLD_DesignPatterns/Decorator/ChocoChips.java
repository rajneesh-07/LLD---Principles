package LLD_DesignPatterns.Decorator;

public class ChocoChips implements IceCream{
        private IceCream iceCream;
        private ChocoChips chocoChips;
    public ChocoChips(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        return iceCream.getCost() + 25;
       }

       @Override
    public String getDesc() {
            return iceCream.getDesc() + ", Choco chips selected";
        }
    }

