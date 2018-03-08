package com.vlavik.dominance.repository;

import com.vlavik.dominance.model.Game;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GameRepository extends CrudRepository<Game, Long> {


}
