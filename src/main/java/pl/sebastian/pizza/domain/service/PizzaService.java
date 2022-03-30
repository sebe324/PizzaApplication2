package pl.sebastian.pizza.domain.service;

import org.springframework.stereotype.Service;
import pl.sebastian.pizza.data.entity.pizza.PizzaEntity;
import pl.sebastian.pizza.data.entity.size.SizeEntity;
import pl.sebastian.pizza.data.repository.PizzaRepository;
import pl.sebastian.pizza.domain.mapper.PizzaMapper;
import pl.sebastian.pizza.domain.mapper.SizeMapper;
import pl.sebastian.pizza.domain.model.SizeType;
import pl.sebastian.pizza.remote.rest.dto.request.AddPizzaDto;
import pl.sebastian.pizza.remote.rest.dto.request.AddSizeDto;
import pl.sebastian.pizza.remote.rest.dto.response.PizzaDto;
import pl.sebastian.pizza.remote.rest.dto.response.SizeDto;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PizzaService {
private final PizzaRepository pizzaRepository;
private final SizeRepository sizeRepository=null;
private final PizzaMapper pizzaMapper;
private final SizeMapper sizeMapper = null;

    public PizzaService(PizzaRepository pizzaRepository, SizeRepository sizeRepository, PizzaMapper pizzaMapper, SizeMapper sizeMapper) {
        this.pizzaRepository = pizzaRepository;
        this.sizeRepository = sizeRepository;
        this.pizzaMapper = pizzaMapper;
        this.sizeMapper = sizeMapper;
    }

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
        List<SizeDto> sizeDtoList = savedSizeEntities.stream().map(sizeEntity->{
            SizeDto sizeDto = new SizeDto();
            sizeDto.setSize(SizeType.valueOf(sizeEntity.getSizeType()));
            sizeDto.setPrice(sizeEntity.getPriceBase());
            sizeDto.setId(sizeEntity.getId());
            return sizeDto;
        }).collect(Collectors.toList());
        List<SizeDto> sizeDtoList = sizeEntities.stream().map(sizeEntity->sizeMapper.mapToSizeDto(sizeEntity))
                .collect(Collectors.toList());
        List<AddSizeDto> addSizeDtoList = addPizzaDto.getAddSizeDtoList();
        List<SizeEntity> sizeEntity = addSizeDtoList
                .stream()
                .map(addSizeDto -> sizeMapper.mapToSizeEntity(addSizeDto, pizzaEntity.getId())).collect(Collectors.toList());
        PizzaEntity savedSizeEntity = sizeRepository.saveAll(sizeEntity);
    }
}
