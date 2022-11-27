import java.util.Scanner;

public class MultiplicationTable6 {
    public static void main(String args[]) {
        int num;
        int i = 1;
        Scanner input_number = new Scanner(System.in);

        System.out.print("Enter times table number: ");
        num = input_number.nextInt();
        input_number.close();

        while (i <= 12) {
            System.out.println(num + " x " + i + "  = " + num * i);
            i++;
        }
    }
}
