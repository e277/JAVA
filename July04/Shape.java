public class Shape {
    // public void printMethod() {
    // System.out.println("Printed in Shape class");
    // }

    // // For demoing final method
    public final int SIZE = 10;

    public final void printMethod() {
        System.out.println("Printed in Shape class");
        System.out.println("Size is " + SIZE);
    }
}

class Square extends Shape {
    // Overrriding the printMethod()
    public void printMethod2() {
        super.printMethod();
        System.out.println("Printed in Square class");
        System.out.println("Size is " + super.SIZE);
    }
}