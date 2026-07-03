package projectoop;

public class ConverterKelvin extends ConverterBase {
    public ConverterKelvin(double celsius) {
        super(celsius);
    }

    @Override
    public void convert() {
        double kelvin = celsius + 273.15;
        System.out.printf("%.2f°C bu %.2fK%n",  celsius, kelvin);
    }
}
