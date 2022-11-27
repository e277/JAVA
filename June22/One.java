import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        double[] marks = new double[5];
        double sum_of_marks = 0, percentage = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Calculate student's percentage: ");

        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                System.out.println("Enter a mark: ");
                marks[i] = scan.nextDouble();
                System.out.println("Mark " + (i) + ": " + marks[i] + "\n");
            } else if (i == 4) {
                System.out.println("Enter last mark: ");
                marks[i] = scan.nextDouble();
                System.out.println("Mark " + (i + 1) + ": " + marks[i] + "\n");
            } else {
                System.out.println("Enter another mark: ");
                marks[i] = scan.nextDouble();
                System.out.println("Mark " + (i + 1) + ": " + marks[i] + "\n");
            }
        }
        for (int mark = 0; mark < marks.length; mark++) {
            sum_of_marks += marks[mark];
            percentage = sum_of_marks * 100 / 500;
        }
        if (percentage >= 60 && percentage <= 100) {
            System.out.println("Grade: A");
        } else if (percentage >= 50 && percentage < 60) {
            System.out.println("Grade: B");
        } else if (percentage >= 40 && percentage < 50) {
            System.out.println("Grade: C");
        } else if (percentage < 40) {
            System.out.println("Grade: Fail");
        }

        // // closing scanner
        scan.close();
    }
}
