package pl.sebastian.pizza.remote.rest.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.sebastian.pizza.domain.service.PizzaService;
import pl.sebastian.pizza.remote.rest.dto.request.AddPizzaDto;
import pl.sebastian.pizza.remote.rest.dto.response.PizzaDto;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;
@RequestMapping(value = "/api/v1/pizzas", produces = APPLICATION_JSON_VALUE)
@RestController
public class PizzaController {

    private final PizzaService pizzaService;

    public PizzaController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }


    @PostMapping
    public ResponseEntity<PizzaDto> addPizza(@RequestHeader("Access-Token") String token,
                                             @RequestBody AddPizzaDto addPizzaDto) {
        return ResponseEntity.ok(null);
    }

    @PutMapping("/{pizza-id}")
    public ResponseEntity<PizzaDto> updatePizza(@RequestHeader("Access-Token") String token,
                                                @PathVariable("pizza-id") Integer pizzaId,
                                                @RequestBody AddPizzaDto addPizzaDto) {
        PizzaDto pizzaDto = pizzaService.addPizza(addPizzaDto, token);
        return ResponseEntity.ok(pizzaDto);
    }

    @DeleteMapping("/{pizza-id}")
    public ResponseEntity<Void> deletePizza(@RequestHeader("Access-Token") String token, @PathVariable("pizza-id") Integer pizzaId) {
        return ResponseEntity.ok().build();
    }
}