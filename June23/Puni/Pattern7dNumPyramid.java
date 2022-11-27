import java.util.Scanner;

public class Pattern7dNumPyramid {
    public static void main(String[] args) {
        // Initializing rowCount with 1
        int rowCount = 1;
        Scanner input_number = new Scanner(System.in);
        // Taking noOfRows value from the user
        System.out.print("How Many Rows You Want In Your Pyramid: ");

        int noOfRows = input_number.nextInt();
        input_number.close();

        System.out.println("Here Is Your Pyramid");

        for (int i = noOfRows; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rowCount; j++) {
                System.out.print(rowCount + " ");
            }

            System.out.println();
            rowCount++;
        }
    }
}