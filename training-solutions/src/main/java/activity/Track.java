package activity;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Track {

    private List<TrackPoint> trackPoints = new ArrayList<>();

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }

    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoints.add(trackPoint);
    }

    public Coordinate findMinimumCoordinate() {
        double minLatitude = trackPoints.stream()
                .min(Comparator.comparingDouble(point -> point.getCoordinate().getLatitude())).get().getCoordinate().getLatitude();
        double minLongitude = trackPoints.stream()
                .min(Comparator.comparingDouble(point -> point.getCoordinate().getLongitude())).get().getCoordinate().getLongitude();
        return new Coordinate(minLatitude, minLongitude);
    }

    public Coordinate findMaximumCoordinate() {
        double maxLatitude = trackPoints.stream()
                .max(Comparator.comparingDouble(point -> point.getCoordinate().getLatitude())).get().getCoordinate().getLatitude();
        double maxLongitude = trackPoints.stream()
                .max(Comparator.comparingDouble(point -> point.getCoordinate().getLongitude())).get().getCoordinate().getLongitude();
        return new Coordinate(maxLatitude, maxLongitude);
    }

    public double getRectangleArea() {
        double minLat = findMinimumCoordinate().getLatitude();
        double maxLat = findMaximumCoordinate().getLatitude();
        double minLon = findMinimumCoordinate().getLongitude();
        double maxLon = findMaximumCoordinate().getLongitude();
        return (maxLat - minLat) * (maxLon - minLon);
    }

    public double getDistance() {
        double distance = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            distance += trackPoints.get(i).getDistanceFrom(trackPoints.get(i - 1));
        }
        return distance;
    }

    public double getFullDecrease() {
        double fullDecrease = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            double decrease = trackPoints.get(i).getElevation() - (trackPoints.get(i - 1).getElevation());
            fullDecrease -= decrease < 0 ? decrease : 0;
        }
        return fullDecrease;
    }

    public double getFullElevation() {
        double fullElevation = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            double elevation = trackPoints.get(i).getElevation() - (trackPoints.get(i - 1).getElevation());
            fullElevation += elevation > 0 ? elevation : 0;
        }
        return fullElevation;
    }
}
