package positive;

public class Main {
    public static void main(String[] args) throws MyException {
        Q3Postive2Digit q3 = new Q3Postive2Digit(15);

        // Uncomment the following line to see the error message
        // Q3Postive2Digit q3 = new Q3Postive2Digit(-15);
        try {
            if (q3.checkAgainst < 0) {
                throw new MyException("Cannot find numbers to be added to get " + q3.checkAgainst);
            }
            q3.findNumbers();
        } catch (Exception e) {
        }
    }
}
