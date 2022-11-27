import java.text.SimpleDateFormat;
import java.util.Scanner;

public class CustomException {

    public void checkExpirationDate() {
        Scanner dateInput = new Scanner(System.in);
        System.out.println("Enter date in yyyy-MM-dd format");
        String date = dateInput.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat now = new SimpleDateFormat("yyyy-MM-dd");

        if (now.equals(sdf)) {

        }
        dateInput.close();
    }

    public static void main(String[] args) {

    }
}