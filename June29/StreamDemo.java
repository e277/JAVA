import java.io.*;

public class StreamDemo {
    public static void main(String args[]) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");
            int c;

            System.out.println("\nReading from input.txt");
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            System.out.println("\nWriting to output.txt");
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
        System.out.println("\nDone");
    }
}
