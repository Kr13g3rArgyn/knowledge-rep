package kz.proxy.Smart_proxy.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderEvent implements Serializable {
    private String message;
    private String status;
    private Order order;

    @Override
    public String toString() {
        return "OrderEvent {" +
                "message='" + message + '\'' +
                ", status='" + status + '\'' +
                ", order=" + order +
                '}';
    }
}
