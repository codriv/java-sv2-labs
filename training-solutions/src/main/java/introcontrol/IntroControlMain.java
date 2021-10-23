package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl introControl = new IntroControl();

        System.out.println("szám vagy szám-10: " + introControl.subtractTenIfGreaterThanTen(15));
        System.out.println("zero vagy nem zero: " + introControl.describeNumber(4));
        System.out.println("Joe üdvözlése: " + introControl.greetingToJoe("Joe"));
        System.out.println("10% jutalék: " + introControl.calculateBonus(1250000));
        System.out.println("mérőóraállás: " + introControl.calculateConsumption(1245, 987));
        System.out.println("pozitív egész számok: ");
        introControl.printNumbers(4);
        System.out.println("pozitív egész számok tartományban: ");
        introControl.printNumbersBetween(2, 7);
        System.out.println("pozitív egész számok tartományban bármelyik irányban: ");
        introControl.printNumbersBetweenAnyDirection(9, 5);
        System.out.println("páratlan egész számok: ");
        introControl.printOddNumbers(9);
    }
}
