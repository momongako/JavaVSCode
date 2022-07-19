package BTVN06;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD");
        Map<Order, ArrayList<OrderDetail>> tm = new TreeMap<>();
        Order or1 = new Order(11, dateFormat.parse("2022-08-06"), "Cus01");
        Order or2 = new Order(2, dateFormat.parse("2022-08-06"), "Cus02");
        ArrayList<OrderDetail> list = new ArrayList<>();
        // ArrayList<OrderDetail> list1 = new ArrayList<>();
        OrderDetail orDetail1 = new OrderDetail(11, 1, 1, 10, 100F);
        OrderDetail orDetail2 = new OrderDetail(11, 2, 5, 7, 40F);
        OrderDetail orDetail3 = new OrderDetail(2, 3, 3, 1110, 100F);
        OrderDetail orDetail4 = new OrderDetail(2, 4, 7, 7, 30F);
        list.add(orDetail1);
        list.add(orDetail2);
        list.add(new OrderDetail(2, 3, 3, 10, 100F));
        // list1.add(orDetail3);
        // list1.add(orDetail4);
        tm.put(or1, list);
        // tm.put(or2, list1);
        // System.out.println(list1);
        // System.out.println("---------------");
        // System.out.println(list);
        // System.out.println("---------------");

        // convert map to stream
        // Tìm hóa đơn có theo mã hóa đơn
        int mahoadon = 2;
        for (OrderDetail element : list) {
            if (element.getIdOrder().equals(mahoadon)) {
                System.out.println(element);
            }
        }

        // Tong Tien
        float max = 0;
        int idx = 0;
        for (Map.Entry<Order, ArrayList<OrderDetail>> lst : tm.entrySet()) {
            float tong = 0;

            for (int i = 0; i < lst.getValue().size(); i++) {
                tong += lst.getValue().get(i).Price;
            }
            if (tong > max) {
                max = tong;
                idx++;
            }

        }
        System.out.println("Hoa don " + idx + " co tong tien lon nhat");
        System.out.println(max);
        System.out.println("---------------->");

    }
}
