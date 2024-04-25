package dev.indrajeet.tictactoe_backend.exceptions;

public class InvalidMoveException extends Exception {
    public InvalidMoveException(String message) {
        super(message);
    }
}