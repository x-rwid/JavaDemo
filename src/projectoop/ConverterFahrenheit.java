package projectoop;

public class ConverterFahrenheit extends ConverterBase {
    public ConverterFahrenheit(double celsius) {
        super(celsius);
    }

    @Override
    public void convert() {
        double fahrenheit = ((celsius * 9.0 / 5.0) + 32);
        System.out.printf("%.2f°C bu %.2f°F%n",  celsius, fahrenheit);
    }
}
