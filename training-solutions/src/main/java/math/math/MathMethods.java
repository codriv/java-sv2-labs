package math.math;

public class MathMethods {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Nagyobb (3, 8): " + Math.max(3, 8));
        System.out.println("Kisebb (7, 9): " + Math.min(7, 9));
        System.out.println("Pí: " + Math.PI);
        System.out.println("Kerekítés Pí: " + Math.round(Math.PI));
        System.out.println("Kerekítés (5,87564): " + Math.round(5.87564));
        System.out.println("Abszolútérték (-4): " + Math.abs(-4));
        System.out.println("Negáció (1): " + Math.negateExact(1));
        System.out.println("Összeadás (2, 5): " + Math.addExact(2, 5));
        System.out.println("Kivonás (9, 7): " + Math.subtractExact(9, 7));
        System.out.println("Szorzás (2, 7): " + Math.multiplyExact(2, 7));
        System.out.println("Hatványozás (2.0, 3.0): " + Math.pow(2.0, 3.0));
        System.out.println("Eggyel növelés (5): " + Math.incrementExact(5));
        System.out.println("Eggyel csökkentés (7): " + Math.decrementExact(7));
        System.out.println("Váletlenszám: " + Math.random());
    }
}