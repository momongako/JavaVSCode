
package BTVN06;

import java.util.*;

public class OrderDetail implements Comparable<OrderDetail> {
    Integer IdOrder;
    Integer IdDetail;
    Integer IdItem;
    Integer Amount;
    Float Price;

    public OrderDetail(Integer IdOrder, Integer IdDetail, Integer IdItem, Integer Amount, Float Price) {
        this.IdOrder = IdOrder;
        this.IdDetail = IdDetail;
        this.IdItem = IdItem;
        this.Amount = Amount;
        this.Price = Price;
    }

    public Integer getIdOrder() {
        return IdOrder;
    }

    public void setIdOrder(Integer IdOrder) {
        this.IdOrder = IdOrder;
    }

    public Integer getIdDetail() {
        return IdDetail;
    }

    public void setIdDetail(Integer IdDetail) {
        this.IdDetail = IdDetail;
    }

    public Integer getIdItem() {
        return IdItem;
    }

    public void setIdItem(Integer IdItem) {
        this.IdItem = IdItem;
    }

    public Integer getAmount() {
        return Amount;
    }

    public void setAmount(Integer Amount) {
        this.Amount = Amount;
    }

    public Float getPrice() {
        return Price;
    }

    public void setPrice(Float Price) {
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "OrderDetail:{" +
                "IdOrder= " + IdOrder + '\'' +
                ",IdDetail= " + IdDetail + '\'' +
                ",IdItem= " + IdItem +
                ",IdAmount= " + Amount +
                ",Price= " + Price + '}';
    }

    @Override
    public int compareTo(OrderDetail another) {
        return getIdOrder().compareTo(another.getIdOrder());
    }

    public boolean contains(String string) {
        return false;
    }
}