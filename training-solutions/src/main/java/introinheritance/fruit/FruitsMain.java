package introinheritance.fruit;

public class FruitsMain {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.setName("Gyümölcs");
        fruit.setWeight(2.5);

        Grape grape = new Grape();
        grape.setType("Othello");
        grape.setName("szőlő");

        Apple apple= new Apple();
        apple.setName("alma");
        apple.setWeight(1.2);
        apple.setPieces(5);

        GoldenDelicious goldenDelicious = new GoldenDelicious();
        goldenDelicious.setName("golden");
        goldenDelicious.setWeight(0.8);

        Starking starking = new Starking();
        starking.setName("sztarking");
        starking.setWeight(0.6);

        System.out.println(fruit.getName());
        System.out.println(fruit.getWeight());
        System.out.println(grape.getType());
        System.out.println(grape.getName());
        System.out.println(apple.getName());
        System.out.println(apple.getWeight());
        System.out.println(apple.getPieces());
        System.out.println(goldenDelicious.getColour());
        System.out.println(goldenDelicious.getName());
        System.out.println(goldenDelicious.getWeight());
        System.out.println(starking.getColour());
        System.out.println(starking.getName());
        System.out.println(starking.getWeight());
    }
}
