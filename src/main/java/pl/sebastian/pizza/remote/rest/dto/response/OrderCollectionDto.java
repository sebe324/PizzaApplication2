package pl.sebastian.pizza.remote.rest.dto.response;

import pl.piotrek.pizza.remote.rest.dto.request.PersonOrderDto;

import java.util.List;


public class OrderCollectionDto {

    private List<OrderDto> orders;

    public OrderCollectionDto() {
    }

    public OrderCollectionDto(List<OrderDto> orders) {
        this.orders = orders;
    }

    public List<OrderDto> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderDto> orders) {
        this.orders = orders;
    }
}
