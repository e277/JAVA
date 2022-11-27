public class FinalDemo {
    public static void main(String[] args) {
        Square square = new Square();
        square.printMethod();
        // square.SIZE = 20; // Error! Cannot change final variable
    }
}
