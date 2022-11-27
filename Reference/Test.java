public class Test {
    public static void main(String[] args) {
        System.out.println("Testing");
        // while loop
        int k = 1, i = 1, n = 9;
        while (k < n) {
            k = k + i;
            i++;
            System.out.println("k = " + k);
            System.out.println("i = " + i);
        }
    }
}