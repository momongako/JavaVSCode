
package BTVN06;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;

public class Order implements Comparable<Order> {
    Integer IdOrder;
    Date OrdDate;
    String CustomerID;

    public Order(Integer IdOrder, Date OrdDate, String CustomerID) {
        this.IdOrder = IdOrder;
        this.OrdDate = OrdDate;
        this.CustomerID = CustomerID;
    }

    public Integer getIdOrder() {
        return IdOrder;
    }

    public void setIdOrder(Integer IdOrder) {
        this.IdOrder = IdOrder;
    }

    public Date getOrdDate() {
        return OrdDate;
    }

    public void setOrdDate(Date OrdDate) {
        this.OrdDate = OrdDate;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
        return "Order: " +
                "IdOrder= " + IdOrder +
                ",OrdDate= " + dateFormat.format(OrdDate) +
                ",CustomerID= " + CustomerID + ' ';
    }

    @Override
    public int compareTo(Order another) {
        return getIdOrder().compareTo(another.getIdOrder());
    }

}
