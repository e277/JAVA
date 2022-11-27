import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        int number;

        Scanner num_to_convert = new Scanner(System.in);

        do {
            System.out.print("Enter a number: ");

            if (num_to_convert.hasNextInt()) {
                number = num_to_convert.nextInt();
                System.out.println("The number: " + number + " in binary is = " + Integer.toBinaryString(number));
                System.out.println("The number: " + number + " in hexadecimal is = " + Integer.toHexString(number));
                System.out.println("The number: " + number + " in octal is = " + Integer.toOctalString(number));
                System.out.print("Enter a number: ");

            } else {
                System.out.println("Not a number!\n");
                num_to_convert.next();
            }

        } while (num_to_convert.hasNextInt());
        System.out.println("End of program!");

        num_to_convert.close();
    }
}
