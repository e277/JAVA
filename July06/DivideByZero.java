public class DivideByZero {
    public int divideByZero() {
        int i;
        int[] array = { 1, 2, 3, 4, 5 };

        try {
            for (i = 0; i < array.length + 1; i++) {
                System.out.println(array[i] / 1);
            }
            return i;
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e);
            return -1;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an exception: " + e);
            return -1;
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e);
            return -1;
        } finally {
            System.out.println("<<<=====finally=====>>>");
            System.out.println("Finally block is executed");
        }
    }
}
