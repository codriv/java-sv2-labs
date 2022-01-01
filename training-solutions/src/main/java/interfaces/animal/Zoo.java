package interfaces.animal;

import java.util.List;

public class Zoo {

    private List<Animal> animals;

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public int getNumberOfAllLegs() {
        int numberOfAllLegs = 0;
        for (Animal animal: animals) {
            numberOfAllLegs += animal.getNumberOfLegs();
        }
        return numberOfAllLegs;
    }

    public int getNumberOfAnimals() {
        return animals.size();
    }
}
