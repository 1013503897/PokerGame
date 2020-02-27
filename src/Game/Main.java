package Game;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.print("请输入玩家数量:");
        Scanner scanner = new Scanner(System.in);
        int playerCount = scanner.nextInt();
        List<Player> playerList = new ArrayList<Player>();
        for(int i=1;i<=playerCount;i++)
        {
            System.out.print("请第"+i+"位玩家输入输入玩家姓名:" );
            playerList.add(new Player(scanner.next()));
        }
        System.out.println("现有玩家"+playerCount+"位，开始游戏！");
        CardHeap cardHeap = new CardHeap();
        System.out.println(cardHeap);
        cardHeap.shuffle();
        System.out.println(cardHeap);
        for(int i=0;i<3;i++){
            for(int j=0;j<playerCount;j++){
                playerList.get(j).addCard(cardHeap.deal());
            }
        }
        Card maxCard = new Card(0,0);
        for(int j=0;j<playerCount;j++){
            Card playerCard = playerList.get(j).playCard();
            if(playerCard.compareTo(maxCard)==1){
                maxCard = playerCard;
            }
        }
        for(int i=0;i<playerCount;i++){
            playerList.get(i).isWinner(maxCard);
        }
        for(int i=0;i<playerCount;i++){
            playerList.get(i).showCard();
        }
    }
}
