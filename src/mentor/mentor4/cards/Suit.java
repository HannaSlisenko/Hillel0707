package mentor.mentor4.cards;

public enum Suit {
    DIAMONDS(6),
    CLUBS(5),
    HEARTS(9),
    SPADES(7);

    private int cardCount;

    public int getCardCount() {
        return cardCount;
    }

    Suit(int cardCount) {
        this.cardCount = cardCount;


    }
}
