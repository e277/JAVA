import java.util.Scanner;

public class AdditionOfMatrix {
    public static void main(String[] args) {
        int rows, columns;
        int arr1[][];
        int arr2[][];
        int arr3[][];

        Scanner array_input = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        rows = array_input.nextInt();

        System.out.println("Enter the number of columns: ");
        columns = array_input.nextInt();

        arr1 = new int[rows][columns];
        arr2 = new int[rows][columns];
        arr3 = new int[rows][columns];

        System.out.println("Enter array elements for 1st: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr1[i][j] = array_input.nextInt();
            }
        }
        System.out.println("Enter array elements for 2st: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr2[i][j] = array_input.nextInt();
            }
        }

        System.out.println("Addition of array elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

        array_input.close();
    }
}
