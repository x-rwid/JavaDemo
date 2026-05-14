package projectoop;

public class Car {

    String model;
    String color;
    String isAutomatic;
    double price;

    public Car(String model, String color, String automatic, double price) {
        this.model = model;
        this.color = color;
        this.isAutomatic = automatic;
        this.price = price;
    }

    public void  carModel() {
        IO.println("Rusum: " + model + "Rangi: " + color + "Uzatmasi: " + isAutomatic + " Narxi: " + price);
    }
}
