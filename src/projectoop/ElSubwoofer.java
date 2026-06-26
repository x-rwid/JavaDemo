package projectoop;

public class ElSubwoofer extends ElSounds {
    private int lowHz;

    public ElSubwoofer(String brand, double power, int maxVolume, boolean isWireless, int lowHz) {
        super(brand, power, maxVolume, isWireless);
        this.lowHz = lowHz;
    }

    public int getLowHz() {
        return lowHz;
    }
    public void setLowHz(int hz) {
        this.lowHz = hz;
    }
}
