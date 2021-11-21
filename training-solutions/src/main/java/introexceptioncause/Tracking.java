package introexceptioncause;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Tracking {
    public static void main(String[] args) {
        TrackPoints trackPoints = new TrackPoints();
        Path path = Paths.get("src/main/resources/introexceptioncause/tracking.csv");
        try {
            trackPoints.printElevations(trackPoints.getCoords(path));
        }
        catch (IllegalStateException ise){
            System.out.println("cover: " + ise.getMessage());
            System.out.println("caused by: " + ise.getCause());
        }
    }
}
