import java.util.Arrays;

public class EvenBeforeOddQ4 {
    public static void main(String[] args) {
        int i = 0;
        int[] even_and_odd = { 1, 7, 8, 5, 7, 13, 0, 2, 4, 9 };

        System.out.println("========================================================");
        System.out.println("Original array: " + Arrays.toString(even_and_odd));
        while (i < even_and_odd.length && even_and_odd[i] % 2 == 0) {
            i++;
        }

        for (int j = i + 1; j < even_and_odd.length; j++) {
            if (even_and_odd[j] % 2 == 0) {
                int temp = even_and_odd[i];
                even_and_odd[i] = even_and_odd[j];
                even_and_odd[j] = temp;
                i++;
            }
        }
        System.out.println("========================================================");
        System.out.println("New Array: " + Arrays.toString(even_and_odd));
        System.out.println("========================================================");
    }
}
