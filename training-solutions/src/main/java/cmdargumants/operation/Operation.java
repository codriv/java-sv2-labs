package cmdargumants.operation;

public class Operation {
    public static void main(String[] args) {
        System.out.println();
        for (String param : args) {
            if (param.equals("/list")) {
                System.out.println("Listázás");
            } else if (param.equals("/add")) {
                System.out.println("Hozzáadás");
            } else if (param.equals("/delete")) {
                System.out.println("Törlés");
            } else {
                System.out.println("Ismeretlen művelet");
            }
        }
    }
}