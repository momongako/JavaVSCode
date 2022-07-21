package BTVN07.EX01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> lstCust = new ArrayList<>();
        List<Transaction> lstTrans = new ArrayList<>();
        Customer cus1 = new Customer("maou", "hanoi");
        lstCust.add(cus1);
        Transaction trs1 = new Transaction(cus1, 2021, "kem", 8);
        Transaction trs2 = new Transaction(cus1, 2021, "kem", 2);
        Transaction trs3 = new Transaction(cus1, 2021, "kem", 6);
        Transaction trs4 = new Transaction(cus1, 2021, "kem", 10);
        Transaction trs5 = new Transaction(cus1, 2021, "kem", 1);
        Transaction trs6 = new Transaction(cus1, 2021, "kem", 5);
        Transaction trs7 = new Transaction(cus1, 2021, "kem", 12);
        Transaction trs8 = new Transaction(cus1, 2021, "kem", 23);

        lstTrans.add(trs1);
        lstTrans.add(trs2);
        lstTrans.add(trs3);
        lstTrans.add(trs4);
        lstTrans.add(trs5);
        lstTrans.add(trs6);
        lstTrans.add(trs7);
        lstTrans.add(trs8);

        lstTrans.stream()
                .sorted()
                .forEach(p -> System.out.println(p + "" + p.getAmount()));

    }
}
