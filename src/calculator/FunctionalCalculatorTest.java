package calculator;

public class FunctionalCalculatorTest {

    public static void main(String[] args) {
        double a = 10, b = 5;

        // Lambda expressions
        Calculator add = (x, y) -> x + y;
        Calculator subtract = (x, y) -> x - y;
        Calculator multiply = (x, y) -> x * y;
        Calculator divide = (x, y) -> {
            if (y == 0) throw new ArithmeticException("Cannot divide by zero");
            return x / y;
        };
        Calculator mod = (x, y) -> x % y;

        // Testing
        System.out.println("Functional Programming:");
        System.out.println("Add: " + add.calculate(a, b));
        System.out.println("Subtract: " + subtract.calculate(a, b));
        System.out.println("Multiply: " + multiply.calculate(a, b));
        System.out.println("Divide: " + divide.calculate(a, b));
        System.out.println("Mod: " + mod.calculate(a, b));
    }
}
