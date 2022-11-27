public class Pattern7eNumLetter {
    public static void main(String[] args) {
        int alphabet = 65;
        int rowCount = 1;
        int noOfRows = 5;
        int number = 1;

        for (int i = 1; i <= noOfRows; i++) {
            // printing in pyramid not working
            for (int space = 1; space <= noOfRows; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rowCount; j++) {
                if (i % 2 == 1) {
                    System.out.print(number + " ");
                    number++;
                } else {
                    System.out.print((char) alphabet + " ");
                    alphabet++;
                }
            }
            System.out.println();
            rowCount++;
        }
    }
}