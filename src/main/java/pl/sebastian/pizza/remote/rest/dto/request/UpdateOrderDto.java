package pl.sebastian.pizza.remote.rest.dto.request;

import pl.sebastian.pizza.domain.model.OrderStatusType;

import java.util.List;

public class UpdateOrderDto {

    private OrderStatusType status;
    private List<PersonOrderDto> person;
    private List<PizzaOrderDto> pizza;

    public UpdateOrderDto(){

    }

    public UpdateOrderDto(OrderStatusType status, List<PersonOrderDto> person, List<PizzaOrderDto> pizza) {
        this.status = status;
        this.person = person;
        this.pizza = pizza;
    }

    public OrderStatusType getStatus() {
        return status;
    }

    public void setStatus(OrderStatusType status) {
        this.status = status;
    }

    public List<PersonOrderDto> getPerson() {
        return person;
    }

    public void setPerson(List<PersonOrderDto> person) {
        this.person = person;
    }

    public List<PizzaOrderDto> getPizza() {
        return pizza;
    }

    public void setPizza(List<PizzaOrderDto> pizza) {
        this.pizza = pizza;
    }
}
