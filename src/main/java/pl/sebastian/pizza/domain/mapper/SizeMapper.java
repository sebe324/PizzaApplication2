package pl.sebastian.pizza.domain.mapper;

import org.springframework.stereotype.Component;
import pl.sebastian.pizza.data.entity.size.SizeEntity;

@Component
public class SizeMapper {
    public SizeEntity mapToSizeEntity(addSizeDto addSizeDto, Integer pizzaId){
        SizeEntity sizeEntity= new SizeEntity();
        sizeEntity.setSizeType(addSizeDto.getSize().name());
        sizeEntity.setPriceBase(addSizeDto.getPrice());
        sizeEntity.setPizzaId(pizzaId);
        return sizeEntity;
    }
}
