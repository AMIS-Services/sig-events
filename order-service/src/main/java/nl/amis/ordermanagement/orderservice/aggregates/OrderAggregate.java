package nl.amis.ordermanagement.orderservice.aggregates;


import java.math.BigDecimal;
import java.util.logging.Logger;

public class OrderAggregate {

    private final static Logger LOG = Logger.getLogger(OrderAggregate.class.getName());

    private String orderId;

    private ItemType itemType;

    private BigDecimal price;

    private String currency;

    private String country;

    private OrderStatus orderStatus;

    public OrderAggregate() {
    }

}
