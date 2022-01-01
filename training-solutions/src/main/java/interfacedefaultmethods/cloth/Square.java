package interfacedefaultmethods.cloth;

public interface Square {

    double getSide();

    default int getNumberOfSides() {
        return 4;
    }
    default double getLengthOfDiagonal() {
        return Math.sqrt((Math.pow(getSide(), 2) * 2));
    }
    default double getPerimeter() {
        return getSide() * 4;
    }
    default double getArea() {
        return Math.pow(getSide(), 2);
    }
}
