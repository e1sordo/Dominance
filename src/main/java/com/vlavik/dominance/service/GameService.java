package com.vlavik.dominance.service;

import com.vlavik.dominance.model.Game;
import com.vlavik.dominance.model.enums.GameStatus;
import com.vlavik.dominance.repository.GameRepository;
import com.vlavik.dominance.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class GameService {

    private final GameRepository gameRepository;
    private final UserRepository userRepository;

    @Autowired
    public GameService(GameRepository gameRepository, UserRepository userRepository) {
        this.gameRepository = gameRepository;
        this.userRepository = userRepository;
    }

    public Game createGame() {
        Game game = new Game();
        game.setPlayer(userRepository.findOne(1L));
        game.setGameStatus(GameStatus.IN_PROGRESS);
        game.setCreated(new Date());
        gameRepository.save(game);

        return game;
    }

    public Game updateGameStatus(Game game, GameStatus gameStatus) {
        Game g = getGame(game.getId());
        g.setGameStatus(gameStatus);

        return g;
    }

    public Game getGame(Long id) {
        return gameRepository.findOne(id);
    }

    public Iterable<Game> getAllGames() {
        return gameRepository.findAll();
    }
}
