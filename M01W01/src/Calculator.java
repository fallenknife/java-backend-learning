import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number a");
        int a = scanner.nextInt();
        System.out.print("Enter number b");
        int b = scanner.nextInt();
        System.out.print("Enter operation");
        char c = scanner.next().charAt(0);


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
        }
        System.out.println(result);
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
