// Abstract class Student
public abstract class Student {
    public abstract int getMarks(int index);

}

class Student1 extends Student {
    private int[] marks = { 75, 87, 90, 84 };

    @Override
    public int getMarks(int index) {
        return marks[index];
    }

    public static void main(String[] args) {
        Student1 student = new Student1();
        System.out.println(student.getMarks(3));
    }
}

// Interface class StudentInterface
interface StudentInterface {
    public abstract int getMarks(int index);
}

class Student2 implements StudentInterface {
    private int[] marks = { 75, 87, 90, 84 };

    @Override
    public int getMarks(int index) {
        return marks[index];
    }

    public static void main(String[] args) {
        StudentInterface studentInterface = new Student2();
        System.out.println(studentInterface.getMarks(1));
    }
}
