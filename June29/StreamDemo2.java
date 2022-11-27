import java.io.ByteArrayInputStream;

public class StreamDemo2 {
    public static void main(String[] args) {
        // byte[] bWrite = { 11, 21, 3, 40, 5 };
        byte[] bWrite = { 65, 66, 67, 68, 69 };

        // Using for loop
        for (int i = 0; i < bWrite.length; i++) {
            char c = (char) bWrite[i];
            System.out.println("Character: " + c);
        }

        // Using ByteArrayInputStream
        ByteArrayInputStream in = new ByteArrayInputStream(bWrite);
        int b = 0;
        while ((b = in.read()) != -1) {
            // Convert byte to character
            char ch = (char) b;
            // Print the character
            System.out.println("Char : " + ch);
        }
    }
}