package BTVN05.Ex01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadFrom {
    public static void main(String[] args) throws IOException {
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream("testout.txt"));
            // read student
            DataNumber student = (DataNumber) ois.readObject();
            // show student
            System.out.println(student.getNumber());
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            ois.close();
        }
    }
}
