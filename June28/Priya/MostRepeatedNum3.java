import java.util.Arrays;
import java.util.Scanner;

public class MostRepeatedNum3 {
    public static void main(String[] args) {
        int array[];
        int temp, array_length, count, countofmax = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        array_length = array.length;

        countofmax = 1;
        temp = array[0];
        count = 1;

        for (int i = 1; i < array_length; i++) {
            if (array[i] == array[i - 1])
                count++;
            else {
                if (count > countofmax) {
                    countofmax = count;
                    temp = array[i - 1];
                }
                count = 1;
            }
        }

        System.out.println("The most frequent number is:" + temp);
        System.out.println("The number of times it is repeated is:" + countofmax);
        scanner.close();
    }
}
