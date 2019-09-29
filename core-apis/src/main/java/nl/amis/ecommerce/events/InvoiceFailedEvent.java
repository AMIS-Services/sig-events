package nl.amis.ecommerce.events;

public class InvoiceFailedEvent {

  public final String paymentId;

  public final String orderId;

  public InvoiceFailedEvent(String paymentId, String orderId) {
    this.paymentId = paymentId;
    this.orderId = orderId;
  }

}
