package com.vlavik.dominance.controller;

import com.vlavik.dominance.dto.GameDTO;
import com.vlavik.dominance.model.Game;
import com.vlavik.dominance.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/game")
public class GameController {

    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @PostMapping("/create")
    public Game createGame(@RequestBody GameDTO gameDTO) {
        Game game = new Game();
        return game;
    }

    @GetMapping("/list")
    public List<Game> getGameList() {
        return (List<Game>) gameService.getAllGames();
    }
}
