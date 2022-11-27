package positive;

public class Q3Postive2Digit {
    protected int checkAgainst;
    protected int num1, num2;
    protected int sum;

    public Q3Postive2Digit(int checkAgainst) {
        this.checkAgainst = checkAgainst;
    }

    public int getSum(int num1, int num2) {
        return num1 + num2;
    }

    public void findNumbers() {
        for (int i = 0; i < this.checkAgainst; i++) {
            for (int j = 0; j < this.checkAgainst; j++) {
                sum = getSum(i, j);
                if (sum == this.checkAgainst) {
                    System.out.println(i + " & " + j + " can be added to get " + this.checkAgainst);
                }
            }
        }
    }
}
