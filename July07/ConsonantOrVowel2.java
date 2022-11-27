import java.util.Scanner;

public class ConsonantOrVowel2 {
    public static void main(String[] args) {
        Scanner input_letter = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String letter = input_letter.nextLine().toLowerCase();

        if (letter.length() > 1) {
            System.out.println("============================================================");
            System.out.println("I said letter, not word.");
            System.out.println("============================================================");
        } else {
            if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o")
                    || letter.equals("u")) {
                System.out.println("============================================================");
                System.out.println("The letter '" + letter + "' is a vowel.");
                System.out.println("============================================================");
            } else if (letter.equals("y")) {
                System.out.println("============================================================");
                System.out.println("The letter '" + letter + "' is sometimes a vowel, sometimes a consonant.");
                System.out.println("============================================================");
            } else {
                System.out.println("============================================================");
                System.out.println("The letter '" + letter + "' is a consonant.");
                System.out.println("============================================================");
            }
        }

        input_letter.close();
    }
}
