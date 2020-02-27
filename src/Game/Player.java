package Game;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> cardList;
    private Card lastCard;
    public Player(String name){
        cardList = new ArrayList<Card>();
        this.name = name;
    }
    public void addCard(Card card){
        cardList.add(card);
        System.out.println("玩家:"+name+" 拿到了牌");
    }
    public Card playCard(){
        lastCard = java.util.Collections.max(cardList);
        System.out.println("玩家:"+name+" 出牌["+lastCard+"]");
        return lastCard;
    }
    public void isWinner(Card card){
        if(card.compareTo(lastCard)==0){
            System.out.println("获胜者为:"+name+" 出牌["+lastCard+"]");
        }
    }
    public void showCard(){
        System.out.println("玩家"+name+"手牌:"+cardList);
    }
}
