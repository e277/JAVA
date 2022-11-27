import java.util.Scanner;

public class Calculator3 {
    public static void main(String[] args) {

        char operator;
        double num1, num2, result;
        int option = 1;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\nPress 0 to quit... OR Press 1 to continue...");
            option = scanner.nextInt();

            if (option != 0 || option != 1) {
                System.out.println("==========================================================");
                System.out.println("Invalid option. Please try again.");
                System.out.println("==========================================================");
                System.out.println("Press 0 to quit... OR Press 1 to continue...");
            } else {
                if (option == 0) {
                    System.out.println("End of program!");
                    System.exit(0);

                } else {
                    System.out.println("Input operator: +, /, *, - or %");
                    operator = scanner.next().charAt(0);
                    System.out.println();

                    if (operator == '+' || operator == '/' || operator == '*' || operator == '-' || operator == '%') {

                        System.out.print("Enter first number: ");
                        num1 = scanner.nextInt();
                        System.out.print("Enter second number: ");
                        num2 = scanner.nextInt();
                        System.out.println();

                        switch (operator) {
                            case '+':
                                result = num1 + num2;
                                System.out
                                        .println("The number " + num1 + " + " + num2 + " is equal to " + result + "\n");

                                break;
                            case '/':
                                result = num1 / num2;
                                System.out
                                        .println("The number " + num1 + " / " + num2 + " is equal to " + result + "\n");
                                break;
                            case '*':
                                result = num1 * num2;
                                System.out
                                        .println("The number " + num1 + " * " + num2 + " is equal to " + result + "\n");
                                break;
                            case '-':
                                result = num1 - num2;
                                System.out
                                        .println("The number " + num1 + " - " + num2 + " is equal to " + result + "\n");
                                break;
                            case '%':
                                result = num1 % num2;
                                System.out
                                        .println("The number " + num1 + " % " + num2 + " is equal to " + result + "\n");
                                break;
                            default:
                                System.out.println("Not a operation!\n");
                                break;
                        }
                    } else {
                        System.out.println("Not an operator!\n");
                    }
                }
            }
        } while (option != 0);

        // close scanner
        scanner.close();
    }
}