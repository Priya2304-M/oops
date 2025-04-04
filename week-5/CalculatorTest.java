class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}

class Calculator1 extends Calculator {
    public int multiply(int a, int b) {
        return a * b;
    }
}

class Calculator2 extends Calculator1 {
    public double divide(int a, int b) {
        return (double) a / b; // Fixed: Ensure division returns a double
    }
}

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator2 calc = new Calculator2();
        int num1 = 10, num2 = 5;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Addition: " + calc.add(num1, num2));
        System.out.println("Subtraction: " + calc.subtract(num1, num2));
        System.out.println("Multiplication: " + calc.multiply(num1, num2));
        System.out.println("Division: " + calc.divide(num1, num2));

        System.out.println("priya");
    }
}
