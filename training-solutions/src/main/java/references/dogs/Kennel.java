package references.dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        Dog dog1 = new Dog("Bodri", 5, "sötétbarna");
        Dog dog2 = new Dog("Bundás", 4, "szürke");
        Dog dog3 = new Dog("Bogáncs", 5, "fekete");
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        System.out.println(" dogs: " + dogs);

        Dog dog4 = new Dog("Morzsa", 3, "Zsömle");
        dog4 = dogs.get(1);
        dog4.setColour("világosbarna");
        System.out.println(" dogs: " + dogs);

        Dog dog5 = new Dog("pletyka", 2, "fehér");
        System.out.println(" dog5: " + dog5);
        dog5 = dogs.get(1);
        System.out.println(" dog5: " + dog5);
        dogs.add(dog5);
        System.out.println(" dogs: " + dogs);

        Dog dog6 = dog4;
        dog6.setColour("fekete-fehér");
        System.out.println(" dogs: " + dogs);

        List<Dog> newDogs = dogs;
        Dog dog7 = dog4;
        dog7.setColour("foltos");
        System.out.println(" newDogs " + newDogs);

        dog2.setColour("piros");
        System.out.println(" newDogs: " + newDogs);

        dog2 = null;
        System.out.println(" newDogs: " + newDogs);

        Dog dog8 = dogs.get(1);
        dog8 = null;
        System.out.println(" newDogs: " + newDogs);

        Dog dog9 = dogs.get(1);
        dog9.setColour("kek");
        System.out.println(" newDogs: " + newDogs);

    }
    public String printOut(List<Dog> list){
        String lista = "";
        int nr = 0;
        for (Dog item: list) {
            lista += "\n " + nr + ": " + item;
            nr++;
        }
        return " " + lista.trim();
    }
}

