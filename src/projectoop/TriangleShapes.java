package projectoop;

public class TriangleShapes {
    static void main() {

        Triangle triangleShapes = new Triangle(3.0, 4.0);

        IO.println("Asos: " + triangleShapes.getBase());
        IO.println("Balandlik: " + triangleShapes.getHeight());
        IO.println("Hypotenuse: " + triangleShapes.getHypotenuse());
        IO.println("Maydon: " + triangleShapes.getArea());
        IO.println("Hudud: " + triangleShapes.getPerimeter());

        IO.println("\nHar xil primitive turlar ila ortiqca yuklangan method'larni sinaw:");
        IO.println("int (5, 12) ila maydon: " + triangleShapes.getArea(5, 12));
        IO.println("double (3.0, 4.0, 5.0) ila hudud: " + triangleShapes.getPerimeter(3.0, 4.0, 5.0));
        IO.println("float (6.5F, 8.2F) ila maydon: " + triangleShapes.getArea(6.5F, 8.2F));
        IO.println("long (15L, 20L, 25L ila hudud: " + triangleShapes.getPerimeter(15L, 20L, 25L));
    }
}
