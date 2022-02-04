package sorting.webshop;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WebShopTest {

    WebShop webShop = new WebShop(Arrays.asList(
            new Product("kettő", 500, LocalTime.of(10, 10)),
            new Product("egy", 1500, LocalTime.of(15, 30)),
            new Product("öt", 800, LocalTime.of(5, 40)),
            new Product("három", 600, LocalTime.of(22, 50))
    ));

    @Test
    void getProductsSortedByName() {
        List<Product> products = webShop.getProductsSortedByName();
        assertEquals("egy", products.get(0).getName());
        assertEquals(800, products.get(products.size() - 1).getPrice());
    }

    @Test
    void getProductsSortedByPrice() {
        List<Product> products = webShop.getProductsSortedByPrice();
        assertEquals("kettő", products.get(0).getName());
        assertEquals(LocalTime.of(15, 30), products.get(products.size() - 1).getFrom());
    }

    @Test
    void getProductsSortedByFrom() {
        List<Product> products = webShop.getProductsSortedByFrom();
        assertEquals("öt", products.get(0).getName());
        assertEquals(600, products.get(products.size() - 1).getPrice());
    }
}