public class Card{
    final Suite suite;
    final Value value;
    private String suiteString, valueString;

    Card(Suite suite, Value value){
        this.suite = suite;
        this.value = value;
        generatetoString();
    }

    public String toString(){
        return valueString + " of " + suiteString;
    }
    private void generatetoString(){
        generateSuiteString();
        generateValueString();
    }

    private void generateSuiteString(){
        switch(suite){
            case DIAMONDS:
                suiteString = "Diamonds";
                break;
            case HEARTS:
                suiteString = "Hearts";
                break;
            case CLUBS:
                suiteString = "Clubs";
                break;
            case SPADES:
                suiteString = "Spades";
                break;
            default:
                /*
                *    LOL WTF?!?! I have no idea, what should actually be thrown here but that seems close?
                */
                //throw InvalidAttributesException;   
                break;
        }
    }

    // This is stupid, there has to be a better way
    private void generateValueString(){
        switch(value){
            case ACE:
                valueString = "Ace";
                break;
            case ONE:
                valueString = "One";
                break;
            case TWO:
                valueString = "Two";
                break;
            case THREE:
                valueString = "Three";
                break;
            case FOUR:
                valueString = "Four";
                break;
            case FIVE:
                valueString = "Five";
                break;
            case SIX:
                valueString = "Six";
                break;
            case SEVEN:
                valueString = "Seven";
                break;
            case EIGHT:
                valueString = "Eight";
                break;
            case NINE:
                valueString = "Nine";
                break;
            case TEN:
                valueString = "Ten";
                break;
            case JACK:
                valueString = "Jack";
                break;
            case QUEEN:
                valueString = "Queen";
                break;
            case KING:
                valueString = "King";
                break;
            default:
                /*
                *    Yea who knows...
                */
                //throw InvalidAttributesException;   
                break;
        }
    }
}