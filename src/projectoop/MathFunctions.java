package projectoop;

public class MathFunctions {

    private static double pi;
    private static double e;

    public MathFunctions(double piValue, double eValue) {
        pi = piValue;
        e = eValue;
    }

    public double calculateCircleArea(double radius) {
        return pi * radius * radius;
    }
    public double calculatePowerOfE(double a) {
        return Math.pow(e, a);
    }
    public double calculateTriangleArea(double sideA, double sideB, double sideC) {
        double s = (sideA + sideB + sideC) / 2;

        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    static void main() {
        MathFunctions mathFunctions = new MathFunctions(3.14159265359,2.71828182846);

        double radius = 5.0;
        IO.println(radius + " radius aylanasini maydoni: " + mathFunctions.calculateCircleArea(radius));

        double power = 2.0;
        IO.println(power + " e kuci ko'tarildi: " + mathFunctions.calculatePowerOfE(power));

        double a = 3.0, b = 4.0, c = 5.0;
        IO.println(a + ", " + b + ", " + c + " tomonlari bo'lgan ucburcakni maydoni: "
                + mathFunctions.calculateTriangleArea(a, b, c));
    }
}
