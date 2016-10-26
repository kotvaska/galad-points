import java.util.ArrayList;
import java.util.List;

/**
 * Created by kotvaska on 19.10.2016.
 */
public class Main {

    public static void main(String[] args) {
        double x1 = 0.0d, x2 = 5.0d, y1 = 0.0d, y2 = 5.0d;
        Point A = new Point(x1, y1);
        Point B = new Point(x2, y2);
        Vector vector = printLength(A, B);

        double baseAngle = getAngle(x2 - x1, vector.getLength());
        double angle = 90.0d - Math.toDegrees(baseAngle);
        double l = 6.0d;

        x2 = A.getX() + Math.cos(angle / 180 * Math.PI) * l;
        y2 = A.getY() - Math.sin(angle / 180 * Math.PI) * l;
        Point A1 = new Point(x2, y2);
        printLength(A, A1);

        x2 = A.getX() - Math.cos(angle / 180 * Math.PI) * l;
        y2 = A.getY() + Math.sin(angle / 180 * Math.PI) * l;
        Point A2 = new Point(x2, y2);
        printLength(A, A2);

        x2 = A1.getX() + Math.cos(baseAngle / 180 * Math.PI) * vector.getLength();
        y2 = A1.getY() + Math.sin(baseAngle / 180 * Math.PI) * vector.getLength();
        Point B1 = new Point(x2, y2);
        printLength(A1, B1);

        x2 = A2.getX() + Math.cos(baseAngle / 180 * Math.PI) * vector.getLength();
        y2 = A2.getY() + Math.sin(baseAngle / 180 * Math.PI) * vector.getLength();
        Point B2 = new Point(x2, y2);
        printLength(A2, B2);
    }

    /**
     * Получаем аркосинус угла из треугольника с прямой AB и её проекции
     * @param len1 прилежащая
     * @param len2 гипотенуза
     * @return angle in radians
     */
    private static double getAngle(double len1, double len2) {
        return Math.acos(Math.toRadians(len1 / len2));
    }

    private static Vector printLength(Point ... p) {
        List<Point> points = new ArrayList<>();
        points.add(p[0]);
        points.add(p[1]);
        Vector vector = new Vector(points);

        System.out.println(vector.getLength());

        return vector;
    }

}
