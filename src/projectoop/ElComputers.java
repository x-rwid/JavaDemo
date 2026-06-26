package projectoop;

public class ElComputers extends Electronics {
    private int ramGB;
    private String processor;

    public ElComputers(String brand, double power, int ramGB, String processor) {
        super(brand, power);
        this.ramGB = ramGB;
        this.processor = processor;
    }

    public void upgradeRam(int extraRam) {
        this.ramGB = extraRam;
        IO.println(getBrand() + " RAM " + this.ramGB + "GB ga yangilandi.");
    }

    public int getRamGB() {
        return ramGB;
    }
    public void setRamGB(int ramGB) {
        this.ramGB = ramGB;
    }

    public String getProcessor() {
        return processor;
    }
    public void setProcessor(String processor) {
        this.processor = processor;
    }
}
