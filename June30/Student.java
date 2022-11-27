import java.util.Arrays;

// Base class for Student
public class Student {
    protected int roll_no;
    protected String name;
    protected final int MAX_SUBJECTS = 5;

    public Student() {
    }

    public Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public final void numberOfSubjects() {
        System.out.println("Maximum subjects I can take: " + MAX_SUBJECTS);
    }

    // public String toString() {
    // return "Student [roll_no = " + roll_no + "\n name = " + name + "]";
    // }
}

// Derived class from Student
class Marks extends Student {
    protected int marks[] = new int[5];
    protected double percentage = 0.0;

    public Marks() {
    }

    public Marks(int roll_no, String name, int marks[]) {
        super(roll_no, name);
        this.marks = marks;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int marks[]) {
        this.marks = marks;
    }

    public double calculatePercentage() {
        double total = 0.0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        percentage = total / marks.length;
        return percentage;
    }

    // public void numberOfSubjects() {
    // System.out.println("Number of Subjects: " + MAX_SUBJECTS);
    // }

    public String toString() {
        return "Marks [\n\troll_no = " + roll_no + "\n\tname = " + name + ",\n\tmarks = " + Arrays.toString(marks)
                + "\n\tpercentage = " + calculatePercentage() + "%\n]";
    }

    public static void main(String[] args) {
        Marks marks = new Marks(1, "Ezra", new int[] { 100, 90, 80, 70, 60 });
        System.out.println(marks);
    }

}
