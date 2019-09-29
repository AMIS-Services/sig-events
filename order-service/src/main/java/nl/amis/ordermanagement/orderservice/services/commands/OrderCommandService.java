package nl.amis.ordermanagement.orderservice.services.commands;

import nl.amis.ordermanagement.orderservice.dto.commands.OrderCreateDTO;

import java.util.concurrent.CompletableFuture;

public interface OrderCommandService {

    CompletableFuture<String> createOrder(OrderCreateDTO orderCreateDTO);

}
