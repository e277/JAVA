import java.util.Arrays;
import java.util.Scanner;

public class NonDuplicate {
    public int array_size;
    public int[] array_of_numbers;
    public Scanner scanner = new Scanner(System.in);

    public NonDuplicate() {
    }

    public NonDuplicate(int array_size, int[] array_of_numbers) {
        this.array_size = array_size;
        this.array_of_numbers = array_of_numbers;
    }

    public void setArray_size(int array_size) {
        this.array_size = array_size;
    }

    public void setArray_of_numbers(int[] array_of_numbers) {
        this.array_of_numbers = array_of_numbers;
    }

    public int getArray_size() {
        return this.array_size;
    }

    public int[] getArray_of_numbers() {
        return this.array_of_numbers;
    }

    public void input() {
        System.out.print("Enter the number of elements: ");
        this.array_size = scanner.nextInt();
        this.array_of_numbers = new int[this.array_size];

        int array_length = this.array_of_numbers.length;
        System.out.println("Enter the elements: ");
        for (int i = 0; i < array_length; i++) {
            this.array_of_numbers[i] = scanner.nextInt();
        }
    }

    public void remove_non_duplicate() {
        int j = 0, count_of_duplicate = 1;
        int length = this.getArray_of_numbers().length;
        Arrays.sort(this.getArray_of_numbers());

        for (int i = 0; i < length - 1; i++) {
            if (this.array_of_numbers[i] != this.array_of_numbers[i + 1] && count_of_duplicate == 1) {
                array_of_numbers[j++] = this.array_of_numbers[i];
            }
        }
        array_of_numbers[j++] = this.array_of_numbers[length - 1];
        System.out.print("The non-duplicate elements are: ");
        for (int k = 0; k < j; k++) {
            System.out.print(this.array_of_numbers[k] + " ");
        }
    }

    public static void main(String[] args) {
        NonDuplicate non_duplicate = new NonDuplicate();
        non_duplicate.input();
        non_duplicate.remove_non_duplicate();
    }
}
