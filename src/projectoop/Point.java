package projectoop;

public class Point {

    // encupsulation: be vasita kiriwni ceklaw ucun field'lar maxfiy
    private double x;
    private double y;
    private double z;

    // constructor: object tuzilganda attribute'larni iwga tuwiriw ucun
    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // x ucun getter method
    public double getX() {
        return x;
    }
    // x ucun setter method
    public void setX(double x) {
        this.x = x;
    }

    // y ucun getter method
    public double getY() {
        return y;
    }
    // y ucun setter method
    public void setY(double y) {
        this.y = y;
    }

    // z ucun getter method
    public double getZ() {
        return z;
    }
    // z ucun setter method
    public void setZ(double z) {
        this.z = z;
    }

    // nuqtani vector string sifatida namoyiw etiw method'i
    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
