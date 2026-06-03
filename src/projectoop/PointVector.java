package projectoop;

public class PointVector {
    static void main() {

        Point vector = new Point(3.5, -2.0, 7.1);

        IO.println("X: " + vector.getX());
        IO.println("Y: " + vector.getY());
        IO.println("Z: " + vector.getZ());

        vector.setZ(10.0);
        IO.println("O'zgargan Vector: " + vector);
    }
}
