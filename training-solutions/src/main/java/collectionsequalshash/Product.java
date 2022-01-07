package collectionsequalshash;

import java.util.Objects;

public class Product {

    private String name;
    private String regNumber;

    public Product(String name, String regNumber) {
        this.name = name;
        this.regNumber = regNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return regNumber.equals(product.regNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber);
    }
}
