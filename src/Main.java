import java.util.ArrayList;
import java.util.List;

/**
 * Created by kotvaska on 19.10.2016.
 */
public class Main {

    public static void main(String[] args) {
        double x1 = 2.0d, x2 = 20.0d, y1 = -1.0d, y2 = 5.0d;
        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);
        List<Point> points = new ArrayList<>();
        points.add(point1);
        points.add(point2);
        Vector vector = new Vector(points);

        double l = 5.0d;
        double lOxAngle = 90.0d - Math.toDegrees(getAngle(x2 - x1, vector.getLength()));

        // the same point as vector
        Point pointL1 = new Point(x1, y1);
        x2 = Math.cos(lOxAngle) * l;
        y2 = Math.sin(lOxAngle) * l;
        Point pointL2 = new Point(x2, y2);
        points = new ArrayList<>();
        points.add(pointL1);
        points.add(pointL2);
        Vector lVector = new Vector(points);

        System.out.println(lVector.getLength());
    }

    private static double getAngle(double len1, double len2) {
        return Math.acos(Math.toRadians(len1 / len2));
    }

}
