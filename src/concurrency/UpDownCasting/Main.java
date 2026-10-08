package concurrency.UpDownCasting;

import java.util.*;
public class Main {
    public static void main(String[] args) {

        /*
        TV tv = new TV();
        tv.channel();
        tv.volume();

        SmartTv smartTv = new SmartTv();
        smartTv.channel();
        smartTv.volume();
        smartTv.brightness();

        System.out.println("---------------");

        // old remote new TV
        //UPCASTING || IMPLICIT CASTING
        TV tvobj = new SmartTv(); // parent ref || child obj --> works fine, with limited capability
        tvobj.volume();
        tvobj.channel();

        // new remote old tv || DOWNCASTING || EXPLICIT CASTING

        SmartTv smartobj = (SmartTv) new TV();
        smartobj.brightness();

         */

        Animal animal = new Animal();
        Dog  dog = new Dog();

        print(animal);
        print(dog); // Animal animal = new Dog();

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        printList(animals);
//        printList(dogs); // upcasting inside generics does not work

    }
    public static void print(Animal animal){
        animal.print();
    }

    public static void printList(List<Animal> list){
        System.out.println("Printing from list method");
        for(int i = 0; i< list.size(); i++){
            list.get(i).print();
        }
    }
}

        /*
        Animal
        Dog

        Animal is parent Animal ---> no

        List is parent List ---> no

        List<Animal> is at the same level as List<Dog> because both are nothing but lists
        so, List<Animal> is not parent of List<Dog>
         */
