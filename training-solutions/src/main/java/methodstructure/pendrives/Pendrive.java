package methodstructure.pendrives;

public class Pendrive {
    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return String.format("name: %s; capacity: %d; price: %d", name, capacity, price);
    }

    public void risePrice(int percent) {
        price*=(1 + (percent/100d));
    }

    public int comparePricePerCapacity(Pendrive other) {
        double actualRatio = (double) price / capacity;
        double otherRatio = (double) other.price / other.capacity;
        if (actualRatio > otherRatio) {
            return 1;
        } else if (actualRatio < otherRatio) {
            return -1;
        } else {
            return 0;
        }
    }

    public boolean isCheaperThan(Pendrive other) {
        return price < other.price ? true : false;
    }
}
