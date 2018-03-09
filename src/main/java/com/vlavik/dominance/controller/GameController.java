package com.vlavik.dominance.controller;

import com.vlavik.dominance.model.Game;
import com.vlavik.dominance.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/game")
public class GameController {

    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/create")
    public Game createGame() {
        return gameService.createGame();
    }

    @GetMapping("/list")
    public List<Game> getGameList() {
        return (List<Game>) gameService.getAllGames();
    }
}
