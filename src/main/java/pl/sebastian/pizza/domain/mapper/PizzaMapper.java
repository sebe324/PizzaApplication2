package pl.sebastian.pizza.domain.mapper;

import org.springframework.stereotype.Component;
import pl.sebastian.pizza.data.entity.pizza.PizzaEntity;
import pl.sebastian.pizza.remote.rest.dto.request.AddPizzaDto;

@Component
public class PizzaMapper {
    public PizzaEntity mapToPizzaEntity(AddPizzaDto addPizzaDto){
        PizzaEntity pizzaEntity = new PizzaEntity();
        pizzaEntity.setName(addPizzaDto.getName());
        return pizzaEntity;
    }
}
