package projectoop;

public class ConverterBaseTest {
    static void main() {

        double tempCelsius = 25.0;

        ConverterBase fConverter = new ConverterFahrenheit(tempCelsius);
        ConverterBase kConverter = new ConverterKelvin(tempCelsius);
        ConverterBase rConverter = new ConverterRankine(tempCelsius);

        fConverter.convert();
        kConverter.convert();
        rConverter.convert();
    }
}
