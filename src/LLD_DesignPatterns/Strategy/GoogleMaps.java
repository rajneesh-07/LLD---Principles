package LLD_DesignPatterns.Strategy;

public class GoogleMaps {

    public void findPath(String source, String destination,TransportMode mode){
            PathCalculator pc = PathCalculatorFactory.getPathCalculator(mode);
            pc.findPath(source,destination);
    }
}
// git add src/LLD_DesignPatterns/Strategy
