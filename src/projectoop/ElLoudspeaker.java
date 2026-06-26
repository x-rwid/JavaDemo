package projectoop;

public class ElLoudspeaker extends ElSounds {
    private int numberOfDrivers;

    public ElLoudspeaker(String brand, double power, int maxVolume, boolean isWireless, int numberOfDrivers) {
        super(brand, power, maxVolume, isWireless);
        this.numberOfDrivers = numberOfDrivers;
    }

    public int getNumberOfDrivers() {
        return numberOfDrivers;
    }
    public void setNumberOfDrivers(int drivers) {
        this.numberOfDrivers = drivers;
    }
}
