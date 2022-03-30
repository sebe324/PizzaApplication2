package pl.sebastian.pizza.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sebastian.pizza.data.entity.pizza.PizzaEntity;

public interface PizzaRepository extends JpaRepository<PizzaEntity, Integer> {
}
