import java.util.ArrayList;

class Deck{
    private ArrayList<Card> cardList;
    
    Deck(){
        ArrayList<Card> cardList = new ArrayList<Card>();
        for(Suite s: Suite.values()){
            for(Value v : Value.values()){
                cardList.add(new Card(s, v));
            }
        }
    }

    Card getSize(){
        return cardList.get(1);
    }

    // Remove the last card from the list
    Card draw(){
        return cardList.remove(cardList.size());
    }
}