package collectionsiterator;

public class ChristmasPresent {

    private String description;
    private String name;
    private int price;

    public ChristmasPresent(String description, String name, int price) {
        this.description = description;
        this.name = name;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
