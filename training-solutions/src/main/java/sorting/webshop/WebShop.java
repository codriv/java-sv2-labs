package sorting.webshop;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WebShop {

    private List<Product> products;

    public WebShop(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public List<Product> getProductsSortedByName() {
        List<Product> products = getProducts();
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                Collator collator = Collator.getInstance();
                return collator.compare(o1.getName(), o2.getName());
            }
        });
        return products;
    }

    public List<Product> getProductsSortedByPrice() {
        List<Product> products = getProducts();
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
        return products;
    }

    public List<Product> getProductsSortedByFrom() {
        List<Product> products = getProducts();
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getFrom().compareTo(o2.getFrom());
            }
        });
        return products;
    }
}
