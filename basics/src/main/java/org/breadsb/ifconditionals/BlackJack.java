package org.breadsb.ifconditionals;

import java.util.*;

//https://exercism.org/tracks/java/exercises/blackjack
public class BlackJack {

    private final Map<String, Integer> cards = new HashMap<>();
    private final Random random = new Random();

    public BlackJack() {
        this.cards.put("ace", 11);
        this.cards.put("two", 2);
        this.cards.put("three", 3);
        this.cards.put("four", 4);
        this.cards.put("five", 5);
        this.cards.put("six", 6);
        this.cards.put("seven", 7);
        this.cards.put("eight", 8);
        this.cards.put("nine", 9);
        this.cards.put("ten", 10);
        this.cards.put("jack", 10);
        this.cards.put("queen", 10);
        this.cards.put("king", 10);
        this.cards.put("other", 0);
    }

    public Map<String, Integer> getAllCards() {
        return this.cards;
    }

    public String getRandomCard() {
        Object[] cardList = cards.keySet().toArray();
        return cardList[random.nextInt(cardList.length)].toString();
    }

    //player hand
    private final List<String> playerHand = new ArrayList<>();

    public void addCardOnPlayersHand() {
        boolean result = false;
        String randomCard = getRandomCard();
        if (cards.containsKey(randomCard)) {
            playerHand.add(randomCard);
            result = true;
        }
    }

    public List<String> getPlayerHand() {
        return playerHand;
    }

    public int getPlayerScore() {
        for(String element : playerHand) {
            playerScore+=cards.get(element);
        }
        return playerScore;
    }

    private int playerScore = 0;

    //dealer hand

    //hit

    //stand

    //double down

    //split
}
