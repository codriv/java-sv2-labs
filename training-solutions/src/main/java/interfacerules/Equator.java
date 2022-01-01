package interfacerules;

public class Equator implements Name, Length{

    private static final String NAME = "name";
    private static final double LENGTH = 1.1;

    public double getLength() {
        return LENGTH;
    }

    public String getName() {
        return NAME;
    }
}
