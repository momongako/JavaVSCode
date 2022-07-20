package Buoi07;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
class Element {

    int id, amount;

    Element(String id, String amount) {
        this.id = Integer.parseInt(id.trim());
        this.amount = Integer.parseInt(amount.trim());
    }
}

class MinMax {
    private int min;
    private int max;

    MinMax(int m) {
        min = max = m;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

}

public class ProcessFile {

    public static void main(String[] args) throws FileNotFoundException {
        Map<Integer, MinMax> hm = new HashMap<>();

        try {
            readFromFile("Buoi07\\data.txt", hm);
            // Ghi ra file
            writeFlie("Buoi07\\output.txt", hm);
            System.out.println("Tu lấy hm =>file");
        } catch (IOException ex) {
            Logger.getLogger(ProcessFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static void readFromFile(String fName, Map<Integer, MinMax> hm) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(fName));
        // FileWriter fw = new FileWriter("Buoi07\\output.txt");
        // BufferedWriter wr = new BufferedWriter(new FileWriter("Buoi07\\output.txt"));
        String st = br.readLine();
        while (st != null) {
            // xử lý
            st = st.replace(".", "");
            String[] arr = st.split(";"); // id: amount;
            for (int i = 0; i < arr.length; i++) {
                String[] id_amount = arr[i].split(":");
                Element el = new Element(id_amount[0], id_amount[1]);
                MinMax mm = hm.get(el.id);
                if (mm == null)
                    hm.put(el.id, new MinMax(el.amount));
                else {
                    if (el.amount < mm.getMin())
                        mm.setMin(el.amount);
                    if (el.amount > mm.getMax())
                        mm.setMax(el.amount);
                }

            }
            st = br.readLine();

        }

    }

    static void writeFlie(String fName, Map<Integer, MinMax> hm) throws IOException {
        BufferedWriter bfw = new BufferedWriter(new FileWriter(fName));
        try {
            bfw.write(Integer.toString(hm.size()));

            bfw.newLine();
            for (Map.Entry<Integer, MinMax> SP : hm.entrySet()) {
                bfw.write(SP.getKey() + ":"
                        + SP.getValue().getMin() +
                        ", " + SP.getValue().getMax()
                        + ".");
                bfw.newLine();
            }
            bfw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
