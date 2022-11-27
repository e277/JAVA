package positive;

public class MyException extends Exception {
    // constructor
    public MyException(String str) {
        // super(str);
        System.out.println("MyException: " + str);
    }
}
