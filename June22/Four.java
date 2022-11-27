import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner input_number = new Scanner(System.in);

        do {
            System.out.println("Enter a number: ");
            int check_number = input_number.nextInt();

            String result = check_number > 0
                    ? "The " + check_number + " is positive"
                    : check_number < 0
                            ? "The " + check_number + " is negative"
                            : "The number is zero";

            System.out.println(result);

        } while (input_number.hasNextInt());

        input_number.close();
    }
}
