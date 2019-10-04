package nl.amis.ecommerce.commands;

import nl.amis.ecommerce.status.OrderStatus;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class UpdateOrderStatusCommand {

    @TargetAggregateIdentifier
    public final String orderId;

    public final OrderStatus orderStatus;

    public UpdateOrderStatusCommand(String orderId, OrderStatus orderStatus) {
        this.orderId = orderId;
        this.orderStatus = orderStatus;
    }
}
