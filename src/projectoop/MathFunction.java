package projectoop;

import java.util.Objects;

public class MathFunction {

    public <T extends Number> double add(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    public <T extends Number> double sub(T num1, T num2) {
        return num1.doubleValue() - num2.doubleValue();
    }

    public <T extends Number> double multiply(T num1, T num2) {
        return num1.doubleValue() * num2.doubleValue();
    }

    public <T extends Number> double div(T num1, T num2) {
        if (num2.doubleValue() == 0.0) {
            throw new ArithmeticException("0 ga taqsimlawga ruxsat etilmaydi!");
        }
        return num1.doubleValue() / num2.doubleValue();
    }

    public <T extends Number> double abs(T num) {
        return Math.abs(num.doubleValue());
    }

    public <T extends Number> double pow(T num) {
        return Math.pow(num.doubleValue(), 2);
    }
}
