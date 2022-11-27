import java.util.Scanner;

public class SumOfOddNumbers1 {
    public static void main(String[] args) {
        int sum = 0, number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Sum of N odd numbers: " + sum);
        scanner.close();
    }
}