package projectoop;

public class Car {

    private String model;
    private String color;
    private String isAutomatic;
    private double price;

    public Car(String model, String color, String automatic, double price) {
        this.model = model;
        this.color = color;
        this.isAutomatic = automatic;
        this.price = price;
    }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getIsAutomatic() { return isAutomatic; }
    public void setIsAutomatic(String isAutomatic) { this.isAutomatic = isAutomatic; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public void carModel() {
        IO.println("Rusum: " + this.model);
        IO.println("Rangi: " + this.color);
        IO.println("Uzatmasi: " + this.isAutomatic);
        IO.println("Narxi: " + this.price);
    }
}
