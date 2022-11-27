public class Question7DownStar {
    public static void main(String[] args) {
        int i, j, starRow = 5;
        System.out.println();
        for (i = starRow; i > 0; i--) {
            for (j = 0; j < i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}