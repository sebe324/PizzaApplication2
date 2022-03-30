package pl.sebastian.pizza.domain.service;

import org.springframework.stereotype.Service;
import pl.sebastian.pizza.data.entity.pizza.PizzaEntity;
import pl.sebastian.pizza.data.entity.size.SizeEntity;
import pl.sebastian.pizza.data.repository.PizzaRepository;
import pl.sebastian.pizza.domain.mapper.PizzaMapper;
import pl.sebastian.pizza.remote.rest.dto.request.AddPizzaDto;
import pl.sebastian.pizza.remote.rest.dto.request.AddSizeDto;
import pl.sebastian.pizza.remote.rest.dto.response.PizzaDto;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PizzaService {

    public PizzaService(PizzaRepository pizzaRepository, PizzaMapper pizzaMapper) {
        this.pizzaRepository = pizzaRepository;
        this.pizzaMapper = pizzaMapper;
    }

    private final PizzaRepository pizzaRepository;
    private final PizzaMapper pizzaMapper;

    public PizzaDto addPizza(AddPizzaDto addPizzaDto, String token) {

        //AuthorizationService.checkToken(token);
        AuthorizationService.checkToken(token);
        //if(token == null || token.equals("xzv")) {
        // throw new UnauthorizedException("Błędny token");
        // }
        //PizzaEntity pizzaEntity = pizzaMapper.mapToPizzaEntity(addPizzaDto);
        pizzaRepository.save(pizzaMapper.mapToPizzaEntity(addPizzaDto));

        /* PizzaEntity pizzaEntity = new PizzaEntity();
        pizzaEntity.setName(addPizzaDto.getName());
        PizzaEntity savedPizzaEntity = pizzaRepository.save(pizzaEntity);
        */
    }
    List<AddSizeDto> addSizeDtoList = addPizzaDto.getAddSizeDtoList();
    List<SizeEntity> sizeEntity = addSizeDtoList
            .stream()
    .map(addSizeDto->{
        SizeEntity sizeEntity = new SizeEntity();
        sizeEntity.setSizeType(sizeDto.getSize().name());
        sizeEntity .setPriceBase(sizeDto.getPrice());
        sizeEntity.setId(sizeDto.getId());
        sizeEntity.setPizzaId(savedPizzaEntity.getI());
        return sizeEntity;
    }).collect(Collectors.toList());
    PizzaEntity savedSzeEntity=sizeRepository.saveAll(sizeEntity);

}
