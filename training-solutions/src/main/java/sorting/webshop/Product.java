package sorting.webshop;

import java.time.LocalTime;

public class Product {

    private String name;
    private int price;
    private LocalTime from;

    public Product(String name, int price, LocalTime from) {
        this.name = name;
        this.price = price;
        this.from = from;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public LocalTime getFrom() {
        return from;
    }
}
