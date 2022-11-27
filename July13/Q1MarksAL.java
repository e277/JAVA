import java.util.Collections;

public class Q1MarksAL {
    public static void main(String[] args) {
        java.util.ArrayList<String> marks = new java.util.ArrayList<>();

        System.out.println("====================================================================================");
        System.out.println("Adding marks to the list...");
        marks.add("AI-50");
        marks.add("ML-60");
        marks.add("PHP-40");
        marks.add("Java-70");

        System.out.println("====================================================================================");
        System.out.println("The marks are: \n" + marks);
        Collections.sort(marks);
        System.out.println("Sorted marks are: \n" + marks);

        System.out.println("====================================================================================");
        marks.add(1, "Angular-60");
        System.out.println("After adding another mark: \n" + marks);

        System.out.println("====================================================================================");
        marks.set(3, "ML-90");
        System.out.println("After changing ML mark: \n" + marks);

        System.out.println("====================================================================================");
        marks.remove(0);
        System.out.println("After removing AI mark: \n" + marks);

        System.out.println("====================================================================================");
        System.out.println("Finding the mark at index 0 is: " + marks.get(0));

        System.out.println("====================================================================================");
        System.out.print("Checking if a mark contains 40: ");
        for (int i = 0; i < marks.size(); i++) {
            if (marks.get(i).contains("40")) {
                System.out.println("Yes");
                break;
            }
        }
        System.out.println("====================================================================================");
        System.out.print("Finding the index of the mark containing 40: ");
        for (int i = 0; i < marks.size(); i++) {
            if (marks.get(i).contains("40")) {
                System.out.println(i);
                break;
            }
        }

        System.out.println("====================================================================================");
        int totalMarks = 0;
        for (int i = 0; i < marks.size(); i++) {
            totalMarks += Integer.parseInt(marks.get(i).split("-")[1]);
        }
        System.out.println("Total marks: " + totalMarks);

        System.out.println("====================================================================================");
        System.out.println("Average mark: " + totalMarks / marks.size());

        System.out.println("====================================================================================");
    }
}