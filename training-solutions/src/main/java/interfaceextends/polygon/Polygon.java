package interfaceextends.polygon;

public class Polygon implements Geometric{

    double lengthOfSide;
    int numberOfVertices;

    public Polygon(double lengthOfSide, int numberOfVertices) {
        this.lengthOfSide = lengthOfSide;
        this.numberOfVertices = numberOfVertices;
    }

    public double getLengthOfSide() {
        return lengthOfSide;
    }

    public int getNumberOfVertices() {
        return numberOfVertices;
    }

    public double getPerimeter() {
        return lengthOfSide * numberOfVertices;
    }

    public int getNumberOfDiagonalsFromOneVertex() {
        return numberOfVertices - 3;
    }

    public int getNumberOfAllDiagonals() {
        return (getNumberOfDiagonalsFromOneVertex() * numberOfVertices) / 2;
    }
}
