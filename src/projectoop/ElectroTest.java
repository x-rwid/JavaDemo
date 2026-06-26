package projectoop;

public class ElectroTest {
    static void main() {
        IO.println("=== Laptop'ni Iwga Tuwiriw (Computers -> Electronics) ===");
        ElLaptop myLaptop = new ElLaptop("Dell", 65.0, 16, "Intel i7", 8.5);
        IO.println("Brand: " + myLaptop.getBrand());
        IO.println("Processor: " + myLaptop.getProcessor());

        double cost = myLaptop.energyCost(10, 0.15); // 10 hours at $0.15/kWh
        System.out.printf("10 soatlik iw narxi: $%.4f\n", cost);

        IO.println("15% da quvvatlaw kerakmi? " + myLaptop.needsCharging(15.0));

        myLaptop.upgradeRam(16);

        System.out.println("\n=== Subwoofer Iwga Tuwiriw (Sounds -> Electronics) ===");
        ElSubwoofer mySub = new ElSubwoofer("Samsung", 300.0, 95, true, 20);
        IO.println("Brand: " + mySub.getBrand());
        IO.println("Simsiz imkaniyatlari: " + mySub.isWireless());

        mySub.hearingSafety();
    }
}
