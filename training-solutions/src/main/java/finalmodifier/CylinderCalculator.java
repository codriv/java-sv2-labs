package finalmodifier;

import static finalmodifier.CirclecalCulator.PI;

public class CylinderCalculator {

    static double calculateVolume(double r, double h) {
        return r * r * PI * h;
    }
    static double calculateSurfaceArea(double r, double h) {
        return (r * r * PI * 2) + (r * 2 * PI * h);
    }
}
