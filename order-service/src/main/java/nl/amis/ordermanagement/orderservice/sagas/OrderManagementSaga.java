package nl.amis.ordermanagement.orderservice.sagas;

import nl.amis.ecommerce.events.*;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.modelling.saga.SagaLifecycle;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;
import java.util.logging.Logger;

public class OrderManagementSaga {

    private final static Logger LOG = Logger.getLogger(OrderManagementSaga.class.getName());

    @Autowired
    private transient CommandGateway commandGateway;

    public void handle(OrderCreatedEvent orderCreatedEvent){
        LOG.info("Saga invoked with orderid " + orderCreatedEvent.orderId);

        // Associate this Saga with the shipmentId
        String paymentId = UUID.randomUUID().toString();
        SagaLifecycle.associateWith("paymentId", paymentId);

        // TODO send command
    }

    public void handle(InvoiceCreatedEvent invoiceCreatedEvent){

        LOG.info("Saga continued");

        // Associate Saga with shipping

        // Send the create shipping command
    }

}
