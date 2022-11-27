public class FormLargestNumber3 {
    public static void main(String[] args) {
        int[] array_of_numbers = { 1, 2, 3, 0, 4, 6 };

        System.out.print("\nOriginal array: ");
        for (int i = 0; i < array_of_numbers.length; i++) {
            System.out.print(array_of_numbers[i] + " ");
        }
        System.out.println("\n============================================================");

        for (int i = 0; i < array_of_numbers.length; i++) {
            for (int j = i + 1; j < array_of_numbers.length; j++) {
                if (array_of_numbers[i] < array_of_numbers[j]) {
                    int temp = array_of_numbers[i];
                    array_of_numbers[i] = array_of_numbers[j];
                    array_of_numbers[j] = temp;
                }
            }
        }
        System.out.print("Largest number formed from array: ");
        for (int i = 0; i < array_of_numbers.length; i++) {
            System.out.print(array_of_numbers[i]);
        }
        System.out.println("\n============================================================");
    }
}
