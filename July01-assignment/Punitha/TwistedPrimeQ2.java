import java.util.Scanner;

public class TwistedPrimeQ2 {
    public static void main(String[] args) {

        int number, reverse, sum = 0, flag;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the prime number?");
        number = scanner.nextInt();

        while (number != 0) {
            reverse = number % 10;
            sum = sum * 10 + reverse;
            number = number / 10;
        }

        flag = 0;
        for (int j = 2; j <= sum / 2; j++) {
            if ((sum % j) == 0) {
                flag = 1;
                break;
            }
        }

        if (flag == 0) {
            System.out.println("This number is a twisted Prime");
        } else {
            System.out.println("This number is not a Twisted Prime");
        }

        scanner.close();
    }
}

// STEP 1: START
// STEP 2: DEFINE number, reverse, flag
// STEP 3: SET sum = 0
// STEP 4: ENTER number
// STEP 5: REPEAT STEP 6 to 8 UNTIL (n!=0)
// STEP 6: reverse = number%10
// STEP 7: sum = sum*10 + reverse
// STEP 8: number = number/10
// STEP 9: SET flag = 0
// STEP 10: REPEAT STEP 11 UNTIL j<=sum/2
// STEP 11: if(sum%j)==0
// then
// set flag = 1
// break
// STEP 12: if(flag==0)
// then PRINT "yes"
// else
// PRINT "no"
// STEP 13: END