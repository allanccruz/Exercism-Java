public class Blackjack {

    public int parseCard(String card) {

        Integer cardvalue = 0;

        switch (card) {

            case "ace" -> cardvalue = 11;
            case "two" -> cardvalue = 2;
            case "three" -> cardvalue = 3;
            case "four" -> cardvalue = 4;
            case "five" -> cardvalue = 5;
            case "six" -> cardvalue = 6;
            case "seven" -> cardvalue = 7;
            case "eight" -> cardvalue = 8;
            case "nine" -> cardvalue = 9;
            case "ten" -> cardvalue = 10;
            case "jack" -> cardvalue = 10;
            case "queen" -> cardvalue = 10;
            case "king" -> cardvalue = 10;

        }

        return cardvalue;
    }

    public boolean isBlackjack(String card1, String card2) {
        return parseCard(card1) + parseCard(card2) == 21;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        if (isBlackjack && dealerScore < 10) {
            return "W";
        }
        else if (isBlackjack) {
            return "S";
        }
        else return "P";
    }

    public String smallHand(int handScore, int dealerScore) {
        if (handScore >= 17) {
            return "S";
        }
        else if (handScore <= 11) {
            return "H";
        }
        else if (handScore < 17 && dealerScore < 7) {
            return "S";
        }
        else return "H";
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
