package nl.amis.ecommerce.events;

import nl.amis.ecommerce.status.OrderStatus;

public class OrderUpdatedEvent {

    public final String orderId;

    public final OrderStatus orderStatus;

    public OrderUpdatedEvent(String orderId, OrderStatus orderStatus) {
        this.orderId = orderId;
        this.orderStatus = orderStatus;
    }
}
