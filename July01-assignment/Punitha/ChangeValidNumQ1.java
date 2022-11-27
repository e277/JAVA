import java.util.Arrays;

public class ChangeValidNumQ1 {
    public static void main(String[] args) {
        // Input : arr[] = {2, 2, 0, 4, 0, 8}
        // Output : 4 4 8 0 0 0
        int[] array_of_integers = { 2, 2, 0, 4, 0, 8 };
        int[] new_array = new int[6];
        int invalid = 0, count = 0;

        System.out.println("=================================");
        System.out.println("Original Array: " + Arrays.toString(array_of_integers));

        System.out.println("=================================");
        for (int i = 0; i < array_of_integers.length - 1; i++) {
            if (array_of_integers[i] != 0 && array_of_integers[i] == array_of_integers[i + 1]) {
                array_of_integers[i] *= 2;
                array_of_integers[i + 1] = invalid;
                i++;
            }
            // new_array[i] = array_of_integers[i];
        }
        // Step 5: Push all the zeros at the end of 'arr[]'
        for (int j = 0; j < array_of_integers.length; j++) {
            if (array_of_integers[j] != invalid) {
                new_array[count] = array_of_integers[j];
                count++;
            }
        }
        new_array[count] = invalid;

        System.out.println("=================================");
        System.out.print("Modified Array: " + Arrays.toString(new_array));
    }
}

// STEP 1: Traverse the array from 0 to n-1(inclusively).
// STEP 2: Check if arr[i] is not equal to 0 and arr[i]==arr[i+1](next value is
// same as current value).
// STEP 3: If true, then make the current value twice of the self.
// STEP 4: Update next element as 0 and do i++.
// STEP 5: Traverse the array from i = 0 to n-1(step of shifting all the zeroes
// to the end).
// STEP 6: Check if arr[i] != 0.
// STEP 7: Arr[count]=arr[i] and do count++.
// STEP 8: From the traversal of till count is less than n.
// STEP 9: Arr[count]=0 and do count++.
// STEP 10: Print the array.