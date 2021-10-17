package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        client.setName("Nevem Senki");
        client.setYear(1987);
        client.setAddress("Görbe utca 3.");
        System.out.println("\r\nÜgyfél nyilvántartás 2.0\r\n");
        System.out.println("Ügyfél neve: " + client.getName());
        System.out.println("Ügyfél születési éve: " + client.getYear());
        System.out.println("Ügyfél címe: " + client.getAddress());
        client.migrate("Egyenes utca 7");
        System.out.println("\r\nAz ügyfél elköltözött!");
        System.out.println("Az ügyfél új címe: " + client.getAddress());
    }
}
