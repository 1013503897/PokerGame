package Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardHeap {
    private List<Card> cardList;
    public CardHeap() {
        cardList = new ArrayList<Card>();
        for(int number=0;number<13;number++){
            for(int color=0;color<4;color++){
                cardList.add(new Card(color,number));
            }
        }
    }

    public void shuffle(){
        int size = cardList.size();
        Random random = new Random();
        System.out.println("开始洗牌...");
        for(int i = 0; i < size; i++) {
            int randomPos = random.nextInt(size);
            Card temp = cardList.get(i);
            cardList.set(i, cardList.get(randomPos));
            cardList.set(randomPos, temp);
        }
    }

    @Override
    public String toString() {
        return "现牌堆:"+cardList;
    }

    public Card deal(){
        Card card = cardList.get(1);
        cardList.remove(1);
        return card;
    }
}
