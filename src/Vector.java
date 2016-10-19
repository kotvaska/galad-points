import java.util.List;

/**
 * Created by kotvaska on 19.10.2016.
 */
public class Vector {
    private List<Point> points;

    public Vector(List<Point> points) {
        this.points = points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public List<Point> getPoints() {
        return points;
    }

    public double getLength() {
        Point lenVect = new Point(points.get(1).getX() - points.get(0).getX(),
                points.get(1).getY() - points.get(0).getY());
        return Math.sqrt(Math.pow(lenVect.getX(), 2) + Math.pow(lenVect.getY(), 2));
    }

}
