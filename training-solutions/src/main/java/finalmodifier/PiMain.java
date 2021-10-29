package finalmodifier;

public class PiMain {
    public static void main(String[] args) {
        System.out.println("\nPí értéke:");
        System.out.println(CirclecalCulator.PI);
        System.out.println("\nA kör kerülete:");
        System.out.println(CirclecalCulator.calculatePerimeter(12));
        System.out.println("\nA kör területe:");
        System.out.println(CirclecalCulator.calculateArea(12));
        System.out.println("\nA henger térfogata (PI-vel):");
        System.out.println(CylinderCalculator.calculateVolume(12, 8));
        System.out.println("\nA henger felszíne (PI-vel):");
        System.out.println(CylinderCalculator.calculateSurfaceArea(12, 8));
        System.out.println("\nA henger térfogata (metódussal):");
        System.out.println(CylinderCalculatorBasedOnCircle.calculateVolume(12, 8));
        System.out.println("\nA henger felszíne (metódussal):");
        System.out.println(CylinderCalculatorBasedOnCircle.calculateSurfaceArea(12, 8));
    }
}
