package finalmodifier;

import static finalmodifier.CirclecalCulator.calculatePerimeter;
import static finalmodifier.CirclecalCulator.calculateArea;

public class CylinderCalculatorBasedOnCircle {

    static double calculateVolume(double r, double h) {
        return calculateArea(r) * h;
    }
    static double calculateSurfaceArea(double r, double h) {
        return calculateArea(r) * 2 + (calculatePerimeter(r) * h);
    }
}
