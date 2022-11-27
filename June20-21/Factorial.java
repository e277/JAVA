import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int i;
        int fact = 1;

        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + " is " + fact);
        scanner.close();
    }
}