package projectoop;

public class CarModel {
    static void main() {

        Car car1 = new Car("X5 ", "Qora " , "Mechanic ", 50000);
        Car car2 = new Car("SLS ", "Kumuwrang ","Automatic ", 45000);

        IO.println("BMW ni detal'lari:");
        car1.carModel();

        IO.println("Merc ni detal'lari:");
        car2.carModel();
    }
}