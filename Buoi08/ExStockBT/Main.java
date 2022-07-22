package Buoi08.ExStockBT;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Map<String, Stock> hm = new HashMap<>();

        Stock st1 = new Stock("FPT");
        Stock st2 = new Stock("VNPT");

        hm.put("FPT", st1);
        hm.put("VNPT", st2);
        Map<Stock, Queue<Order>> hm_st_sellq = new HashMap<>();
        Map<Stock, Queue<Order>> hm_st_Buyq = new HashMap<>();

        for (String sIdStock : hm.keySet()) {
            Stock st = hm.get(sIdStock);
            hm_st_sellq.put(st, new PriorityQueue<>());
            hm_st_Buyq.put(st, new PriorityQueue<>());
        }

        // 1
        Order ord1 = new Order(1, "sIDStock", "sIDTrader", 1, 4.256f);
        Order ord2 = new Order(2, "sIDStock", "sIDTrader", 5, 4.256f);

    }
}
