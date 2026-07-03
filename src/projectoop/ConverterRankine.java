package projectoop;

public class ConverterRankine extends ConverterBase {
    public ConverterRankine(double celsius) {
        super(celsius);
    }

    @Override
    public void convert() {
        double rankine = (celsius + 273.15) * 9.0 / 5.0;
        System.out.printf("%.2f°C bu %.2f°Ra%n", celsius, rankine);
    }
}
