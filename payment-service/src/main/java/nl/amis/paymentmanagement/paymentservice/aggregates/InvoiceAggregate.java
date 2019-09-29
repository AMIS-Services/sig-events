package nl.amis.paymentmanagement.paymentservice.aggregates;


import java.math.BigDecimal;
import java.util.logging.Logger;

public class InvoiceAggregate {

    private final static Logger LOG = Logger.getLogger(InvoiceAggregate.class.getName());

    private String paymentId;

    private String orderId;

    private BigDecimal price;

    private InvoiceStatus invoiceStatus;

    public InvoiceAggregate() {
    }

}
