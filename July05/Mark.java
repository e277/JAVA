public class Mark {
    private int[] marks = { 75, 87, 90, 84 };

    // overriden method
    public int getMarks(int index) {
        return marks[index];
    }
}

class Percentage extends Mark {
    // overriding method
    public int getMarks(int index) {
        return super.getMarks(index) * 100 / 100;
    }

    public static void main(String[] args) {
        Percentage percentage = new Percentage();
        System.out.println(percentage.getMarks(2));
    }
}