package BTVN07.EX01;

import java.time.Year;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Customer> lstCust = new ArrayList<>();
        List<Transaction> lstTrans = new ArrayList<>();
        Customer cus1 = new Customer("thang", "hanoi", 1);
        Customer cus2 = new Customer("hai", "HCM", 2);
        Customer cus3 = new Customer("hai", "HCM", 2);
        Customer cus4 = new Customer("thang", "hanoi", 1);
        lstCust.add(cus1);
        lstCust.add(cus2);
        lstCust.add(cus3);
        lstCust.add(cus4);

        Transaction trs1 = new Transaction(cus1, 2021, "kem", 8);
        Transaction trs2 = new Transaction(cus1, 2020, "kem", 2);
        Transaction trs3 = new Transaction(cus1, 2021, "kem", 6);
        Transaction trs4 = new Transaction(cus1, 2022, "kem", 10);
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

        // năm 2021 và số lượng tăng dần
        List<Transaction> listStudent = lstTrans.stream()
                .filter(e -> e.getYear() == 2021)
                .collect(Collectors.toList());
        // listStudent.stream().forEach(System.out::println);

        listStudent.stream()
                .sorted()
                .forEach(p -> System.out.println(p + "" + p.getAmount()));

        // Adress trùng nhau

        Collection<String> list = Arrays.asList(cus1.getAddress(), cus2.getAddress(), cus3.getAddress(),
                cus4.getAddress());

        System.out.println("-----------------------");
        list.stream().distinct().forEach(System.out::println);

        // khách hàng trùng địa chỉ
        // List<Customer> listStudent1 = lstCust.stream()
        // .filter(e -> e.getAddress() == 'hanoi')
        // .collect(Collectors.toList());
        List<Customer> uniqueDataList = lstCust.stream().distinct().collect(Collectors.toList());
        System.out.println("Unique Data List = " + uniqueDataList);

        // in khách hàng chung 1 địa chỉ nào đos
        System.out.println("------------------");

        lstCust.stream()
                .filter(p -> p.getAddress().equals("HCM"))
                .forEach(System.out::println);

    }
}
