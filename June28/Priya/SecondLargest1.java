import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest1 {
    public static void main(String[] args) {
        int arr1[];
        int size_of_array;
        Scanner array_input = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array");

        size_of_array = array_input.nextInt();
        arr1 = new int[size_of_array];

        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size_of_array; i++) {
            arr1[i] = array_input.nextInt();
        }
        System.out.println("The array is: " + Arrays.toString(arr1));

        Arrays.sort(arr1);
        array_input.close();
        System.out.print("The second largest number: " + arr1[size_of_array - 2]);
    }
}