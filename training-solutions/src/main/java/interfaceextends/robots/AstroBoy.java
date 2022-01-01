package interfaceextends.robots;

import java.util.ArrayList;
import java.util.List;

public class AstroBoy implements FlyableRobot{

    private Point position;
    private int angle;
    private List<Point> path = new ArrayList<>();
    public static final long ALTITUDE = 5;

    public AstroBoy(Point position) {
        this.position = position;
    }

    public List<Point> getPath() {
        return path;
    }

    public Point getPosition() {
        return position;
    }

    public int getAngle() {
        return angle;
    }

    public long getAltitude() {
        return position.getZ();
    }

    public void liftTo(long altitude) {
        position = new Point(getPosition().getX(), getPosition().getY(), altitude);
        path.add(position);
    }

    public void moveTo(Point position) {
        walkTo(position);
    }

    public void fastMoveTo(Point position) {
        liftTo(ALTITUDE);
        walkTo(new Point(position.getX(), position.getY(), this.position.getZ()));
        liftTo(0);
    }

    public void rotate(int angle) {
        this.angle = angle;
    }

    private void walkTo(Point position) {
        this.position = position;
        path.add(this.position);
    }
}
