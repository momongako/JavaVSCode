package BTVN05.Ex01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {
    public static void main(String[] args) throws IOException {
        String outputFile = "testout.txt";
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(outputFile));
            // create student
            DataNumber student = new DataNumber(125);
            DataNumber student1 = new DataNumber(125);
            DataNumber student2 = new DataNumber(125);
            DataNumber student3 = new DataNumber(125);
            // write student
            oos.writeObject(student);
            oos.writeObject(student1);
            oos.writeObject(student2);

            System.out.println("Success...");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            oos.close();
        }
    }
}
