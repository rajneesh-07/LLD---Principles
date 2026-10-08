package LLD_DesignPatterns.Strategy;

public class PathCalculatorFactory {

    public static PathCalculator getPathCalculator(TransportMode mode){
      return  switch(mode){
          case CAR -> new CarPathCalculator();
            case WALK -> new WalkPathCalculator();
            case BIKE -> new BikePathCalculator();
        };
    }
}
