package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        System.out.println("\r\nRaktárkészlet 1.0\r\n");
        Store store1 = new Store("Könyv");
        store1.store(1);
        System.out.println("A store1 raktárhoz hozzáadva 1 " + store1.getProduct());
        store1.store(2);
        System.out.println("A store1 raktárhoz hozzáadva 2 " + store1.getProduct());
        store1.store(1);
        System.out.println("A store1 raktárhoz hozzáadva 1 " + store1.getProduct());
        store1.dispatch(1);
        System.out.println("A store1 raktárból elszállítva 1 " + store1.getProduct());
        System.out.println("\r\nA store1 raktárban maradt " + store1.getStock() + " " + store1.getProduct() + "\r\n");

        Store store2 = new Store("Hintaszék");
        store2.store(3);
        System.out.println("A store2 raktárhoz hozzáadva 3 " + store2.getProduct());
        store2.store(5);
        System.out.println("A store2 raktárhoz hozzáadva 5 " + store2.getProduct());
        store2.store(1);
        System.out.println("A store2 raktárhoz hozzáadva 1 " + store2.getProduct());
        store2.dispatch(4);
        System.out.println("A store2 raktárból elszállítva 4 " + store2.getProduct());
        System.out.println("\r\nA store2 raktárban maradt " + store2.getStock() + " " + store2.getProduct());
    }


}
