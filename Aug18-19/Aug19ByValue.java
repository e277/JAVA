public class Aug19ByValue {
    public int age = 25;

    public void Age(int age) {
        age = age + 10;
    }

    public static void main(String[] args) {
        Aug19ByValue a = new Aug19ByValue();
        System.out.println("Before: " + a.age);
        a.Age(29);
        System.out.println("After: " + a.age);
    }
}

// JAVA : Inheritance, Call by Value and call by reference
