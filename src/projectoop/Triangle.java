package projectoop;

public class Triangle {

    // encupsulation: be vasita kiriwni ceklaw ucun field'lar maxfiy
    private double base;
    private double height;
    private double hypotenuse;

    // constructor: object tuzilganda attribute'larni iwga tuwiriw ucun
    public Triangle(double base, double height) {
        setSides(base, height);
    }

    // setter method'lar: encapsulation'ni amalga owiriw va riyaziyat ceklovlarni saqlab qoliw ucun
    public void setSides(double base, double height) {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Ucburcakni tomonlari 0 dan katta bo'liwi kerak");
        }
        this.base = base;
        this.height = height;
        this.hypotenuse = Math.sqrt((base * base) + (height * height));
    }

    // getter method'lar: attribute'larga nazorot qilinadigan kiriw ucun
    public double getBase() {return base;}
    public double getHeight() {return height;}
    public double getHypotenuse() {return hypotenuse;}

    // maydon method'lari
    public double getArea() {
        return 0.5 * this.base * this.height;
    }
    public double getArea(int a, int b) {
        return 0.5 * a * b;
    }
    public double getArea(float a, float b) {
        return 0.5F * a * b;
    }
    public double getArea(long a, long b) {
        return 0.5 * a * b;
    }
    public double getArea(double a, double b) {
        return 0.5 * a * b;
    }

    // hudud method'lari
    public double getPerimeter() {
        return this.base + this.height + this.hypotenuse;
    }

    public double getPerimeter(int a, int b, int c) {
        return a + b + c;
    }
    public double getPerimeter(float a, float b, float c) {
        return a + b + c;
    }
    public double getPerimeter(long a, long b, long c) {
        return a + b + c;
    }
    public double getPerimeter(double a, double b, double c) {
        return a + b + c;
    }
}
