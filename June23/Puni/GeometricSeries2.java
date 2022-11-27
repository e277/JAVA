import java.util.Scanner;

public class GeometricSeries2 {
    public static void main(String[] args) {
        double index, sum = 0.0;
        double number;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = scanner.nextDouble();
        scanner.close();

        for (index = 1; index <= number; index++) {
            // sum = sum + 1/Math.pow(2,index);
            sum += (1 / index);
        }

        System.out.println("Sum of series: " + sum);
    }
}