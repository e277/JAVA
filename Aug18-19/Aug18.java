public class Aug18 {
    public static void main(String[] args) {
        int[] basic_pay = { 100000, 800000, 300000, 500000, 500000, 200000, 705000, 900000 };

        // find the second highest value from the array of values
        int second_highest = basic_pay[0];
        for (int i = 1; i < basic_pay.length; i++) {
            if (basic_pay[i] > second_highest) {
                second_highest = basic_pay[i];
            }
        }
    }
}

// -- SQL Query to find the second highest salary of Employee - JAVA Program
// -- From Trainer Two to Everyone 02:00 PM
// -- Write an SQL Query to find the number of employees according to gender
// whose DOB is between 01/01/1960 to 31/12/1975.
// -- SQL Query to find the second highest salary of Employee
// -- write a java programming to do the same in a single dimension array
// -- make it fast