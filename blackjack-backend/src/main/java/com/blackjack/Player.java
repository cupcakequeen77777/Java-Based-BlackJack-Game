package com.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> hand;
    private int score;
    private boolean hasAce;  

    public Player() {
        this.hand = new ArrayList<>();
        this.score = 0;
        this.hasAce = false;
    }


    public void addCard(Card card) {
        hand.add(card);
        int cardValue = getCardValue(card);
        score += cardValue;

        if (card.getValue().equals("A")) {
            hasAce = true;
        }
        
        if (score > 21 && hasAce) {
            score -= 10;
            hasAce = false;
        }
    }

    public int getScore() {
        return score;
    }

    public void clearHand() {
        hand.clear();
        score = 0;
        hasAce = false;
    }

    private int getCardValue(Card card) {
        switch (card.getValue()) {
            case "A":
                return 11;
            case "K":
            case "Q":
            case "J":
                return 10;
            default:
                return Integer.parseInt(card.getValue());
        }
    }

    public List<Card> getHand() {
        return hand;
    }
}
