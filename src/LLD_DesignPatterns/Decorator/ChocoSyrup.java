package LLD_DesignPatterns.Decorator;

public class ChocoSyrup implements IceCream{
    private IceCream iceCream;

    public ChocoSyrup(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
       return iceCream.getCost()+ 35;
    }

    @Override
    public String getDesc() {
        return iceCream.getDesc() + ", Choco syrup selected";
    }
}
