import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter File Name: ");
        String file_name = scanner.nextLine();
        FileReader f_reader;

        try {
            f_reader = new FileReader(file_name);
            BufferedReader reader = new BufferedReader(f_reader);

            String cursor, content = "";
            int lines = 0, words = 0, chars = 0;

            while ((cursor = reader.readLine()) != null) {
                lines++;
                content += cursor;

                String[] _words = cursor.split(" ");
                for (int i = 0; i < _words.length; i++) {
                    words++;
                }
            }
            chars = content.length();

            reader.close();

            System.out.println("File: " + file_name + " has " + lines + " lines of content");
            System.out.println("File: " + file_name + " has " + words + " words of content");
            System.out.println("File: " + file_name + " has " + chars + " chars of content");

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}

// Write a Java program that displays the number of characters, lines and words
// in a text?
