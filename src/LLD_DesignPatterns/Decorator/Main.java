package LLD_DesignPatterns.Decorator;

public class Main {
    public static void main(String [] args){
        IceCream iceCream = new ChocoChips(
                new VanillaScoop(
                        new ChocoScoop(
                              new ChocoSyrup  (new VanillaCone(
                                       new ChocoSyrup (
                                               new OrangeCone()))))));

        System.out.println("Cost : " + iceCream.getCost());
        System.out.println("Description : " + iceCream.getDesc());
    }
}
