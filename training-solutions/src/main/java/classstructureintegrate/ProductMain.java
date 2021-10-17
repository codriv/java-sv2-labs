package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        System.out.println("\r\nTermék 1.0\r\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("A termék neve:");
        String productName = scanner.nextLine();
        System.out.println("A termék ára:");
        int productPrice = scanner.nextInt();
        Product product = new Product(productName, productPrice);
        System.out.println("\r\nA termék neve: " + product.getName());
        System.out.println("A termék ára: " + product.getPrice() + " Ft");
        System.out.println("\r\nMennyivel csökkenti a termék árát?");
        product.decreasePrice(scanner.nextInt());
        System.out.println("A termék új ára: " + product.getPrice() + " Ft");
        System.out.println("\r\nMennyivel növeli a termék árát?");
        product.increasePrice(scanner.nextInt());
        System.out.println("A termék új ára: " + product.getPrice() + " Ft");
    }
}
