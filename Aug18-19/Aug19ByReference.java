public class Aug19ByReference {
    public int age = 25;

    public void Age(Aug19ByReference a) {
        a.age = a.age + 10;
    }

    public static void main(String[] args) {
        Aug19ByReference a = new Aug19ByReference();
        System.out.println("Before: " + a.age);
        a.Age(a);
        System.out.println("After: " + a.age);
    }
}
