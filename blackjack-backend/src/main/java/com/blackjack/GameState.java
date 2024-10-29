package com.blackjack;

import java.util.List;

public class GameState {
    private List<Card> playerHand;
    private List<Card> dealerHand;
    private int playerScore;
    private int dealerScore;
    private boolean gameEnded;
    private String message;

    public GameState(List<Card> playerHand, List<Card> dealerHand, int playerScore, int dealerScore, boolean gameEnded, String message) {
        this.playerHand = playerHand;
        this.dealerHand = dealerHand;
        this.playerScore = playerScore;
        this.dealerScore = dealerScore;
        this.gameEnded = gameEnded;
        this.message = message;
    }

    public List<Card> getPlayerHand() {
        return playerHand;
    }

    public List<Card> getDealerHand() {
        return dealerHand;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public int getDealerScore() {
        return dealerScore;
    }

    public boolean isGameEnded() {
        return gameEnded;
    }

    public String getMessage() {
        return message;
    }
}
