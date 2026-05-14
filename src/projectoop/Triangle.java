package projectoop;

public class Triangle {

    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double getHypotenuse() {
        return Math.sqrt((base * base) + (height * height));
    }
    public double getArea() {
        return 0.5 * base * height;
    }
}
