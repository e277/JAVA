import java.util.Scanner;

public class AdditionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Addition addition = new Addition();

        System.out.println("Enter first number: ");
        addition.num1 = input.nextDouble();

        System.out.println("Enter second number: ");
        addition.num2 = input.nextDouble();

        double sum = addition.addNumbers(addition.num1, addition.num2);

        System.out.println("The sum of " + addition.num1 + " and " + addition.num2 + " is " + sum);
        input.close();
    }
}
