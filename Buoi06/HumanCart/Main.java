package Buoi06.HumanCart;

import java.util.Map;
import java.util.TreeMap;

import javax.swing.DebugGraphics;

public class Main {
    public static void main(String[] args) {
        Map<Depositors, Double> dep = new TreeMap<>();
        Depositors depositors1 = new Depositors("A06338", "hanoi", 013232, 25);
        Depositors depositors2 = new Depositors("A06333", "hanoi", 013232, 25);
        Depositors depositors3 = new Depositors("A06339", "hanoi", 013232, 25);
        Depositors depositors4 = new Depositors("A06332", "hanoi", 013232, 25);
        Depositors depositors5 = new Depositors("A06331", "hanoi", 013232, 25);

        dep.put(depositors1, 100.5);
        dep.put(depositors2, 101.5);
        dep.put(depositors3, 102.5);
        dep.put(depositors4, 103.5);
        dep.put(depositors5, 104.5);

        Depositors st_ = depositors1;
        Double dtb = dep.get(st_);
        if (dtb != null) {
            dtb = dtb + 100;
            System.out.println(dtb);

        } else {
            dep.put(st_, 100.1);
        }
    }
}
