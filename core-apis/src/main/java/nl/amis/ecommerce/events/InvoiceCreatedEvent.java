package nl.amis.ecommerce.events;

import java.math.BigDecimal;

public class InvoiceCreatedEvent  {

    public final String paymentId;

    public final String orderId;

    public final BigDecimal price;

    public InvoiceCreatedEvent(String paymentId, String orderId, BigDecimal price) {
        this.paymentId = paymentId;
        this.orderId = orderId;
        this.price = price;
    }
}
