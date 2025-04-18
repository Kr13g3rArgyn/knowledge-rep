package kz.proxy.Smart_proxy.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Order {
    private String orderId;
    private String orderName;
    private int qty;
    private double price;

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", orderName='" + orderName + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }
}
