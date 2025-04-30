package calculator;

public class OOPCalculatorTest {
    public static void main(String[] args) {
        OOPCalculator calc = new OOPCalculator();
        double a = 10, b = 5;

        System.out.println("OOP Programming:");
        System.out.println("Add: " + calc.add(a, b));
        System.out.println("Subtract: " + calc.subtract(a, b));
        System.out.println("Multiply: " + calc.multiply(a, b));
        System.out.println("Divide: " + calc.divide(a, b));
        System.out.println("Mod: " + calc.mod(a, b));
    }
}
