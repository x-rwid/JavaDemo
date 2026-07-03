package projectoop;

public abstract class ConverterBase {
    protected double celsius;

    public ConverterBase(double celsius) {
        this.celsius = celsius;
    }

    public abstract void convert();
}
