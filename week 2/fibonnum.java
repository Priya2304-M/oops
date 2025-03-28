import java.util.Scanner;

public class fibonnum {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter n=");
	int n = scanner.nextInt();
        int num1 = 0, num2 = 1;
        System.out.println("First " + n + " terms of Fibonacci sequence: ");
	for (int i = 1; i <= n; ++i) {
            System.out.println(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}