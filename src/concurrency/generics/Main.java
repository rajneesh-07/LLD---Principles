package concurrency.generics;

import concurrency.UpDownCasting.SmartTv;
import concurrency.UpDownCasting.TV;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        Calculator<Integer, String> intstrCalculator = new Calculator<>(12, "Rajneesh");
        intstrCalculator.print(12,"Rajneesh");

        intstrCalculator.printX(45);
        intstrCalculator.printY("Rajneesh");

         */


        List<?> allList = new ArrayList<>();  // Wildcard List --> that can accepts anything
        List<? extends Animal> animalAndChildrenList = new ArrayList<>();
        List<? super Animal> animalAndParentList = new ArrayList<>();
        List<Animal> animalList = new ArrayList<>();
    }
}
