package dev.indrajeet.tictactoe_backend.Controller;

import dev.indrajeet.tictactoe_backend.exceptions.InvalidMoveException;
import enums.GameState;
import models.Game;
import models.Player;

import java.util.List;

public class GameController {
    public Game startGame(int dimension, List<Player> players) {
        return new Game(dimension, players);
    }

    public void makeMove(Game game) throws InvalidMoveException {
        game.makeMove();
    }

    public GameState checkState(Game game) {
        return game.getGameState();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public void printBoard(Game game) {
        game.printBoard();
    }
}
