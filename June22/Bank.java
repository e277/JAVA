import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        int option, save_password = 1234;

        System.out.println("Enter your password: ");
        Scanner input_password = new Scanner(System.in);
        int password_input = input_password.nextInt();

        if (password_input != save_password) {
            System.out.println("Wrong password. Try again: ");
            password_input = input_password.nextInt();
        }
        if (password_input == save_password) {
            welcomeScreen();
            optionScreen();

            option = input_password.nextInt();

            while (input_password.hasNext()) {
                if (option == 0) {
                    exit();
                } else if (option == 1) {
                    checkBalance();
                } else if (option == 2) {
                    deposit();
                } else if (option == 3) {
                    withdraw();
                } else {
                    System.out.println("Invalid option!");
                }
            }
        }
        input_password.close();
    }

    public static void optionScreen() {
        System.out.println("=========================");
        System.out.println("Enter your option: ");
        System.out.println("1. Check balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("0. Exit");
        System.out.println("=========================");
    }

    public static void welcomeScreen() {
        System.out.println("=========================");
        System.out.println("Welcome to the bank!");
        System.out.println("=========================");
    }

    public static void checkBalance() {
        double balance = 0.00;
        System.out.println("=========================");
        System.out.println("Your balance is: " + balance);
        System.out.println("=========================");
        optionScreen();
    }

    public static void deposit() {
        double balance = 0.00;
        double deposit;
        System.out.println("=========================");
        System.out.println("Enter amount to deposit: ");
        Scanner input_deposit = new Scanner(System.in);
        deposit = input_deposit.nextDouble();
        balance = balance + deposit;
        System.out.println("Your balance is: " + balance);
        System.out.println("=========================");
        input_deposit.close();
        checkBalance();
    }

    public static void withdraw() {
        double balance = 0.00;
        double withdraw;
        System.out.println("=========================");
        System.out.println("Enter amount to withdraw: ");

        Scanner input_withdraw = new Scanner(System.in);
        withdraw = input_withdraw.nextDouble();

        if (balance - withdraw < 0.00) {
            System.out.println("Your balance is negative! Please deposit money!");
            optionScreen();
        } else {
            balance = balance - withdraw;
            System.out.println("Your balance is: " + balance);
        }
        checkBalance();
        System.out.println("=========================");
        input_withdraw.close();
    }

    public static void exit() {
        System.out.println("=========================");
        System.out.println("Thank you for using the bank!");
        System.out.println("=========================");
    }
}
// =========================================================
