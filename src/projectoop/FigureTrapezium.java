package projectoop;

public class FigureTrapezium extends FigureGeometric {

    private double sideA;
    private double sideB;
    private double high;

    public FigureTrapezium(double sideA, double sideB, double high) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.high = high;
    }

    @Override
    public double area() {
        return ((sideA + sideB) * high) / 2.0;
    }

    @Override
    public double perimeter() {
        double horizontalShift = Math.abs((sideA - sideB) / 2.0);
        double slantSide = Math.sqrt((horizontalShift * horizontalShift) + (high * high));
        return sideA + sideB + (2 * slantSide);
    }

    public double getSideA() {
        return sideA;
    }
    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }
    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getHigh() {
        return high;
    }
    public void setHigh(double high) {
        this.high = high;
    }
}
