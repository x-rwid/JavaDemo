package projectoop;

public class CarModel {
    static void main() {

        Car bmw = new Car();
        bmw.getModel("Beemer");
        bmw.getTransmission("Mechanic");
        bmw.getColor("Qora");
        bmw.getPrice("$50.000");

        IO.println();

        Car merc =  new Car();
        merc.getModel("Star");
        merc.getTransmission("Automatic");
        merc.getColor("Kumuw");
        merc.getPrice("$45.000");
    }
}