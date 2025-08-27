import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter number a: ");
            int a = scanner.nextInt();
            System.out.print("Enter number b: ");
            int b = scanner.nextInt();
            System.out.print("Enter operation: ");
            char c = scanner.next().charAt(0);
            System.out.print(c);
            int result;
            switch (c) {
                case '/':
                    result = divide(a, b);
                    break;
                case '*':
                    result = multiply(a, b);
                    break;
                case '+':
                    result = add(a, b);
                    break;
                case '-':
                    result = subtract(a, b);
                default:
                    result = 0;
                    System.out.printf("Error: unknown operation");
            }
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Error occured");
        }
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return a / b;
    }
}
