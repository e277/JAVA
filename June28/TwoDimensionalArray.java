import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int rows, columns;
        int arr[][];

        Scanner array_input = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        rows = array_input.nextInt();

        System.out.println("Enter the number of columns: ");
        columns = array_input.nextInt();

        arr = new int[rows][columns];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = array_input.nextInt();
            }
        }

        System.out.println("Array elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        array_input.close();
    }
}
