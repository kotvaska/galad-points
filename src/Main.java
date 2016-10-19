import java.util.ArrayList;
import java.util.List;

/**
 * Created by kotvaska on 19.10.2016.
 */
public class Main {

    public static void main(String[] args) {
        Point point1 = new Point(2, -1);
        Point point2 = new Point(20, 5);
        List<Point> points = new ArrayList<>();
        points.add(point1);
        points.add(point2);
        Vector vector = new Vector(points);

        Point point1Pr = new Point(2, -1);
        Point point2Pr = new Point(20, -1);
        List<Point> pointsPr = new ArrayList<>();
        pointsPr.add(point1Pr);
        pointsPr.add(point2Pr);
        Vector projection = new Vector(pointsPr);

        System.out.println(getAngle(vector, projection));
    }

    private static double getAngle(Vector vector, Vector projection) {
        double angleA = Math.acos(projection.getLength() / vector.getLength());
        return angleA * 180.0d / Math.PI;
//        return 90.0d - angleA * 180.0d / Math.PI; // angle in degrees.
//        return angleA*Math.PI/180.0d; // angle in radians.
    }

}
