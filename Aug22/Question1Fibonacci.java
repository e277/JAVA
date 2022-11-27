import java.util.Scanner;

public class Question1Fibonacci {
    public static int fibRecur(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibRecur(n - 2) + fibRecur(n - 1);
    }

    public static void fibIter(int number) {
        int previousNumber = 1;
        int nextNumber = 1;

        for (int i = 1; i <= number; i++) {
            System.out.print(previousNumber + " ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.println("Fibonacci series up to " + n + "th number:");

        System.out.print("Recursive: ");
        for (int i = 1; i <= n; ++i) {
            System.out.print(fibRecur(i) + " ");
        }

        System.out.print("\nIterative: ");
        fibIter(n);
        input.close();
    }
}
