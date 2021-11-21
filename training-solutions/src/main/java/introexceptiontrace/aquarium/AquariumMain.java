package introexceptiontrace.aquarium;

public class AquariumMain {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        aquarium.addFish(new Fish("carp", "grey"));
        aquarium.addFish(new Fish("catfish", "black"));
        aquarium.addFish(new Fish("trout", "blue"));
        aquarium.addFish(new Fish("pike", "white"));
        System.out.println(aquarium.getNumberOfFish());
    }
}
