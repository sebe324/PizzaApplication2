package pl.sebastian.pizza.remote.rest.dto.response;

import pl.piotrek.pizza.domain.model.OrderStatusType;
import pl.piotrek.pizza.remote.rest.dto.request.PersonOrderDto;
import pl.piotrek.pizza.remote.rest.dto.request.PizzaOrderDto;

import java.util.List;

public class OrderDto {
    private Integer id;
    private OrderStatusType status;
    private List<PizzaOrderDto> pizza;
    private PersonOrderDto person;

    public OrderDto() {
    }

    public OrderDto(Integer id, OrderStatusType status, List<PizzaOrderDto> pizza, PersonOrderDto person) {
        this.id = id;
        this.status = status;
        this.pizza = pizza;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OrderStatusType getStatus() {
        return status;
    }

    public void setStatus(OrderStatusType status) {
        this.status = status;
    }

    public List<PizzaOrderDto> getPizza() {
        return pizza;
    }

    public void setPizza(List<PizzaOrderDto> pizza) {
        this.pizza = pizza;
    }

    public PersonOrderDto getPerson() {
        return person;
    }

    public void setPerson(PersonOrderDto person) {
        this.person = person;
    }
}
