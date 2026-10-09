package LLD_DesignPatterns.Decorator;

public class OrangeCone implements IceCream{
        private IceCream iceCream;
        private OrangeCone orangeCone;
    public OrangeCone(IceCream iceCream){
        this.iceCream = iceCream;
    }
    public OrangeCone(){
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
            return "Orange cone selected ";
        }else{
            return iceCream.getDesc() + ", Orange cone selected";
        }
    }
}
