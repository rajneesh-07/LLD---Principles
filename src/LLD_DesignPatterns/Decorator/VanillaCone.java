package LLD_DesignPatterns.Decorator;

public class VanillaCone implements IceCream{
        private IceCream iceCream;
        private VanillaCone vanillaCone;
    public VanillaCone(IceCream iceCream){
        this.iceCream = iceCream;
    }
    public VanillaCone(){
    }
    @Override
    public int getCost() {
       if(iceCream == null){
           return 20;
       }else{
           return iceCream.getCost() + 20;
       }
    }

    @Override
    public String getDesc() {
        if(iceCream == null){
            return "Vanilla cone selected ";
        }else{
            return iceCream.getDesc() + ", Vanilla cone selected";
        }
    }
}
