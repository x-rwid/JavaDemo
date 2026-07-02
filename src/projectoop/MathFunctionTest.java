package projectoop;

public class MathFunctionTest {
    static void main() {
        MathFunction math = new MathFunction();

        IO.println("Qo'wiw: " + math.add(5, 3.8));
        IO.println("Ayiriw: " + math.sub(10.5, 2));
        IO.println("Ko'paytiriw: " + math.multiply(2.5, 7));
        IO.println("Taqsimlaw: " + math.div(9, 6));
        IO.println("Mutlaq: " + math.abs(-25.7));
        IO.println("Kvadrat: " + math.pow(5.5));
    }
}
