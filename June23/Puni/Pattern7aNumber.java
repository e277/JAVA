public class Pattern7aNumber {
    public static void main(String[] args) {
        int pattern = 5;

        for (int i = 1; i <= pattern; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
