package projectoop;

public class TriangleShapes {
    static void main() {

        Triangle triangleShapes = new Triangle(3.0, 4.0);

        IO.println("Asos: " + triangleShapes.base);
        IO.println("Balandlik: " + triangleShapes.height);
        IO.println("Hypotenuse: " + triangleShapes.getHypotenuse());
        IO.println("Maydon: " + triangleShapes.getArea());
    }
}
