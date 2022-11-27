public class Calculate {
    public int multiply(int a, int b) {
        return a * b;
    }

    // overload method
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        Calculate polymorphism = new Calculate();
        System.out.println(polymorphism.multiply(2, 3));
        System.out.println(polymorphism.multiply(2, 3, 4));
    }
}