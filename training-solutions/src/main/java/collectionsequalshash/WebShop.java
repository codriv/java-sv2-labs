package collectionsequalshash;

import java.util.List;

public class WebShop {

    private List<Product> products;

    public int findHowMany(Product product) {
        int occurrence = 0;
        for (Product actual: products) {
            if (product.equals(actual)) {
                occurrence++;
            }
        }
        return occurrence;
    }

    public static void main(String[] args) {
        WebShop webShop = new WebShop();
        Product product1 = new Product("product_1", "123-456");
        Product product2 = new Product("product_2", "456-789");
        Product product3 = new Product("product_3", "456-789");
        Product product4 = new Product("product_4", "654-987");
        Product product5 = new Product("product_5", "456-789");
        List<Product> products = List.of(product1, product2, product3, product4, product5);
        webShop.products = products;
        System.out.println(webShop.findHowMany(new Product("product_6", "654-987")));
        System.out.println(webShop.findHowMany(new Product("product_7", "456-789")));
    }
}
