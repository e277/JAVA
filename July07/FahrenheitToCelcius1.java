public class FahrenheitToCelcius1 {
    public static void main(String[] args) {
        float fahrenheit, celsius;
        fahrenheit = 212f;

        celsius = ((fahrenheit - 32) * 5) / 9;
        // fahrenheit = ((celsius * 9) / 5) + 32;

        System.out.println("\n============================================================");
        System.out.println("Fahrenheit: " + fahrenheit + ", Celsius: " + celsius);
        // System.out.println("Temperature in celsius is: " + celsius);
        System.out.println("============================================================");
    }
}