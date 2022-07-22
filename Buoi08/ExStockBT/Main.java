package Buoi08.ExStockBT;

import Buoi08.StockEX.Transaction;

import java.util.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.*;
class PriceDesc implements Comparator<Order> {

    @Override
    public int compare(Order o1, Order o2) {
        return o2.getPrice().compareTo(o1.getPrice());
    }

}
public class Main {
    public static void main(String[] args) {
        Map<String, Stock> hm = new HashMap<>();

        Stock st1 = new Stock("FPT");
        Stock st2 = new Stock("VNPT");

        hm.put("FPT", st1);
        hm.put("VNPT", st2);
        Map<String, PriorityQueue<Order>> hm_st_Sellq = new HashMap<>();
        Map<String, PriorityQueue<Order>> hm_st_Buyq = new HashMap<>();

        for (String sIdStock : hm.keySet()) {
            hm_st_Sellq.put(sIdStock, new PriorityQueue<>( ));
            hm_st_Buyq.put(sIdStock, new PriorityQueue<>( new PriceDesc()));
        }

        // 1
        Order ordsell1 = new Order(1, "sIDStock", "trader1", 1, 50.256f);
        Order ordsell2 = new Order(2, "sIDStock", "trader2", 5, 90.256f);

        Order ordbuy1 = new Order(2, "sIDStock", "trader3", 5, 100.256f);
        Order ordbuy2 = new Order(2, "sIDStock", "trader4", 5, 90.256f);
        PriorityQueue<Order> bQ = hm_st_Buyq.get("FPT");
        bQ.add(ordsell1);
        bQ.add(ordsell2);

        List <Transaction> transactionList = new ArrayList<>();



        PriorityQueue<Order> sQ = hm_st_Sellq.get("FPT");
        sQ.add(ordbuy1);
        sQ.add(ordbuy2);
 // khop lenh
//        PriorityQueue<Order> bQ_FPT = hm_st_Buyq.get("FPT");
//        PriorityQueue<Order> sellQ_FPT = hm_st_Sellq.get("FPT");
//
//        int totalBuyAmount = bQ_FPT.stream().mapToInt(ord->ord.getAmount()).sum();
//        int totalSellAmount = sellQ_FPT.stream().mapToInt(ord->ord.getAmount()).sum();
//
//        while ( totalBuyAmount > 0 && totalSellAmount >0 ){
//            Order peekBuy = bQ_FPT.peek();
//            Order peekSell = sellQ_FPT.peek();
//            int i = 1;
//            if (peekBuy.getPrice() < peekSell.getPrice()) break;
//            else {
//                int txAmount = peekBuy.getAmount()> peekSell.getAmount() ? peekSell.getAmount() : peekBuy.getAmount();
//                transactionList.add(new Transaction("tx00"+i,"FPT",peekSell.getsIDTrader(),peekSell.getsIDTrader(),peekBuy.getsIDStock(),peekBuy.getsIDTrader(),peekSell.getAmount(), peekSell.getPrice()));
//                if (peekBuy.getAmount()> peekSell.getAmount()) {
//                    sellQ_FPT.remove(peekSell);
//                    peekBuy.setAmount(peekBuy.getAmount()- peekSell.getAmount());
//                } else {
//                    bQ_FPT.remove(peekBuy);
//                    peekSell.setAmount(peekSell.getAmount()- peekBuy.getAmount());
//                }
//            }
//        }

while (true)
{
    int iIDStock = (int) Math.round(Math.random() * (lstStock.length-1));
    int iIDTrader = (int) Math.round(Math.random() *    (lstTrader.length-1 ));
    double x = Math.random();
     int iAmount = (int) Math.round(Math.random() *  100);
     Float price=(float) Math.random()*1000;
     if (x<0.5){
         Order orld = new Order(1, dateFormat.parse("2022-08-06"),lstStock[]);
     }
}
        Queue sQ_FPT = hm_st_Sellq.get(lstStock[iIDStock]);
        Queue bQ_FPT = hm_st_Buyq.get(lstStock[iIDStock]);

        while (!bQ.isEmpty() && !sQ.isEmpty()) {
            System.out.println("buy size: " + bQ.size());
            System.out.println("sell size: " + sQ.size());
            Order buyOrder = (Order) bQ.peek();
            Order sellOrder = (Order) sQ.peek();
            if (buyOrder.getPrice() >= sellOrder.getPrice()) {
                Transantion transantion = new Transantion();
                transantion.idStock = buyOrder.getsIDStock();
                transantion.idBuyer = buyOrder.getsIDTrader();
                transantion.idSeller = sellOrder.getsIDTrader();
                transantion.price = sellOrder.getPrice();
                if (buyOrder.getAmount() < sellOrder.getAmount()) {
                    transantion.amount = buyOrder.getAmount();
                    // cập nhật lại số lượng của chứng khoán của queue
                    sellOrder.setAmount(sellOrder.getAmount() - buyOrder.getAmount());
                    bQ.poll();
                } else if (buyOrder.getAmount() > sellOrder.getAmount()) {
                    transantion.amount = sellOrder.getAmount();
                    // cập nhật lại số lượng của chứng khoán của queue
                    buyOrder.setAmount(buyOrder.getAmount() - sellOrder.getAmount());
                    sQ.poll();
                } else {
                    transantion.amount = sellOrder.getAmount();
                    bQ.poll();
                    sQ.poll();
                }

            } else {
                break;
            }

        }
    }
}
