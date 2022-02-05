package activity;

import java.io.InputStream;
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
            double decrease = getDifference(i);
            fullDecrease -= decrease < 0 ? decrease : 0;
        }
        return fullDecrease;
    }

    public double getFullElevation() {
        double fullElevation = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            double elevation = getDifference(i);
            fullElevation += elevation > 0 ? elevation : 0;
        }
        return fullElevation;
    }

    private double getDifference(int i) {
        return trackPoints.get(i).getElevation() - (trackPoints.get(i - 1).getElevation());
    }

    public void loadFromGpx(InputStream is) {
        try (Scanner scanner = new Scanner(is)) {
            while (scanner.hasNextLine()) {
                createTrackPoint(scanner);
            }
        } catch(NullPointerException npe) {
            throw new IllegalStateException("Can not read file!");
        }
    }

    private void createTrackPoint(Scanner scanner) {
        String line = scanner.nextLine().trim();
        if (line.startsWith("<trkpt")) {
            Coordinate coordinate = getCoordinate(line);
            double elevation = getElevation(scanner.nextLine().trim());
            trackPoints.add(new TrackPoint(coordinate, elevation));
        }
    }

    private Coordinate getCoordinate(String line) {
        String[] parts = line.split("\"");
        double lat = Double.parseDouble(parts[1]);
        double lon = Double.parseDouble(parts[3]);
        return new Coordinate(lat, lon);
    }

    private double getElevation(String line) {
        String[] parts = line.split("[<>]");
        return Double.parseDouble(parts[2]);
    }
}