import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int arr1[];
        int arr_length;
        int sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        arr_length = input.nextInt();

        System.out.println("Enter array elements: ");
        arr1 = new int[arr_length];

        for (int i = 0; i < arr_length; i++) {
            arr1[i] = input.nextInt();
            sum += arr1[i];
        }

        System.out.println(arr1);
        System.out.println("Sum of array elements: " + sum);
        // System.out.println("Array length: " + arr1.length);

        // for (int i = 0; i < arr_length; i++) {
        // System.out.println("Element " + i + ": " + arr1[i]);
        // }

        input.close();
    }
}
