package nl.amis.shippingmanagement.shippingservice.aggregates;

import java.util.logging.Logger;

public class ShippingAggregate {

    private final static Logger LOG = Logger.getLogger(ShippingAggregate.class.getName());

    private String shippingId;

    private String orderId;

    private String paymentId;

    public ShippingAggregate() {
    }
}
