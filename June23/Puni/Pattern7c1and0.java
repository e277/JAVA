public class Pattern7c1and0 {
    public static void main(String[] args) {
        int pattern = 5, num = 1;

        for (int i = 0; i < pattern; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                // num = (num == 1) ? 0 : 1;
                num = 1 - num;
            }
            num = i % 2;
            System.out.println();
        }
    }
}