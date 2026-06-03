package projectoop;

public class CarModel {
    static void main() {

        Car car1 = new Car("X5 ", "Qora " , "Mechanic ", 50000);
        Car car2 = new Car("SLS ", "Kumuwrang ","Automatic ", 45000);
        Car car3 = new Car("'67 ", "Qizil ", "Mechanic ", 80000);

        IO.println("BMW'ni tafsilatlari:");
        car1.carModel();

        IO.println("\nMerc'ni tafsilatlari:");
        car2.carModel();

        IO.println("\nMustang'ni tafsilatlari:");
        car3.carModel();
    }
}