import java.security.SecureRandom;
import java.util.Arrays;

public class DeckOfCards {
    private Card[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    private static final SecureRandom randomNumbers = new SecureRandom();

    public static final String[] FACES = {"Ace", "Deuce", "Three", "Four", "Five", "Six", 
                                          "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    public static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};

    public DeckOfCards() {
        deck = new Card[NUMBER_OF_CARDS];
        currentCard = 0;

        for (int count = 0; count < deck.length; count++) {
            deck[count] = new Card(FACES[count % 13], SUITS[count / 13]);
        }
    }

    public void shuffle() {
        currentCard = 0;
        for (int first = 0; first < deck.length; first++) {
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    public Card dealCard() {
        if (currentCard < deck.length) {
            return deck[currentCard++];
        } else {
            return null;
        }
    }

    // Helper method to count face frequencies
    private static int[] getFaceCounts(Card[] hand) {
        int[] counts = new int[13];
        for (Card card : hand) {
            for (int i = 0; i < FACES.length; i++) {
                if (card.getFace().equals(FACES[i])) {
                    counts[i]++;
                    break;
                }
            }
        }
        return counts;
    }

    // Hand evaluation methods
    public static boolean hasPair(Card[] hand) {
        int[] counts = getFaceCounts(hand);
        for (int count : counts) {
            if (count == 2) return true;
        }
        return false;
    }

    public static boolean hasTwoPairs(Card[] hand) {
        int[] counts = getFaceCounts(hand);
        int pairs = 0;
        for (int count : counts) {
            if (count == 2) pairs++;
        }
        return pairs == 2;
    }

    public static boolean hasThreeOfAKind(Card[] hand) {
        int[] counts = getFaceCounts(hand);
        for (int count : counts) {
            if (count == 3) return true;
        }
        return false;
    }

    public static boolean hasFourOfAKind(Card[] hand) {
        int[] counts = getFaceCounts(hand);
        for (int count : counts) {
            if (count == 4) return true;
        }
        return false;
    }

    public static boolean hasFlush(Card[] hand) {
        String suit = hand[0].getSuit();
        for (Card card : hand) {
            if (!card.getSuit().equals(suit)) return false;
        }
        return true;
    }

    public static boolean hasStraight(Card[] hand) {
        int[] counts = getFaceCounts(hand);
        for (int i = 0; i <= 8; i++) {
            if (counts[i] == 1 && counts[i+1] == 1 && counts[i+2] == 1 && 
                counts[i+3] == 1 && counts[i+4] == 1) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasFullHouse(Card[] hand) {
        return hasThreeOfAKind(hand) && hasPair(hand);
    }

    // Evaluates numerical rank of hand quality
    public static int evaluateHand(Card[] hand) {
        if (hasFourOfAKind(hand)) return 7;
        if (hasFullHouse(hand)) return 6;
        if (hasFlush(hand)) return 5;
        if (hasStraight(hand)) return 4;
        if (hasThreeOfAKind(hand)) return 3;
        if (hasTwoPairs(hand)) return 2;
        if (hasPair(hand)) return 1;
        return 0; // High card
    }
}