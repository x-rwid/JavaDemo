package projectoop;

public class ElLaptop extends ElComputers {
    private double batteryLife;

    public ElLaptop(String brand, double power, int ramGB, String processor, double batteryLife) {
        super(brand, power, ramGB, processor);
        this.batteryLife = batteryLife;
    }

    public boolean needsCharging(double cuurentBatteryLife) {
        return cuurentBatteryLife < 20.0;
    }

    public  double getBatteryLife() {
        return batteryLife;
    }
    public void setBatteryLife(double hours) {
        this.batteryLife = hours;
    }
}
