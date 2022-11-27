import java.util.Scanner;

public class Three {

    public static void main(String[] args) {
        getNumber();
    }

    public static int getNumber() {
        Scanner mobile = new Scanner(System.in);
        System.out.print("Enter your mobile number: ");
        int numberInput = mobile.nextInt();
        System.out.println("Your mobile number is: " + numberInput);
        mobile.close();
        return numberInput;
    }
}
