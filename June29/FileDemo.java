import java.io.File;
import java.text.SimpleDateFormat;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("FileDemo.java");

        System.out.println("\nFile name: " + file.getName());
        System.out.println("Path: " + file.getPath());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("Parent: " + file.getParent());
        System.out.println(file.exists() ? "File exists" : "File does not exist");
        System.out.println(file.canWrite() ? "Can write" : "Cannot write");
        System.out.println(file.canRead() ? "Can read" : "Cannot be read");
        System.out.println("Is" + (file.isDirectory() ? "" : " not") + " a directory");
        System.out.println("Is" + (file.isFile() ? " a normal" : " a named pipe") + " file");
        System.out.println(file.isAbsolute() ? "Is an absolute path" : "Is not an absolute path");

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        System.out.println("Last modified: " + sdf.format(file.lastModified()));
        System.out.println("File size: " + file.length() + " bytes");
    }
}
