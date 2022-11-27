import java.util.Scanner;

public class FirstRepeatedChar2 {
    public static void main(String[] args) {
        String str;
        Scanner string_input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        str = string_input.nextLine();
        int index = findFirstRepeated(str);

        if (index != -1) {
            System.out.println("First Repeated character: " + str.charAt(index) + " found at index: " + index);
        } else {
            System.out.println("No repeated character found");
        }
        string_input.close();
    }

    private static int findFirstRepeated(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                if (c == str.charAt(j)) {
                    return j;
                }
            }
        }
        return -1;
    }
}