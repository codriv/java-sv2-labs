package attributes.bill;

public class Bill {
    public static void main(String[] args) {
        BillItem billItem = new BillItem("Könyv", 1500, 2, 27);
        System.out.println("\nTermék: " + billItem.getProduct());
        System.out.println("Nettó ár: " + billItem.getPrice() + " Ft");
        System.out.println("Mennyiség: " + billItem.getQuantity() + " db");
        System.out.println("Fizetendő: " + billItem.calculateTotalPrice() + " Ft");
    }
}
