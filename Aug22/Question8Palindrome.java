import java.util.Scanner;

public class Question8Palindrome {
    // method to reversed a number
    int reversedNum(int number) {
        // reverse number
        int reverse = 0;
        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }
        return reverse;
    }

    // method to check if reversed num is equal to sum of number
    boolean checkPalindrome(int number) {
        return (reversedNum(number) == number);
    }

    void add(int number) {
        int reverse = 0;
        while (number > 0 && number <= 999999999) {
            reverse = reversedNum(number);
            number += reverse;

            if (checkPalindrome(number)) {
                System.out.println(number + " is Palindrome");
                break;
            }
            // else {
            // System.out.println(number + " is not Palindrome");
            // }
        }
    }

    public static void main(String[] args) {
        // scan number from
        System.out.print("Enter Number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        Question8Palindrome pal = new Question8Palindrome();
        pal.add(number);
        input.close();
    }
}