package com.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;
    private int currentCardIndex;

    public Deck() {
        this.cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String suit : suits) {
            for (String value : values) {
                cards.add(new Card(suit, value));
            }
        }
        this.currentCardIndex = 0;
        shuffleDeck();
    }

    public void shuffleDeck() {
        Collections.shuffle(cards);
        currentCardIndex = 0;
    }

    public Card drawCard() {
        if (currentCardIndex < cards.size()) {
            return cards.get(currentCardIndex++);
        } else {
            throw new IllegalStateException("No more cards in the deck");
        }
    }

    public boolean hasCards() {
        return currentCardIndex < cards.size();
    }
}
