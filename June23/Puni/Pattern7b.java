public class Pattern7b {
    public static void main(String[] args) {
        int pattern = 5;

        for (int i = 1; i <= pattern; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 1) {
                    System.out.print("* ");
                } else if (i % 2 == 0) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
}