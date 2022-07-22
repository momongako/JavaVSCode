package Buoi08.ExStockBT;

public class Order {
    private Integer type;
    private String sIDStock;
    private String sIDTrader;
    private Integer amount;
    private Float price;

    public Order(Integer type, String sIDStock, String sIDTrader, Integer amount, Float price) {
        this.type = type;
        this.sIDStock = sIDStock;
        this.sIDTrader = sIDTrader;
        this.amount = amount;
        this.price = price;
    }
}
