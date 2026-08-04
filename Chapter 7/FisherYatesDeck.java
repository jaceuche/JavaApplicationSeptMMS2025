import java.security.SecureRandom;

public class FisherYatesDeck {
    private Card[] deck;
    private int currentCard;
    private static final SecureRandom randomNumbers = new SecureRandom();

    public FisherYatesDeck() {
        deck = new Card[52];
        currentCard = 0;
        for (int count = 0; count < deck.length; count++) {
            deck[count] = new Card(DeckOfCards.FACES[count % 13], DeckOfCards.SUITS[count / 13]);
        }
    }

    // Fisher-Yates Shuffle implementation
    public void shuffle() {
        currentCard = 0;
        for (int i = deck.length - 1; i > 0; i--) {
            int j = randomNumbers.nextInt(i + 1);
            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }
}