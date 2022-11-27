package June27;

import java.util.Scanner;

public class Wrapper {
    int number;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Integer to convert to Wrapper: ");

        int input_number = input.nextInt();
        System.out.println("You entered to be converted: " + input_number + "\n");

        Integer converted_number = input_number;

        System.out.println("The integer value of " + input_number + " = " + converted_number.intValue());
        System.out.println("The btye value of " + input_number + " = " + converted_number.byteValue());
        System.out.println("The short value of " + input_number + " = " + converted_number.shortValue());
        System.out.println("The long value of " + input_number + " = " + converted_number.longValue());
        System.out.println("The float value of " + input_number + " = " + converted_number.floatValue());
        System.out.println("The double value of " + input_number + " = " + converted_number.doubleValue());

        // ComapareTo method
        System.out.println("\nCompareTo method");
        System.out.println("Enter string 1: ");
        String string1 = input.next();
        System.out.println("Enter string 2: ");
        String string2 = input.next();

        System.out.println("The result of comparing " + string1 + " and " + string2 + " = "
                + string1.compareTo(string2));

        // EqualsTo method
        System.out.println("\nEqualsTo method");
        System.out.println("Enter string 1: ");
        string1 = input.next();
        System.out.println("Enter string 2: ");
        string2 = input.next();

        System.out.println("The result of comparing " + string1 + " and " + string2 + " = "
                + string1.equals(string2));

        input.close();
    }
}