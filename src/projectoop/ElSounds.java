package projectoop;

public class ElSounds extends Electronics {
    private int maxVolume;
    private boolean isWireless;

    public ElSounds(String brand, double power, int maxVolume, boolean isWireless) {
        super(brand, power);
        this.maxVolume = maxVolume;
        this.isWireless = isWireless;
    }

    public void hearingSafety() {
        if (this.maxVolume > 85) {
            IO.println("Ogohlantiriw: " + getBrand() + " Ovoz 85dB dan owdi. Ewitiw qobiliyati ucun xavf!");
        } else {
            IO.println(getBrand() + " Ovoz balandligi uzoq vaqt davomida ta'sir etiw ucun xavfsiz.");
        }
    }

    public int getMaxVolume() {
        return maxVolume;
    }
    public void setMaxVolume(int volume) {
        this.maxVolume = volume;
    }

    public boolean isWireless() {
        return isWireless;
    }
    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }
}
