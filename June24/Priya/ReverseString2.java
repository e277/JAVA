import java.util.Scanner;

public class ReverseString2 {
    String input_string;
    String reversed_string;

    public String reverseStr(String str) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        input_string = input.nextLine();
        reversed_string = "";

        for (int i = input_string.length() - 1; i >= 0; i--) {
            reversed_string += input_string.charAt(i);
        }

        input.close();
        return reversed_string;
    }
}