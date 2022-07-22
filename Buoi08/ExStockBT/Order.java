package Buoi08.ExStockBT;

public class Order implements Comparable<Order>{
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getsIDStock() {
        return sIDStock;
    }

    public void setsIDStock(String sIDStock) {
        this.sIDStock = sIDStock;
    }

    public String getsIDTrader() {
        return sIDTrader;
    }

    public void setsIDTrader(String sIDTrader) {
        this.sIDTrader = sIDTrader;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public int compareTo(Order o) {
        return this.price.compareTo(o.price);
    }
}
