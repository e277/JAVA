import java.util.Scanner;

public class MultiplicationOfMatrix {
    public static void main(String[] args) {

        int row1, row2, column1, column2;
        Scanner array_input = new Scanner(System.in);

        System.out.print("Enter number of rows in first matrix:");
        row1 = array_input.nextInt();

        System.out.print("Enter number of columns in first matrix:");
        column1 = array_input.nextInt();

        System.out.print("Enter number of rows in second matrix:");
        row2 = array_input.nextInt();

        System.out.print("Enter number of columns in second matrix:");
        column2 = array_input.nextInt();

        if (column1 != row2) {
            System.out.println("\n==========================================================");
            System.out.println("Matrix multiplication is not possible");
            System.out.println("==========================================================");
        } else {
            int arr1[][] = new int[row1][column1];
            int arr2[][] = new int[row2][column2];
            int arr3[][] = new int[row1][column2];

            System.out.println("Enter values for matrix Array1 : \n");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column1; j++)
                    arr1[i][j] = array_input.nextInt();
            }
            System.out.println("Enter values for matrix Array2 : \n");
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < column2; j++)
                    arr2[i][j] = array_input.nextInt();
            }

            System.out.println("Matrix multiplication is : \n");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column2; j++) {
                    arr3[i][j] = 0;
                    for (int k = 0; k < column1; k++) {
                        arr3[i][j] += arr1[i][k] * arr2[k][j];
                    }
                    System.out.print(arr3[i][j] + " ");
                }
                System.out.println();
            }
        }
        array_input.close();
    }
}
