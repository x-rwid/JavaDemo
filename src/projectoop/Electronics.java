package projectoop;

public class Electronics {
    private String brand;
    private double powerWatt;

    public Electronics(String brand, double powerWatt) {
        this.brand = brand;
        this.powerWatt = powerWatt;
    }

    public double energyCost(int hoursUsed, double costKwh) {
        return (this.powerWatt / 1000.0) *  hoursUsed * costKwh;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getPowerWatt() {
        return powerWatt;
    }
    public void setPowerWatt(double power) {
        this.powerWatt = power;
    }
}
