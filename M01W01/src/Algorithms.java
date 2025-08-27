public class Algorithms {
    static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max <= arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n != 1;
    }

    static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5, 6, 8, 9, 11};
        System.out.print(findMax(ar));
        System.out.println("");
        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
        System.out.println(isPrime(1));
        System.out.println(isPrime(11));
        System.out.println(isPrime(12));
        System.out.println(factorial(1));
        System.out.println(factorial(3));
        System.out.println(factorial(11));
    }
}
