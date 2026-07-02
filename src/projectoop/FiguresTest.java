package projectoop;

public class FiguresTest {
    static void main() {

        FigureGeometric triangle = new FigureTriangle(3.0, 4.0, 5.0);
        FigureGeometric trapezium = new FigureTrapezium(6.0, 10.0, 4.0);
        FigureGeometric rectangle = new FigureRectangle(5.0, 8.0);

        FigureGeometric[] figures = {triangle, trapezium, rectangle};

        IO.println("=== Handasaviy Wakllarni Hisablaw Natijalari ===");

        for (FigureGeometric figure : figures) {
            String shapeName = figure.getClass().getSimpleName();

            IO.println("\nWakl: " + shapeName);
            System.out.printf("Maydon: %.2f%n", figure.area());
            System.out.printf("Muhit: %.2f%n", figure.perimeter());
        }
    }
}
