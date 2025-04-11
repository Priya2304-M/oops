class AddCalculator {
    AddCalculator() {
        System.out.println("This is a calculator");
    }

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class AddCal {
    public static void main(String[] args) {
        AddCalculator calc = new AddCalculator();

        System.out.println("The sum of the 2 numbers: 3 and 9 is " + calc.add(4, 7));
        System.out.println("The sum of the 2 numbers: 3.3 and 9.9 is " + calc.add(4.4, 7.7));
        System.out.println("The sum of the 3 numbers: 1, 3 and 9 is " + calc.add(1, 4, 7));

        System.out.println("priya");
    }
}
