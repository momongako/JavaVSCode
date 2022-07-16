package BTVN05.Ex01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {
    public static void main(String[] args) throws IOException {
        String outputFile = "test.txt";
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(outputFile));
            // create student
            DataNumber student = new DataNumber(25);

            // write student
            oos.writeObject(student);

            System.out.println("Success...");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            oos.close();
        }
    }
}
