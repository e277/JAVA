import java.util.Scanner;

public class Pattern7gStarTriangle {
    public static void main(String[] args) {
        int rows;
        Scanner input_number = new Scanner(System.in);

        System.out.print("How Many Rows You Want In Your Pyramid: ");

        rows = input_number.nextInt();
        input_number.close();

        for (int i = rows; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
