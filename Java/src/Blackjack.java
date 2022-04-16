/*
Category: Large Hand
If you have a pair of aces you must always split them.
If you have a Blackjack (two cards that sum up to a value of 21), and the dealer does not have an ace, a figure or a ten then you automatically win. If the dealer does have any of those cards then you'll have to stand and wait for the reveal of the other card.

Category: Small Hand
If your cards sum up to 17 or higher you should always stand.
If your cards sum up to 11 or lower you should always hit.
If your cards sum up to a value within the range [12, 16] you should always stand unless the dealer has a 7 or higher, in which case you should always hit.
*/

public class Blackjack {

    public int parseCard(String card) {
        return switch (card) {
            case "ten", "jack", "queen", "king" -> 10;
            case "ace" -> 11;
            case "two" -> 2;
            case "three" -> 3;
            case "four" -> 4;
            case "five" -> 5;
            case "six" -> 6;
            case "seven" -> 7;
            case "eight" -> 8;
            case "nine" -> 9;
            default -> 0;
        };
    }

    public boolean isBlackjack(String card1, String card2) {
        return (card1.equals("ten") || card1.equals("queen") || card1.equals("jack") || card1.equals("king")) && card2.equals("ace");
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        if (isBlackjack && dealerScore > 10) {
            return "S";
        } else if (isBlackjack && dealerScore < 10) {
            return "W";
        }else if (!isBlackjack && dealerScore <= 10){
            return "S";
        } else {
            return "P";
        }
    }

    public String smallHand(int handScore, int dealerScore) {
        if (handScore >= 17){
            return "S";
        } else if (handScore <= 11){
            return "H";
        } else if (handScore >= 12 && handScore <= 16) {
            if (dealerScore >= 7) {
                return "H";
            } else {
                return "S";
            }
        }
        return "S";
    }

    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }

    public static void main(String[] args) {
        Blackjack blackjack = new Blackjack();

        System.out.println(blackjack.firstTurn("ace", "king", "queen"));
    }
}